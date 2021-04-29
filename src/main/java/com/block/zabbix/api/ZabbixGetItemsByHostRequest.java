package com.block.zabbix.api;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jackson
 * @name zabbixTemplate
 * @Description
 * @date 2021/4/28
 */
public class ZabbixGetItemsByHostRequest {

    private Map<String, Object> params = new HashMap<>();

    public Map<String, Object> getParams() {
        return params;
    }

    public ZabbixGetItemsByHostRequest addField(String fieldName, Object fieldValue) {
        this.params.put(fieldName, fieldValue);
        return this;
    }

    public ZabbixGetItemsByHostRequest setFilter(Map<String,String> map) {
        this.params.putAll(map);
        return this;
    }

    public ZabbixGetItemsByHostRequest setHostId(String ...hostId) {
        return this.setHostId(Arrays.asList(hostId));
    }

    public ZabbixGetItemsByHostRequest setHostId(List<String> hostLists) {
        this.params.put("hostids",hostLists);
        return this;
    }

}
