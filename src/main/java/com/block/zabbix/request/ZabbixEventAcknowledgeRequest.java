package com.block.zabbix.request;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jackson
 * @classname ZabbixEventAcknowledgeRequest
 * @description 更新事件的请求参数体
 * @date 2022/2/21 11:31
 */
public class ZabbixEventAcknowledgeRequest {

    private final Map<String, Object> params = new HashMap<>();

    public Map<String, Object> getParams() {
        return params;
    }

    public ZabbixEventAcknowledgeRequest setEventIds(List<String> eventIds){
        this.params.put("eventids",eventIds);
        return this;
    }

    public ZabbixEventAcknowledgeRequest setEventIds(String ... eventIds){
        return setEventIds(Arrays.asList(eventIds));
    }

    /**
     * 更新事件的操作。这是位掩码字段，可接受以下任何值的组合。
     * 可能值:
     * 1 - 关闭问题;
     * 2 - 确认事件;
     * 4 - 新增消息;
     * 8 - 更改严重等级。
     * @param actionId 掩码字段
     * @return 请求实体
     */
    public ZabbixEventAcknowledgeRequest setAction(int actionId){
        this.params.put("action",actionId);
        return this;
    }

    /**
     *
     * 如果操作包含'新增消息'标志，此选项必选。
     * @param message 消息文本
     * @return 请求实体
     */
    public ZabbixEventAcknowledgeRequest setMessage(String message){
        this.params.put("message",message);
        return this;
    }


    /**
     * 更改事件的严重等级
     * @param severity 事件的严重等级
     * @return 请求实体
     */
    public ZabbixEventAcknowledgeRequest setSeverity(int severity){
        this.params.put("severity",severity);
        return this;
    }


    @Override
    public String toString() {
        return "ZabbixEventAcknowledgeRequest{" +
                "params=" + params +
                '}';
    }
}
