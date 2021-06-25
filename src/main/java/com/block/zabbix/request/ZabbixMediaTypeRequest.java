package com.block.zabbix.request;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZabbixMediaTypeRequest extends ZabbixGenericRequest{

    public ZabbixMediaTypeRequest(){
        super();
    }

    public ZabbixMediaTypeRequest setFilterNames(String... names) {
        return this.setFilterNames(Arrays.asList(names));
    }

    public ZabbixMediaTypeRequest setFilterNames(List<String> names) {
        Object filter_Object = this.params.get("filter");
        Map<String, Object> filter = new HashMap<>();
        if(filter_Object != null) {
            filter = (Map<String, Object>) filter_Object;
        }
        filter.put("name", names);
        this.params.put("filter", filter);
        return this;
    }

    public ZabbixMediaTypeRequest setUserids(String ... userids){
        return setUserids(Arrays.asList(userids));
    }

    public ZabbixMediaTypeRequest setUserids(List<String> userids){
        addField("userids",userids);
        return this;
    }
}
