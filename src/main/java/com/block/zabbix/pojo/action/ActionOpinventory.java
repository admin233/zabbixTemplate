package com.block.zabbix.pojo.action;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Inventory mode set host to.
 *
 * Object has the following properties:
 * operationid - (string) ID of the operation;
 * inventory_mode - (string) Inventory mode.
 *
 * Required for “Set host inventory mode” operations.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionOpinventory {

    String operationid;
    String inventory_mode;

    public ActionOpinventory(String operationid, String inventory_mode) {
        this.operationid = operationid;
        this.inventory_mode = inventory_mode;
    }

    public String getOperationid() {
        return operationid;
    }

    public void setOperationid(String operationid) {
        this.operationid = operationid;
    }

    public String getInventory_mode() {
        return inventory_mode;
    }

    public void setInventory_mode(String inventory_mode) {
        this.inventory_mode = inventory_mode;
    }
}
