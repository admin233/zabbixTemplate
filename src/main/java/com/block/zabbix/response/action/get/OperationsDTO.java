package com.block.zabbix.response.action.get;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 动作操作
 * 动作操作对象定义执行动作时执行的操作。
 */
public class OperationsDTO {
    /**
     * 	(readonly) 动作操作的 ID。
     */
    @JsonProperty("operationid")
    public String operationid;
    /**
     * 操作所属的动作的 ID。
     */
    @JsonProperty("actionid")
    public String actionid;
    /**
     * 操作类型
     *
     * 可能的值：
     * 0 - 发送消息;
     * 1 - 远程命令;
     * 2 - 添加主机;
     * 3 - 删除主机;
     * 4 - 添加到主机组;
     * 5 - 从主机组删除;
     * 6 - 链接到模板;
     * 7 - 取消与模板的关联;
     * 8 - 启用主机;
     * 9 - 禁用主机;
     * 10 - 设置主机库存模式。
     */
    @JsonProperty("operationtype")
    public String operationtype;
    /**
     * 以秒为单位的升级步骤的持续时间。必须大于 60 秒。接受秒，时间单位后缀和用户宏。如果设置为 0 或0s，则将使用默认的动作升级周期。
     * 默认: 0s.
     * 请注意，升级仅支持触发器和内部操作。在触发器操作中，问题恢复和更新操作不支持升级。
     */
    @JsonProperty("esc_period")
    public String escPeriod;
    /**
     * 启示步骤。
     * 默认: 1.
     * 请注意，升级仅支持触发器和内部操作。在触发器操作中，问题恢复和更新操作不支持升级。
     */
    @JsonProperty("esc_step_from")
    public String escStepFrom;
    /**
     * 结束步骤。
     * 默认: 1.
     * 请注意，升级仅支持触发器和内部操作。在触发器操作中，问题恢复和更新操作不支持升级。
     */
    @JsonProperty("esc_step_to")
    public String escStepTo;
    /**
     * 运行状态计算方法。
     *
     * 可能的值:
     * 0 - (默认) AND / OR;
     * 1 - AND;
     * 2 - OR.
     */
    @JsonProperty("evaltype")
    public String evaltype;
    /**
     * 用于触发动作的操作条件
     */
    @JsonProperty("opconditions")
    public List<ActionOperationConditionDTO> opconditions;
    /**
     * 包含有关操作发送的消息的数据的对象。
     *
     * 消息操作必需。
     */
    @JsonProperty("opmessage")
//    public List<OpmessageDTO> opmessage;
    public OpmessageDTO opmessage;

    /**
     * 要发送消息的用户组。
     *
     * 每个对象都具有以下属性：
     * operationid - (string) 操作 ID;
     * usrgrpid - (string) 用户组的ID。
     *
     * 如果未设置 opmessage_usr，则消息操作必需。
     */
    @JsonProperty("opmessage_grp")
    public List<OpmessageGrpDTO> opmessageGrp;

    /**
     * 发送消息的用户。
     *
     * 每个对象具有以下属性:
     * operationid - (string) 操作的 ID;
     * userid - (string) 用户 ID.
     *
     * 必要 如果未设置“opmessage_grp”，则用于消息操作。
     */
    @JsonProperty("opmessage_usr")
    public List<OpmessageUsrDTO> opmessage_usr;

}
