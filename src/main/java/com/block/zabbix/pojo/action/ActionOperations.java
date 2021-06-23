package com.block.zabbix.pojo.action;

import java.util.List;

/**
 * 动作操作
 * 动作操作对象定义执行动作时执行的操作。
 */
public class ActionOperations {

    /**
     * (readonly) 动作操作的 ID。
     */
    public String operationid;
    /**
     * 操作类型
     * (required)
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
    public int operationtype;
    /**
     * 操作所属的动作的 ID。
     */
    public String actionid;
    /**
     * 以秒为单位的升级步骤的持续时间。必须大于 60 秒。接受秒，时间单位后缀和用户宏。如果设置为 0 或0s，则将使用默认的动作升级周期。
     * 默认: 0s.
     * 请注意，升级仅支持触发器和内部操作。在触发器操作中，问题恢复和更新操作不支持升级。
     */
    public String esc_period;
    /**
     * 启示步骤。
     * 默认: 1.
     * 请注意，升级仅支持触发器和内部操作。在触发器操作中，问题恢复和更新操作不支持升级。
     */
    public int esc_step_from;
    /**
     * 结束步骤。
     * 默认: 1.
     * 请注意，升级仅支持触发器和内部操作。在触发器操作中，问题恢复和更新操作不支持升级。
     */
    public int esc_step_to;
    /**
     * 运行状态计算方法。
     *
     * 可能的值:
     * 0 - (默认) AND / OR;
     * 1 - AND;
     * 2 - OR.
     */
    public int evaltype;
    /**
     * 包含操作所运行的命令的数据。
     *
     * 操作命令对象是 在下面有详细描述.
     *
     * 远程命令操作所需的。
     */
    public ActionOperationCommand opcommand;
    /**
     * 运行远程命令的主机组。
     *
     * 每个对象具有以下属性：
     * opcommand_grpid - (string, readonly) 对象的 ID;
     * operationid - (string) 操作 ID；
     * groupid - (string) 主机组的 ID。
     *
     * 如果没有设置 opcommand_hst，则需要远程命令操作。
     */
    public List<ActionOpcommand_grp> opcommand_grp;
    /**
     * 主机上运行远程命令。
     *
     * 每个对象具有以下属性：
     * opcommand_hstid - (string, readonly) 对象的 ID;
     * operationid - (string) 操作 ID;
     * hostid - (string) 主机 ID; 如果设置为 0，则命令将在当前主机上运行。
     *
     * 如果没有设置 opcommand_grp，则需要远程命令操作。
     */
    public List<ActionOpcommand_hst> opcommand_hst;
    /**
     * 用于触发动作的操作条件
     *
     * 操作条件对象是 下面详细描述.
     */
    public List<ActionOperationCondition> opconditions;
    /**
     * 用于添加主机的主机组。
     *
     * 每个对象都具有以下属性:
     * operationid - (string) 操作 ID;
     * groupid - (string) 主机组的 ID。
     *
     * 添加到主机组 和 从主机组中删除 操作所必需的。
     */
    public List<ActionOpgroup> opgroup;
    /**
     * 包含有关操作发送的消息的数据的对象。
     *
     * 操作消息对象是 在下面有详细描述.
     *
     * 消息操作必需。
     */
    public ActionOperationMessage opmessage;
    /**
     * 要发送消息的用户组。
     *
     * 每个对象都具有以下属性：
     * operationid - (string) 操作 ID;
     * usrgrpid - (string) 用户组的ID。
     *
     * 如果未设置 opmessage_usr，则消息操作必需。
     */
    public List<ActionOpmessage_grp> opmessage_grp;
    /**
     * 发送消息给的用户。
     *
     * 每个对象都具有以下属性：
     * operationid - (string) 操作 ID;
     * userid - (string) 用户的ID。
     *
     * 如果未设置 opmessage_grp，则消息操作必需。
     */
    public List<ActionOpmessage_usr> opmessage_usr;
    /**
     * 用于将主机链接到的模板。
     *
     * 每个对象都具有以下属性：
     * operationid - (string) 操作 ID;
     * templateid - (string) 模板 ID.
     *
     * 必须有 “绑定模板” 和 “解绑模板” 操作
     */
    public List<ActionOptemplate> optemplate;
    /**
     * 库存模式设置主机。
     *
     * 每个对象都具有以下属性:
     * operationid - (string) 操作 ID;
     * inventory_mode - (string) Inventory mode.
     *
     * 需要有 “Set host inventory mode” 操作。
     */
    public Object ActionOpinventory;







}
