package com.block.zabbix.request;

public class ZabbixUserDelRequest extends ZabbixGenericDelRequest<String>{

    public ZabbixUserDelRequest() {
        super();
    }

    public ZabbixUserDelRequest(String ... value) {
        super(value);
    }
}
