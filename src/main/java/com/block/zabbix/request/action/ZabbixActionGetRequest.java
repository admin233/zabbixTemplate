package com.block.zabbix.request.action;

import com.block.zabbix.request.ZabbixGenericRequest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ZabbixActionGetRequest extends ZabbixGenericRequest{

    public ZabbixActionGetRequest() {
        super();
        this.params.put("output", "extend");
        this.params.put("selectOperations", "extend");
        this.params.put("selectRecoveryOperations", "extend");
        this.params.put("selectAcknowledgeOperations", "extend");
        this.params.put("selectFilter", "extend");
    }

    /**
     * (constant) 动作将处理的事件的类型。
     * 可能的值:
     * 0 - 由触发器创建的事件;
     * 1 - 由发现规则创建的事件;
     * 2 - active agent自动注册的事件;
     * 3 - 内部事件.
     * https://www.zabbix.com/documentation/5.0/zh/manual/api/reference/event/object#event
     * @param eventsource
     * @return
     */
    public ZabbixActionGetRequest setFilterEventsource(int eventsource){
        return addFilter("eventsource", eventsource);
    }

    public ZabbixActionGetRequest setFilterName(String ... name){
        return addFilter("name", Arrays.asList(name));
    }

    public ZabbixActionGetRequest addFilter(String filterName,Object o){
        Map<String, Object> add_filter = new HashMap<>();
        add_filter.put(filterName,o);
        Object filter_Object = this.params.get("filter");
        Map<String, Object> filter = new HashMap<>();
        if (filter_Object != null) {
            filter = (Map<String, Object>) filter_Object;
        }
        filter.putAll(add_filter);
        this.params.put("filter", filter);
        return this;
    }

    private ZabbixGenericRequest setSelect(String filterName,String ... filter){
        if(filter.length>0) {
            this.params.put(filterName, Arrays.asList(filter));
        }
        return this;
    }

    /**
     * 返回动作属性中操作属性。
     * @param selectOperations
     * @return
     */
    public ZabbixGenericRequest setSelectOperations(String ... selectOperations) {
        return setSelect("selectOperations",selectOperations);
    }

    /**
     * 返回 过滤 属性中的动作筛选器。
     * @param selectFilter
     * @return
     */
    public ZabbixGenericRequest setSelectFilter(String ... selectFilter) {
        return setSelect("selectFilter",selectFilter);
    }

    /**
     * 在 恢复操作 属性中返回动作恢复操作。
     * @param selectRecoveryOperations
     * @return
     */
    public ZabbixGenericRequest setSelectRecoveryOperations(String ... selectRecoveryOperations) {
        return setSelect("selectRecoveryOperations",selectRecoveryOperations);
    }
}
