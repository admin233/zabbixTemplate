package com.block.zabbix.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ZabbixMediaTypeGetResponse {

    @JsonProperty("mediatypeid")
    public String mediatypeid;
    @JsonProperty("type")
    public String type;
    @JsonProperty("description")
    public String description;
    @JsonProperty("smtp_server")
    public String smtpServer;
    @JsonProperty("smtp_helo")
    public String smtpHelo;
    @JsonProperty("smtp_email")
    public String smtpEmail;
    @JsonProperty("exec_path")
    public String execPath;
    @JsonProperty("gsm_modem")
    public String gsmModem;
    @JsonProperty("username")
    public String username;
    @JsonProperty("passwd")
    public String passwd;
    @JsonProperty("status")
    public String status;
    @JsonProperty("maxsessions")
    public String maxsessions;
    @JsonProperty("maxattempts")
    public String maxattempts;
    @JsonProperty("attempt_interval")
    public String attemptInterval;

    public String getMediatypeid() {
        return mediatypeid;
    }

    public void setMediatypeid(String mediatypeid) {
        this.mediatypeid = mediatypeid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSmtpServer() {
        return smtpServer;
    }

    public void setSmtpServer(String smtpServer) {
        this.smtpServer = smtpServer;
    }

    public String getSmtpHelo() {
        return smtpHelo;
    }

    public void setSmtpHelo(String smtpHelo) {
        this.smtpHelo = smtpHelo;
    }

    public String getSmtpEmail() {
        return smtpEmail;
    }

    public void setSmtpEmail(String smtpEmail) {
        this.smtpEmail = smtpEmail;
    }

    public String getExecPath() {
        return execPath;
    }

    public void setExecPath(String execPath) {
        this.execPath = execPath;
    }

    public String getGsmModem() {
        return gsmModem;
    }

    public void setGsmModem(String gsmModem) {
        this.gsmModem = gsmModem;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMaxsessions() {
        return maxsessions;
    }

    public void setMaxsessions(String maxsessions) {
        this.maxsessions = maxsessions;
    }

    public String getMaxattempts() {
        return maxattempts;
    }

    public void setMaxattempts(String maxattempts) {
        this.maxattempts = maxattempts;
    }

    public String getAttemptInterval() {
        return attemptInterval;
    }

    public void setAttemptInterval(String attemptInterval) {
        this.attemptInterval = attemptInterval;
    }
}
