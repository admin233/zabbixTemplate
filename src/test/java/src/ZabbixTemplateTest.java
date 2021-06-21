package src;

import com.block.zabbix.ZabbixTemplate;
import com.block.zabbix.pojo.ZabbixInterface;
import com.block.zabbix.pojo.ZabbixTag;
import com.block.zabbix.pojo.ZabbixUserMedia;
import com.block.zabbix.request.*;
import com.block.zabbix.response.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class ZabbixTemplateTest {

    private String userId = ReadProperties.get("user");

    private String url = ReadProperties.get("url");

    private String password = ReadProperties.get("password");

    ZabbixTemplate zabbixTemplate;

    ObjectMapper mapper;

    @Before
    public void init() {
        zabbixTemplate = new ZabbixTemplate(url,userId,password);
        /**
         * ObjectMapper是JSON操作的核心，Jackson的所有JSON操作都是在ObjectMapper中实现。
         * ObjectMapper有多个JSON序列化的方法，可以把JSON字符串保存File、OutputStream等不同的介质中。
         * writeValue(File arg0, Object arg1)把arg1转成json序列，并保存到arg0文件中。
         * writeValue(OutputStream arg0, Object arg1)把arg1转成json序列，并保存到arg0输出流中。
         * writeValueAsBytes(Object arg0)把arg0转成json序列，并把结果输出成字节数组。
         * writeValueAsString(Object arg0)把arg0转成json序列，并把结果输出成字符串。
         */
        mapper = new ObjectMapper();
    }


    @Test
    public void getAuthTest() {
        String auth = zabbixTemplate.getAuth();
        System.out.println(auth);
    }

    @Test
    public void getAllHostTest() {
        List<ZabbixHostGetResponse> zabbixHostGetResponse = zabbixTemplate.hostGetAll();
        zabbixHostGetResponse.stream().forEach(o -> System.out.println(o.getHost() + "---" + o.getHostid()));
    }


    @Test
    public void getItemsByHostTest() {
        List<ZabbixItemGetResponse> zabbixGetItemsByHostResponse = zabbixTemplate.getItemsByHost("10084");
        zabbixGetItemsByHostResponse.stream().forEach(o -> System.out.println(o.getItemid() + "---" + o.getHostid()+"--"+o.getName()));
    }

    @Test
    public void historyGetTest() {
        List<ZabbixHistoryGetResponse> zabbixGetItemsByHostResponse = zabbixTemplate.historyGet(1,1619428899,1619472973,"29200");
        zabbixGetItemsByHostResponse.stream().forEach(o -> System.out.println(o.getItemid() + "---" + o.getValue()+"--"+o.getClock()));

        System.out.println("时间转换"+new Date(1619428899));
    }

    @Test
    public void hostGroup() throws Exception{
        List<ZabbixHostGroupGetResponse>  result = zabbixTemplate.hostGroupGet("demoHostGroup2");
        result.forEach(o -> {
            try {
                String json = mapper.writeValueAsString(o);
                System.out.println(json);
            }catch (Exception e){
                e.printStackTrace();
            }
        });

//        ZabbixHostGroupGenericResponse response = zabbixTemplate.hostGroupCreate("demoHostGroup2");
//        System.out.println(response.getGroupids().get(0));
    }

    @Test
    public void hostGroupCreate() throws Exception{
        ZabbixHostGroupGenericResponse result = zabbixTemplate.hostGroupCreate("testgruop");
        result.getGroupids().forEach(o ->{
            try {
                String json = mapper.writeValueAsString(o);
                System.out.println(json);
            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }

    @Test
    public void hostGet() throws Exception{
        List<ZabbixHostGetResponse> resultList = zabbixTemplate.hostGet("test");
//        List<ZabbixHostGetResponse> resultList = zabbixTemplate.hostGetAll();
        resultList.forEach(o ->{
            try{
                String json = mapper.writeValueAsString(o);
                System.out.println(json);
            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }

    @Test
    public void hostCreate() throws Exception{
        //创建主机请求
        ZabbixHostCreateRequest zabbixHostCreateRequest = new ZabbixHostCreateRequest();
        //主机接口
        ZabbixInterface zabbixInterface = new ZabbixInterface();
        zabbixInterface.setIp("192.168.8.8").setPort("10086").setMain(1);
        //主机标签
        ZabbixTag zabbixTag = new ZabbixTag("a","b");

        zabbixHostCreateRequest.setHost("demo_linux_server1")
                .setGroupsIds("19").setTemplateIds("10343").setInterface(zabbixInterface).setProxyid("10398").setTags(zabbixTag)
                .setPskIdentityAndPskPw("1233211234567", UUID.randomUUID().toString().replace("-",""));
        ZabbixHostGenericResponse response = zabbixTemplate.hostCreate(zabbixHostCreateRequest);
        response.getHostids().forEach(o ->{
            try{
                String json = mapper.writeValueAsString(o);
                System.out.println(json);
            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }

    @Test
    public void hostDelete()throws Exception{
        ZabbixHostGenericResponse response = zabbixTemplate.hostDelete("10408");
        System.out.println(response.getHostids().size());
        response.getHostids().forEach(o->{
            System.out.println(o);
        });
    }

    @Test
    public void hostUpdate()throws Exception{
        ZabbixHostUpdateRequest zabbixHostUpdateRequest = new ZabbixHostUpdateRequest();
        zabbixHostUpdateRequest.setHostid("10409");
        zabbixHostUpdateRequest.setStatus(1);//1禁用 0启用
        ZabbixHostGenericResponse zabbixHostGenericResponse = zabbixTemplate.hostUpdate(zabbixHostUpdateRequest);
        System.out.println(zabbixHostGenericResponse.getHostids().size());
        zabbixHostGenericResponse.getHostids().forEach(o->{
            System.out.println(o);
        });
    }

    @Test
    public void hostInterfaceGet() throws Exception{
        List<ZabbixHostGetResponse> resultList = zabbixTemplate.hostGet("test1");
        List<ZabbixHostInterfaceGetResponse> resultList2 = zabbixTemplate.hostInterfaceGet(resultList.get(0).getHostid());
//        List<ZabbixHostInterfaceGetResponse> resultList2 = zabbixTemplate.hostInterfaceGet("10408");
        resultList2.forEach(o ->{
            try{
                String json = mapper.writeValueAsString(o);
                System.out.println(json);
            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }

    @Test
    public void templateGet() throws Exception{
//        List<ZabbixTemplateGetResponse> resultList = zabbixTemplate.getTemplateByName("Linux by Zabbix agent active","Windows by Zabbix agent active","Generic Java JMX");
        List<ZabbixTemplateGetResponse> resultList = zabbixTemplate.getTemplateByName("Template OS Windows by Zabbix agent active");
//        List<ZabbixTemplateGetResponse> resultList = zabbixTemplate.getTemplateByHostids("10396","10084");

        resultList.forEach(o ->{
            try{
                String json = mapper.writeValueAsString(o);
                System.out.println(json);
            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }

    @Test
    public void proxyGet() throws Exception{
//        List<ZabbixProxyGetResponse> resultList = zabbixTemplate.proxyGetAll();
        ZabbixProxyGetRequest zabbixProxyGetRequest = new ZabbixProxyGetRequest();
        zabbixProxyGetRequest.setFilterHosts("zabbix_proxy01");
        List<ZabbixProxyGetResponse> resultList = zabbixTemplate.proxyGet(zabbixProxyGetRequest);
        resultList.forEach(o->{
            try{
                String json = mapper.writeValueAsString(o);
                System.out.println(json);
            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }

    @Test
    public void mediaType() throws Exception{
        List<ZabbixMediaTypeGetResponse> resultList = zabbixTemplate.mediaTypeGet("Email (HTML)");
        resultList.forEach(o->{
            try{
                String json = mapper.writeValueAsString(o);
                System.out.println(json);
            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }

    @Test
    public void userGroupGet() throws Exception{
//        List<ZabbixUserGroupGetResponse> resultList = zabbixTemplate.userGroupGetById("7");
        List<ZabbixUserGroupGetResponse> resultList = zabbixTemplate.userGroupGet();
        resultList.forEach(o->{
            try{
                String json = mapper.writeValueAsString(o);
                System.out.println(json);
            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }

    @Test
    public void userGroupAdd() throws Exception{
        ZabbixUserGroupCreateRequest zabbixUserGroupCreateRequest = new ZabbixUserGroupCreateRequest();
        zabbixUserGroupCreateRequest.setName("demo").addReadOnlyHostGroup("18");
        ZabbixUserGroupGenericResponse response = zabbixTemplate.userGroupCreate(zabbixUserGroupCreateRequest);
        response.getUsrgrpids().forEach(o ->{
            System.out.println(o);
        });
    }

    @Test
    public void userGroupDel() throws Exception{
        ZabbixUserGroupDelRequest zabbixUserGroupDelRequest = new ZabbixUserGroupDelRequest("14");
        zabbixUserGroupDelRequest.add("13");
        ZabbixUserGroupGenericResponse response = zabbixTemplate.userGroupDel(zabbixUserGroupDelRequest);
        response.getUsrgrpids().forEach(o ->{
            System.out.println(o);
        });
    }

    @Test
    public void userGroupUpdate() throws Exception{
        ZabbixUserGroupUpdateRequest zabbixUserGroupUpdateRequest = new ZabbixUserGroupUpdateRequest("14");
        zabbixUserGroupUpdateRequest.setUsers_status(0).setName("demo").addReadOnlyHostGroup("18");
        ZabbixUserGroupGenericResponse response = zabbixTemplate.userGroupUpdate(zabbixUserGroupUpdateRequest);
        response.getUsrgrpids().forEach(o ->{
            System.out.println(o);
        });
    }

    @Test
    public void userGet() throws Exception{
        List<ZabbixUserGetResponse> responset = zabbixTemplate.userGetByAlias("demo");
        responset.forEach(o -> {
            try {
                String json = mapper.writeValueAsString(o);
                System.out.println(json);
            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }

    @Test
    public void userCreate() throws Exception{
        ZabbixUserMedia<List<String>> zabbixUserMedia = new ZabbixUserMedia<List<String>>();
        zabbixUserMedia.setMediatypeid("4");
        List<String> list = new ArrayList<>();
        list.add("abc@abvv.com");
        zabbixUserMedia.setSendto(list);

        ZabbixUserCreateRequest request = new ZabbixUserCreateRequest();
        request.setAlias("demo").setPasswd("123456").setUsrgrps("14").setUser_medias(zabbixUserMedia);
        ZabbixUserGenericResponse response = zabbixTemplate.userCreate(request);
        String json = mapper.writeValueAsString(response);
        System.out.println(json);
    }

    @Test
    public void userDel() throws Exception{
        ZabbixUserDelRequest request = new ZabbixUserDelRequest("5");
        ZabbixUserGenericResponse response = zabbixTemplate.userDel(request);
        String json = mapper.writeValueAsString(response);
        System.out.println(json);
    }

    @Test
    public void userUpdate() throws Exception{
        ZabbixUserMedia<List<String>> zabbixUserMedia = new ZabbixUserMedia<List<String>>();
        zabbixUserMedia.setMediatypeid("4");
        List<String> list = new ArrayList<>();
        list.add("abc@abvv.com");
        zabbixUserMedia.setSendto(list);

        ZabbixUserUpdateRequest request = new ZabbixUserUpdateRequest("6");
//        request.setUser_medias(zabbixUserMedia);
        request.setUsrgrps("15");
        ZabbixUserGenericResponse response = zabbixTemplate.userUpdate(request);
        String json = mapper.writeValueAsString(response);
        System.out.println(json);

    }

}

