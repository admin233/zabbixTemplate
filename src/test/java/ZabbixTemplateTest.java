package java;

import com.block.zabbix.ZabbixTemplate;
import com.block.zabbix.api.ZabbixGetItemsByHostResponse;
import com.block.zabbix.api.ZabbixHistoryGetResponse;
import com.block.zabbix.api.ZabbixHostGetResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ZabbixTemplateTest {


    ZabbixTemplate zabbixTemplate;

    @Before
    public void init() {

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
    }


}