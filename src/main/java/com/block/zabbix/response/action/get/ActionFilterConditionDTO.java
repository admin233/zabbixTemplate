package com.block.zabbix.response.action.get;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActionFilterConditionDTO {

    @JsonProperty("conditiontype")
    public String conditiontype;

    @JsonProperty("operator")
    public String operator;

    @JsonProperty("value")
    public String value;

    @JsonProperty("value2")
    public String value2;

    @JsonProperty("formulaid")
    public String formulaid;

    @JsonProperty("conditionid")
    public String conditionid;

    @JsonProperty("actionid")
    public String actionid;

}
