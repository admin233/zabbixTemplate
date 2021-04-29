package src;

import com.block.zabbix.ZabbixTemplate;
import com.block.zabbix.api.ZabbixGetItemsByHostResponse;
import com.block.zabbix.api.ZabbixHistoryGetResponse;
import com.block.zabbix.api.ZabbixHostGetResponse;
import org.junit.Before;
import org.junit.Test;

import src.ReadProperties;

import java.util.Date;
import java.util.List;

public class ZabbixTemplateTest {

    private String userId = ReadProperties.get("user");

    private String url = ReadProperties.get("url");

    private String password = ReadProperties.get("password");
    ZabbixTemplate zabbixTemplate;

    @Before
    public void init() {
        zabbixTemplate = new ZabbixTemplate(url,userId,password);
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
    public void getItemSByHostTest() {
        List<ZabbixGetItemsByHostResponse> zabbixGetItemsByHostResponse = zabbixTemplate.getItemsByHost("10084");
        zabbixGetItemsByHostResponse.stream().forEach(o -> System.out.println(o.getItemid() + "---" + o.getHostid()+"--"+o.getName()));
    }

    @Test
    public void historyGetTest() {
        List<ZabbixHistoryGetResponse> zabbixGetItemsByHostResponse = zabbixTemplate.historyGet(1,1619428899,1619472973,"29200");
        zabbixGetItemsByHostResponse.stream().forEach(o -> System.out.println(o.getItemid() + "---" + o.getValue()+"--"+o.getClock()));

        System.out.println("时间转换"+new Date(1619428899));
    }


}