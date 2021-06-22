package com.block.zabbix.response.action.get;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OpmessageGrpDTO {
    @JsonProperty("usrgrpid")
    public String usrgrpid;

    @JsonProperty("operationid")
    public String operationid;
}
