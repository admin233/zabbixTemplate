package com.block.zabbix.request.action;

import com.block.zabbix.pojo.action.ActionFilter;
import com.block.zabbix.pojo.action.ActionOperations;
import com.block.zabbix.pojo.action.ActionRecoveryOperation;
import com.block.zabbix.request.ZabbixGenericRequest;

import java.util.Arrays;
import java.util.List;

public class ZabbixActionUpdateRequest extends ZabbixGenericRequest {

    public ZabbixActionUpdateRequest(String actionid) {
        super("actionid",actionid);
    }

    public ZabbixActionUpdateRequest setName(String name){
        addField("name",name);
        return this;
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
   public ZabbixActionUpdateRequest setEventsource(int eventsource){
        addField("eventsource", eventsource);
        return this;
    }

    /**
     * 动作是启动还是禁用。
     *
     * 取值：
     * 0 - (默认) 启用；
     * 1 - 禁用。
     */
   public ZabbixActionUpdateRequest setStatus(int status){
        addField("status", status);
        return this;
    }

    /**
     * 默认操作步骤持续时间。必须大于 60 秒。
     * 接受秒，带后缀的时间单位和用户宏。
     */
    public ZabbixActionUpdateRequest setEsc_period(String esc_period){
        addField("esc_period", esc_period);
        return this;
    }

    /**
     * 异常消息主题。
     */
    public ZabbixActionUpdateRequest setDef_shortdata(String def_shortdata){
        addField("def_shortdata", def_shortdata);
        return this;
    }

    /**
     * 异常消息文本。
     */
    public ZabbixActionUpdateRequest setDef_longdata(String def_longdata){
        addField("def_longdata", def_longdata);
        return this;
    }

    /**
     * 动作的动作过滤器对象。
     */
    public ZabbixActionUpdateRequest setFilter(ActionFilter filter){
        addField("filter", filter);
        return this;
    }

    /**
     * 	为动作创建的动作操作。
     */
    public ZabbixActionUpdateRequest setOperations(ActionOperations... operations){
        return setOperations(Arrays.asList(operations));
    }

    public ZabbixActionUpdateRequest setOperations(List<ActionOperations> operations){
        addField("operations", operations);
        return this;
    }

    /**
     * 	为动作创建动作恢复操作。
     */
    public ZabbixActionUpdateRequest setRecovery_operations(ActionRecoveryOperation ... recovery_operations){
        return setRecovery_operations(Arrays.asList(recovery_operations));
    }

    public ZabbixActionUpdateRequest setRecovery_operations(List<ActionRecoveryOperation> recovery_operations){
        addField("recovery_operations", recovery_operations);
        return this;
    }

    /**
     * 	为动作创建动作确认操作。
     * 	TODO:acknowledge_operations
     */
    public ZabbixActionUpdateRequest setAcknowledge_operations(Object... acknowledge_operations){
        return setAcknowledge_operations(Arrays.asList(acknowledge_operations));
    }

    public ZabbixActionUpdateRequest setAcknowledge_operations(List<Object> acknowledge_operations){
        addField("acknowledge_operations", acknowledge_operations);
        return this;
    }

}
