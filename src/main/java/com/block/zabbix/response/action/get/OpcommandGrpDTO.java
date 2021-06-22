package com.block.zabbix.response.action.get;

import com.fasterxml.jackson.annotation.JsonProperty;

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
public class OpcommandGrpDTO {
    @JsonProperty("groupid")
    public String groupid;

    @JsonProperty("operationid")
    public String operationid;

    @JsonProperty("opcommand_grpid")
    public String opcommand_grpid;
}
