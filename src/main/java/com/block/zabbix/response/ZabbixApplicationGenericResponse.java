package com.block.zabbix.response;

import java.util.List;

public class ZabbixApplicationGenericResponse {

    private List<String> applicationids;

    public List<String> getApplicationids() {
        return applicationids;
    }

    public void setApplicationids(List<String> applicationids) {
        this.applicationids = applicationids;
    }
}
