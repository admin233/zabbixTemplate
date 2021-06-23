package com.block.zabbix.pojo.action;

import java.util.List;

/**
 * The action recovery operation object defines an operation that will be performed when a problem is resolved.
 * Recovery operations are possible for
 * trigger actions and internal actions.
 */
public class ActionRecoveryOperation {
    /**
     * (readonly) ID of the action operation.
     */
    String operationid;
    /**
     * Type of operation.
     * (required)
     * Possible values for trigger actions:
     * 0 - send message;
     * 1 - remote command;
     * 11 - notify all involved.
     *
     * Possible values for internal actions:
     * 0 - send message;
     * 11 - notify all involved.
     */
    int operationtype;
    /**
     * ID of the action that the recovery operation belongs to.
     */
    String actionid;
    /**
     * Object containing the data about the command run by the recovery operation.
     *
     * Required for remote command operations.
     */
    ActionOperationCommand opcommand;
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
    List<ActionOpcommand_grp> opcommand_grp;
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
    List<ActionOpcommand_hst> opcommand_hst;
    /**
     * Object containing the data about the message sent by the recovery operation.
     *
     * Required for message operations.
     */
    ActionOperationMessage opmessage;
    /**
     * User groups to send messages to.
     *
     * Each object has the following properties:
     * operationid - (string) ID of the operation;
     * usrgrpid - (string) ID of the user group.
     *
     * Required for message operations if opmessage_usr is not set.
     */
    List<ActionOpmessage_grp> opmessage_grp;
    /**
     * Users to send messages to.
     *
     * Each object has the following properties:
     * operationid - (string) ID of the operation;
     * userid - (string) ID of the user.
     *
     * Required for message operations if opmessage_grp is not set.
     */
    List<ActionOpmessage_usr> opmessage_usr;
}
