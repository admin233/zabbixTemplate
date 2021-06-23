package com.block.zabbix.pojo.action;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Templates to link the hosts to to.
 *
 * Each object has the following properties:
 * operationid - (string) ID of the operation;
 * templateid - (string) ID of the template.
 *
 * Required for “link to template” and “unlink from template” operations.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionOptemplate {

    String operationid;
    String templateid;

    public ActionOptemplate(String operationid, String templateid) {
        this.operationid = operationid;
        this.templateid = templateid;
    }

    public String getOperationid() {
        return operationid;
    }

    public void setOperationid(String operationid) {
        this.operationid = operationid;
    }

    public String getTemplateid() {
        return templateid;
    }

    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }
}
