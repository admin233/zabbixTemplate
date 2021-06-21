package com.block.zabbix.request;

public class ZabbixUserGroupDelRequest extends ZabbixGenericDelRequest<String>{

    public ZabbixUserGroupDelRequest() {
        super();
    }

    public ZabbixUserGroupDelRequest(String ... value) {
        super(value);
    }
}
