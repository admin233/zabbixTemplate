package com.block.zabbix.pojo.action;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * User groups to send messages to.
 *
 * Each object has the following properties:
 * operationid - (string) ID of the operation;
 * usrgrpid - (string) ID of the user group.
 *
 * Required for message operations if opmessage_usr is not set.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionOpmessage_grp {

    String operationid;
    String usrgrpid;

    public ActionOpmessage_grp(String operationid, String usrgrpid) {
        this.operationid = operationid;
        this.usrgrpid = usrgrpid;
    }

    public String getOperationid() {
        return operationid;
    }

    public void setOperationid(String operationid) {
        this.operationid = operationid;
    }

    public String getUsrgrpid() {
        return usrgrpid;
    }

    public void setUsrgrpid(String usrgrpid) {
        this.usrgrpid = usrgrpid;
    }
}
