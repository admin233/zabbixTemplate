package com.block.zabbix.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author jackson
 * @classname ZabbixEventAcknowledgeResponse
 * @description 更新事件的响应实体
 * @date 2022/2/21 11:43
 */
public class ZabbixEventAcknowledgeResponse {

    @JsonProperty("eventids")
    private List<String> eventIds;

    public List<String> getEventIds() {
        return eventIds;
    }

    public void setEventIds(List<String> eventIds) {
        this.eventIds = eventIds;
    }

    @Override
    public String toString() {
        return "ZabbixEventAcknowledgeResponse{" +
                "eventIds=" + eventIds +
                '}';
    }
}
