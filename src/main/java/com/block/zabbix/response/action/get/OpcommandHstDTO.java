package com.block.zabbix.response.action.get;

import com.fasterxml.jackson.annotation.JsonProperty;

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
public class OpcommandHstDTO {
    @JsonProperty("hostid")
    public String hostid;

    @JsonProperty("operationid")
    public String operationid;

    @JsonProperty("opcommand_hstid ")
    public String opcommand_hstid ;
}
