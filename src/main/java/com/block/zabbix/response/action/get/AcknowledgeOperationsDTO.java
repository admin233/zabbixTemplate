package com.block.zabbix.response.action.get;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 动作操作
 * 在 确认操作 属性中返回动作确认操作。
 */
public class AcknowledgeOperationsDTO {

    /**
     * (readonly) 动作操作的 ID。
     */
    @JsonProperty("operationid")
    public String operationid;

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
     * 包含有关操作发送的消息的数据的对象。
     * 操作消息对象是 在下面有详细描述.
     * 消息操作必需。
     */
    @JsonProperty("opmessage")
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
     * 	发送消息给的用户。
     *
     * 每个对象都具有以下属性：
     * operationid - (string) 操作 ID;
     * userid - (string) 用户的ID。
     *
     * 如果未设置 opmessage_grp，则消息操作必需。
     */
    @JsonProperty("opmessage_usr")
    public List<OpmessageUsrDTO> opmessageUsr;

    /**
     * 包含操作所运行的命令的数据。
     * 远程命令操作所需的。
     */
    @JsonProperty("opcommand")
    public OpcommandDTO opcommand;

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
    @JsonProperty("opcommand_hst")
    public List<OpcommandHstDTO> opcommandHst;

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
    @JsonProperty("opcommand_grp")
    public List<OpcommandGrpDTO> opcommandGrp;
}
