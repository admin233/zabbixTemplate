package com.block.zabbix.response.action.get;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ZabbixActionsGetResponse {
    /**
     * 返回给定 ID 的动作
     */
    @JsonProperty("actionid")
    public String actionid;

    @JsonProperty("name")
    public String name;

    /**
     * (constant) 动作将处理的事件的类型。
     * 参见  event[事件]属性 以获取支持的事件类型列表。
     *
     * 可能的值:
     * 0 - 由触发器创建的事件;
     * 1 - 由发现规则创建的事件;
     * 2 - active agent自动注册的事件;
     * 3 - 内部事件.
     */
    @JsonProperty("eventsource")
    public String eventsource;

    /**
     * 动作是启动还是禁用。
     *
     * 取值：
     * 0 - (默认) 启用；
     * 1 - 禁用。
     */
    @JsonProperty("status")
    public String status;

    /**
     * 默认操作步骤持续时间。必须大于 60 秒。
     * 接受秒，带后缀的时间单位和用户宏。
     */
    @JsonProperty("esc_period")
    public String escPeriod;

    /**
     * 是否在维护期间暂停升级。
     *
     * 可能的值：
     * 0 - 不要暂停升级;
     * 1 - (默认) 暂停升级。
     */
    @JsonProperty("pause_suppressed")
    public String pauseSuppressed;

    /**
     * 动作过滤对象
     */
    @JsonProperty("filter")
    public ActioFilterDTO filter;

    /**
     * 动作操作
     * 在 确认操作 属性中返回动作确认操作。
     */
    @JsonProperty("acknowledgeOperations")
    public List<AcknowledgeOperationsDTO> acknowledgeOperations;

    /**
     * 动作操作
     * 动作操作对象定义执行动作时执行的操作。
     */
    @JsonProperty("operations")
    public List<OperationsDTO> operations;

    /**
     * 动作恢复操作
     * 动作恢复操作对象定义将在解决问题时执行的操作。 可以对触发操作和内部操作执行恢复操作。
     */
    @JsonProperty("recoveryOperations")
    public List<RecoveryOperationsDTO> recoveryOperations;
}
