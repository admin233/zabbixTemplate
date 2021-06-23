package com.block.zabbix.pojo.action;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Host to run remote commands on.
 *
 * Each object has the following properties:
 * opcommand_hstid - (string, readonly) ID of the object;
 * operationid - (string) ID of the operation;
 * hostid - (string) ID of the host; if set to 0 the command will be run on the current host.
 *
 * Required for remote command operations if opcommand_grp is not set.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionOpcommand_hst {
    String opcommand_hstid;
    String operationid;
    String hostid;

    public ActionOpcommand_hst(String operationid, String hostid) {
        this.operationid = operationid;
        this.hostid = hostid;
    }

    public String getOpcommand_hstid() {
        return opcommand_hstid;
    }

    public void setOpcommand_hstid(String opcommand_hstid) {
        this.opcommand_hstid = opcommand_hstid;
    }

    public String getOperationid() {
        return operationid;
    }

    public void setOperationid(String operationid) {
        this.operationid = operationid;
    }

    public String getHostid() {
        return hostid;
    }

    public void setHostid(String hostid) {
        this.hostid = hostid;
    }
}
