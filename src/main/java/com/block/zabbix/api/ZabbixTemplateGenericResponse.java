package com.block.zabbix.api;

import java.util.List;

public class ZabbixTemplateGenericResponse {

    private List<String> templateids;

    public List<String> getTemplateids() {
        return templateids;
    }

    public void setTemplateids(List<String> templateids) {
        this.templateids = templateids;
    }
}
