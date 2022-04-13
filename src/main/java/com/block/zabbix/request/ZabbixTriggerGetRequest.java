package com.block.zabbix.request;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZabbixTriggerGetRequest extends ZabbixGenericRequest {

    public ZabbixTriggerGetRequest() {
        super();
    }

    public ZabbixTriggerGetRequest setFilterNames(List<String> names) {
        if(names!=null && names.size()>0) {
            Object filter_Object = this.params.get("filter");
            Map<String, Object> filter = new HashMap<>();
            if (filter_Object != null) {
                filter = (Map<String, Object>) filter_Object;
            }
            filter.put("description", names);
            this.params.put("filter", filter);
        }
        return this;
    }

    public ZabbixTriggerGetRequest setFilterNames(String... names) {
        return this.setFilterNames(names.length>0? Arrays.asList(names):null);
    }

    public ZabbixTriggerGetRequest setHostids(String... hostids) {
        return setHostids(Arrays.asList(hostids));
    }

    public ZabbixTriggerGetRequest setHostids(List<String> hostids) {
        addField("hostids", hostids);
        return this;
    }

    public ZabbixTriggerGetRequest setTriggerids(List<String> triggerids){
        addField("triggerids",triggerids);
        return this;
    }

    public ZabbixTriggerGetRequest setTriggerids(String ... triggerids){
        return setTriggerids(Arrays.asList(triggerids));
    }
}
