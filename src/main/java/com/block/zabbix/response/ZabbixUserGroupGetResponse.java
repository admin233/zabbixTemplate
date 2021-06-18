package com.block.zabbix.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ZabbixUserGroupGetResponse {

    @JsonProperty("usrgrpid")
    public String usrgrpid;
    @JsonProperty("name")
    public String name;
    @JsonProperty("gui_access")
    public String guiAccess;
    @JsonProperty("users_status")
    public String usersStatus;
    @JsonProperty("debug_mode")
    public String debugMode;

    public String getUsrgrpid() {
        return usrgrpid;
    }

    public void setUsrgrpid(String usrgrpid) {
        this.usrgrpid = usrgrpid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuiAccess() {
        return guiAccess;
    }

    public void setGuiAccess(String guiAccess) {
        this.guiAccess = guiAccess;
    }

    public String getUsersStatus() {
        return usersStatus;
    }

    public void setUsersStatus(String usersStatus) {
        this.usersStatus = usersStatus;
    }

    public String getDebugMode() {
        return debugMode;
    }

    public void setDebugMode(String debugMode) {
        this.debugMode = debugMode;
    }
}
