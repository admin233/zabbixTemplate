package com.block.zabbix.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ZabbixEventGetResponse {

    @JsonProperty("eventid")
    public String eventid;
    @JsonProperty("source")
    public String source;
    @JsonProperty("object")
    public String object;
    @JsonProperty("objectid")
    public String objectid;
    @JsonProperty("clock")
    public String clock;
    @JsonProperty("value")
    public String value;
    @JsonProperty("acknowledged")
    public String acknowledged;
    @JsonProperty("ns")
    public String ns;
    @JsonProperty("name")
    public String name;
    @JsonProperty("severity")
    public String severity;
    @JsonProperty("r_eventid")
    public String rEventid;
    @JsonProperty("c_eventid")
    public String cEventid;
    @JsonProperty("correlationid")
    public String correlationid;
    @JsonProperty("userid")
    public String userid;

}
