package com.block.zabbix.request;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZabbixUserGroupGetRequest extends ZabbixGenericRequest{

    public ZabbixUserGroupGetRequest() {
        super();
        this.params.put("output", "extend");
    }

    public ZabbixUserGroupGetRequest setStatus(int status){
        this.params.put("status",status);
        return this;
    }

    public ZabbixUserGroupGetRequest setUsrgrpids(String ... setUsrgrpids){
        return this.setUsrgrpids(setUsrgrpids.length>0?Arrays.asList(setUsrgrpids):null);
    }

    public ZabbixUserGroupGetRequest setUsrgrpids(List<String> usrgrpids){
        if(usrgrpids!=null && usrgrpids.size()>0) {
            this.params.put("usrgrpids", usrgrpids);
        }
        return this;
    }

    public ZabbixUserGroupGetRequest setFilterNames(String... names) {
        return this.setFilterNames(names.length>0?Arrays.asList(names):null);
    }

    public ZabbixUserGroupGetRequest setFilterNames(List<String> names) {
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

}
