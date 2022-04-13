package com.block.zabbix.response;

import java.util.List;

public class ZabbixTriggerGenericResponse {

    private List<String> triggerids;

    public List<String> getTriggerids() {
        return triggerids;
    }

    public void setTriggerids(List<String> triggerids) {
        this.triggerids = triggerids;
    }
}
