package com.block.zabbix.request;

import java.util.HashMap;
import java.util.Map;

public class ZabbixApplicationCreateRequest {

    public ZabbixApplicationCreateRequest() {
        super();
    }

    public Map<String, Object> params = new HashMap<>();

    public Map<String, Object> getParams() {
        return params;
    }

    public ZabbixApplicationCreateRequest addField(String fieldName, Object fieldValue) {
        this.params.put(fieldName, fieldValue);
        return this;
    }

    public ZabbixApplicationCreateRequest setName(String name){
        this.params.put("name", name);
        return this;
    }

    public ZabbixApplicationCreateRequest setHostid(String hostid){
        this.params.put("hostid", hostid);
        return this;
    }
}
