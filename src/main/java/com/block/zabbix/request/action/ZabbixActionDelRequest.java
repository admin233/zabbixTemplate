package com.block.zabbix.request.action;

import com.block.zabbix.request.ZabbixGenericDelRequest;

public class ZabbixActionDelRequest extends ZabbixGenericDelRequest<String>{

    public ZabbixActionDelRequest() {
        super();
    }

    public ZabbixActionDelRequest(String ... value) {
        super(value);
    }
}
