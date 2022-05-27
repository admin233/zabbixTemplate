package com.block.zabbix.request;

public class ZabbixMacroDelRequest extends ZabbixGenericDelRequest<String> {

    public String macroType;

    public ZabbixMacroDelRequest(){
        super();
    }

    public ZabbixMacroDelRequest(String macroType) {
        this.macroType = macroType;
    }

    public ZabbixMacroDelRequest addIds(String ... values){
        add(values);
        return this;
    }
}
