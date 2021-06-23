package com.block.zabbix.pojo.action;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Host groups to add hosts to.
 *
 * Each object has the following properties:
 * operationid - (string) ID of the operation;
 * groupid - (string) ID of the host group.
 *
 * Required for “add to host group” and “remove from host group” operations.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionOpgroup {
    String operationid;
    String groupid;

    public ActionOpgroup(String operationid, String groupid) {
        this.operationid = operationid;
        this.groupid = groupid;
    }

    public String getOperationid() {
        return operationid;
    }

    public void setOperationid(String operationid) {
        this.operationid = operationid;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }
}
