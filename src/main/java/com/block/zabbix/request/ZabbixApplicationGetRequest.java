package com.block.zabbix.request;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZabbixApplicationGetRequest extends ZabbixGenericRequest{

    public ZabbixApplicationGetRequest setFilterNames(List<String> names) {
        if(names!=null && names.size()>0) {
            Object filter_Object = this.params.get("filter");
            Map<String, Object> filter = new HashMap<>();
            if (filter_Object != null) {
                filter = (Map<String, Object>) filter_Object;
            }
            filter.put("name", names);
            this.params.put("filter", filter);
        }
        return this;
    }

    public ZabbixApplicationGetRequest setFilterNames(String ... names) {
        return setFilterNames(Arrays.asList(names));
    }

    public ZabbixApplicationGetRequest setApplicationids(List<String> applicationids){
        this.params.put("applicationids",applicationids);
        return this;
    }

    public ZabbixApplicationGetRequest setApplicationids(String ... applicationids){
        return setApplicationids(Arrays.asList(applicationids));
    }

    public ZabbixApplicationGetRequest setHostids(List<String> hostids){
        this.params.put("hostids",hostids);
        return this;
    }

    public ZabbixApplicationGetRequest setHostids(String ... hostids){
        return setHostids(Arrays.asList(hostids));
    }
}
