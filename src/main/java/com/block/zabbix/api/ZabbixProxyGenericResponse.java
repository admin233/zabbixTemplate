package com.block.zabbix.api;

import java.util.List;

public class ZabbixProxyGenericResponse {

    private List<String> proxyids;

    public List<String> getProxyids() {
        return proxyids;
    }

    public void setProxyids(List<String> proxyids) {
        this.proxyids = proxyids;
    }
}
