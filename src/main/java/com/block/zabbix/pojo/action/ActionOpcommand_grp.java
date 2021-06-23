package com.block.zabbix.pojo.action;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Host groups to run remote commands on.
 *
 * Each object has the following properties:
 * opcommand_grpid - (string, readonly) ID of the object;
 * operationid - (string) ID of the operation;
 * groupid - (string) ID of the host group.
 *
 * Required for remote command operations if opcommand_hst is not set.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionOpcommand_grp extends ActionOpgroup{

    String opcommand_grpid;

    public ActionOpcommand_grp(String operationid, String groupid) {
        super(operationid,groupid);
    }

    public String getOpcommand_grpid() {
        return opcommand_grpid;
    }

    public void setOpcommand_grpid(String opcommand_grpid) {
        this.opcommand_grpid = opcommand_grpid;
    }

}
