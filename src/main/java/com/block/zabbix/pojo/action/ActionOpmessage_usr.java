package com.block.zabbix.pojo.action;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Users to send messages to.
 *
 * Each object has the following properties:
 * operationid - (string) ID of the operation;
 * userid - (string) ID of the user.
 *
 * Required for message operations if opmessage_grp is not set.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionOpmessage_usr {

    String operationid;
    String userid;

    public ActionOpmessage_usr(String operationid, String userid) {
        this.operationid = operationid;
        this.userid = userid;
    }

    public String getOperationid() {
        return operationid;
    }

    public void setOperationid(String operationid) {
        this.operationid = operationid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
