package com.block.zabbix.response;

import com.block.zabbix.pojo.ZabbixTag;

import java.util.List;

public class ZabbixTriggerGetResponse {

    public List<Functions> functions;
    public String triggerid;
    public String expression;
    public String description;
    public String url;
    public String status;
    public String value;
    public String priority;
    public String lastchange;
    public String comments;
    public String error;
    public String templateid;
    public String type;
    public String state;
    public String flags;
    public String recovery_mode;
    public String recovery_expression;
    public String correlation_mode;
    public String correlation_tag;
    public String manual_close;
    public List<ZabbixTag> tags;

    public List<Functions> getFunctions() {
        return functions;
    }

    public void setFunctions(List<Functions> functions) {
        this.functions = functions;
    }

    public String getTriggerid() {
        return triggerid;
    }

    public void setTriggerid(String triggerid) {
        this.triggerid = triggerid;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getLastchange() {
        return lastchange;
    }

    public void setLastchange(String lastchange) {
        this.lastchange = lastchange;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getTemplateid() {
        return templateid;
    }

    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getRecovery_mode() {
        return recovery_mode;
    }

    public void setRecovery_mode(String recovery_mode) {
        this.recovery_mode = recovery_mode;
    }

    public String getRecovery_expression() {
        return recovery_expression;
    }

    public void setRecovery_expression(String recovery_expression) {
        this.recovery_expression = recovery_expression;
    }

    public String getCorrelation_mode() {
        return correlation_mode;
    }

    public void setCorrelation_mode(String correlation_mode) {
        this.correlation_mode = correlation_mode;
    }

    public String getCorrelation_tag() {
        return correlation_tag;
    }

    public void setCorrelation_tag(String correlation_tag) {
        this.correlation_tag = correlation_tag;
    }

    public String getManual_close() {
        return manual_close;
    }

    public void setManual_close(String manual_close) {
        this.manual_close = manual_close;
    }

    public List<ZabbixTag> getTags() {
        return tags;
    }

    public void setTags(List<ZabbixTag> tags) {
        this.tags = tags;
    }

    public static class Functions {
        public String functionid;
        public String itemid;
        public String function;
        public String parameter;

        public String getFunctionid() {
            return functionid;
        }

        public void setFunctionid(String functionid) {
            this.functionid = functionid;
        }

        public String getItemid() {
            return itemid;
        }

        public void setItemid(String itemid) {
            this.itemid = itemid;
        }

        public String getFunction() {
            return function;
        }

        public void setFunction(String function) {
            this.function = function;
        }

        public String getParameter() {
            return parameter;
        }

        public void setParameter(String parameter) {
            this.parameter = parameter;
        }
    }
}
