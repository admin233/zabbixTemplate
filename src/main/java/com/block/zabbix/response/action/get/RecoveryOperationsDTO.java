package com.block.zabbix.response.action.get;

import com.block.zabbix.pojo.action.ActionOperationCondition;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 动作恢复操作
 * 动作恢复操作对象定义将在解决问题时执行的操作。 可以对触发操作和内部操作执行恢复操作。
 */
public class RecoveryOperationsDTO {
    /**
     * (只读) 动作操作的 ID。
     */
    @JsonProperty("operationid")
    public String operationid;
    /**
     * 恢复操作所属的动作的ID。
     */
    @JsonProperty("actionid")
    public String actionid;
    /**
     * 操作的类型
     *
     * 触发动作的可能值:
     * 0 - 发送信息;
     * 1 - 远程命令;
     * 11 - 通知所有参与者。
     *
     * 内部操作的可能值:
     * 0 - 发送信息;
     * 11 - 通知所有参与者。
     */
    @JsonProperty("operationtype")
    public String operationtype;
    /**
     * 过滤条件评估方法。
     *
     * 可能值:
     * 0 - and/or;
     * 1 - and;
     * 2 - or;
     * 3 - 自定义表达式。
     */
    @JsonProperty("evaltype")
    public String evaltype;
    /**
     * 用于触发动作的操作条件
     */
    @JsonProperty("opconditions")
    public List<ActionOperationCondition> opconditions;
    /**
     * 对象，该对象包含有关恢复操作发送的消息的数据。
     * 操作消息对象是 described in detail above.
     * 必要 用于消息操作。
     */
    @JsonProperty("opmessage")
    public OpmessageDTO opmessage;
}
