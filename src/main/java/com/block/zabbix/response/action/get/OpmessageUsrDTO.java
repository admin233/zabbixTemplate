package com.block.zabbix.response.action.get;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OpmessageUsrDTO {
    @JsonProperty("userid")
    public String userid;

    @JsonProperty("operationid")
    public String operationid;
}
