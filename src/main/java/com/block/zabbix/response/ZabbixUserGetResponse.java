package com.block.zabbix.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ZabbixUserGetResponse {


    @JsonProperty("userid")
    public String userid;
    @JsonProperty("alias")
    public String alias;
    @JsonProperty("name")
    public String name;
    @JsonProperty("surname")
    public String surname;
    @JsonProperty("url")
    public String url;
    @JsonProperty("autologin")
    public String autologin;
    @JsonProperty("autologout")
    public String autologout;
    @JsonProperty("lang")
    public String lang;
    @JsonProperty("refresh")
    public String refresh;
    @JsonProperty("type")
    public String type;
    @JsonProperty("theme")
    public String theme;
    @JsonProperty("attempt_failed")
    public String attemptFailed;
    @JsonProperty("attempt_ip")
    public String attemptIp;
    @JsonProperty("attempt_clock")
    public String attemptClock;
    @JsonProperty("rows_per_page")
    public String rowsPerPage;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAutologin() {
        return autologin;
    }

    public void setAutologin(String autologin) {
        this.autologin = autologin;
    }

    public String getAutologout() {
        return autologout;
    }

    public void setAutologout(String autologout) {
        this.autologout = autologout;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getRefresh() {
        return refresh;
    }

    public void setRefresh(String refresh) {
        this.refresh = refresh;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getAttemptFailed() {
        return attemptFailed;
    }

    public void setAttemptFailed(String attemptFailed) {
        this.attemptFailed = attemptFailed;
    }

    public String getAttemptIp() {
        return attemptIp;
    }

    public void setAttemptIp(String attemptIp) {
        this.attemptIp = attemptIp;
    }

    public String getAttemptClock() {
        return attemptClock;
    }

    public void setAttemptClock(String attemptClock) {
        this.attemptClock = attemptClock;
    }

    public String getRowsPerPage() {
        return rowsPerPage;
    }

    public void setRowsPerPage(String rowsPerPage) {
        this.rowsPerPage = rowsPerPage;
    }
}
