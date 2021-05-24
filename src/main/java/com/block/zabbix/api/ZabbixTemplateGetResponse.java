package com.block.zabbix.api;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ZabbixTemplateGetResponse {
    private String proxy_hostid ;
    private String host ;
    private String status ;
    private String disable_until ;
    private String error ;
    private String available ;
    private String errors_from ;
    private String lastaccess ;
    private String ipmi_authtype ;
    private String ipmi_privilege ;
    private String ipmi_username ;
    private String ipmi_password ;
    private String ipmi_disable_until ;
    private String ipmi_available ;
    private String snmp_disable_until ;
    private String snmp_available ;
    private String maintenanceid ;
    private String maintenance_status ;
    private String maintenance_type ;
    private String maintenance_from ;
    private String ipmi_errors_from ;
    private String snmp_errors_from ;
    private String ipmi_error ;
    private String snmp_error ;
    private String jmx_disable_until ;
    private String jmx_available ;
    private String jmx_errors_from ;
    private String jmx_error ;
    private String name ;
    private String flags ;
    private String templateid ;
    private String description ;
    private String tls_connect ;
    private String tls_accept ;
    private String tls_issuer ;
    private String tls_subject ;
    private String tls_psk_identity ;
    private String tls_psk ;

    public String getProxy_hostid() {
        return proxy_hostid;
    }

    public void setProxy_hostid(String proxy_hostid) {
        this.proxy_hostid = proxy_hostid;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDisable_until() {
        return disable_until;
    }

    public void setDisable_until(String disable_until) {
        this.disable_until = disable_until;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getErrors_from() {
        return errors_from;
    }

    public void setErrors_from(String errors_from) {
        this.errors_from = errors_from;
    }

    public String getLastaccess() {
        return lastaccess;
    }

    public void setLastaccess(String lastaccess) {
        this.lastaccess = lastaccess;
    }

    public String getIpmi_authtype() {
        return ipmi_authtype;
    }

    public void setIpmi_authtype(String ipmi_authtype) {
        this.ipmi_authtype = ipmi_authtype;
    }

    public String getIpmi_privilege() {
        return ipmi_privilege;
    }

    public void setIpmi_privilege(String ipmi_privilege) {
        this.ipmi_privilege = ipmi_privilege;
    }

    public String getIpmi_username() {
        return ipmi_username;
    }

    public void setIpmi_username(String ipmi_username) {
        this.ipmi_username = ipmi_username;
    }

    public String getIpmi_password() {
        return ipmi_password;
    }

    public void setIpmi_password(String ipmi_password) {
        this.ipmi_password = ipmi_password;
    }

    public String getIpmi_disable_until() {
        return ipmi_disable_until;
    }

    public void setIpmi_disable_until(String ipmi_disable_until) {
        this.ipmi_disable_until = ipmi_disable_until;
    }

    public String getIpmi_available() {
        return ipmi_available;
    }

    public void setIpmi_available(String ipmi_available) {
        this.ipmi_available = ipmi_available;
    }

    public String getSnmp_disable_until() {
        return snmp_disable_until;
    }

    public void setSnmp_disable_until(String snmp_disable_until) {
        this.snmp_disable_until = snmp_disable_until;
    }

    public String getSnmp_available() {
        return snmp_available;
    }

    public void setSnmp_available(String snmp_available) {
        this.snmp_available = snmp_available;
    }

    public String getMaintenanceid() {
        return maintenanceid;
    }

    public void setMaintenanceid(String maintenanceid) {
        this.maintenanceid = maintenanceid;
    }

    public String getMaintenance_status() {
        return maintenance_status;
    }

    public void setMaintenance_status(String maintenance_status) {
        this.maintenance_status = maintenance_status;
    }

    public String getMaintenance_type() {
        return maintenance_type;
    }

    public void setMaintenance_type(String maintenance_type) {
        this.maintenance_type = maintenance_type;
    }

    public String getMaintenance_from() {
        return maintenance_from;
    }

    public void setMaintenance_from(String maintenance_from) {
        this.maintenance_from = maintenance_from;
    }

    public String getIpmi_errors_from() {
        return ipmi_errors_from;
    }

    public void setIpmi_errors_from(String ipmi_errors_from) {
        this.ipmi_errors_from = ipmi_errors_from;
    }

    public String getSnmp_errors_from() {
        return snmp_errors_from;
    }

    public void setSnmp_errors_from(String snmp_errors_from) {
        this.snmp_errors_from = snmp_errors_from;
    }

    public String getIpmi_error() {
        return ipmi_error;
    }

    public void setIpmi_error(String ipmi_error) {
        this.ipmi_error = ipmi_error;
    }

    public String getSnmp_error() {
        return snmp_error;
    }

    public void setSnmp_error(String snmp_error) {
        this.snmp_error = snmp_error;
    }

    public String getJmx_disable_until() {
        return jmx_disable_until;
    }

    public void setJmx_disable_until(String jmx_disable_until) {
        this.jmx_disable_until = jmx_disable_until;
    }

    public String getJmx_available() {
        return jmx_available;
    }

    public void setJmx_available(String jmx_available) {
        this.jmx_available = jmx_available;
    }

    public String getJmx_errors_from() {
        return jmx_errors_from;
    }

    public void setJmx_errors_from(String jmx_errors_from) {
        this.jmx_errors_from = jmx_errors_from;
    }

    public String getJmx_error() {
        return jmx_error;
    }

    public void setJmx_error(String jmx_error) {
        this.jmx_error = jmx_error;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getTemplateid() {
        return templateid;
    }

    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTls_connect() {
        return tls_connect;
    }

    public void setTls_connect(String tls_connect) {
        this.tls_connect = tls_connect;
    }

    public String getTls_accept() {
        return tls_accept;
    }

    public void setTls_accept(String tls_accept) {
        this.tls_accept = tls_accept;
    }

    public String getTls_issuer() {
        return tls_issuer;
    }

    public void setTls_issuer(String tls_issuer) {
        this.tls_issuer = tls_issuer;
    }

    public String getTls_subject() {
        return tls_subject;
    }

    public void setTls_subject(String tls_subject) {
        this.tls_subject = tls_subject;
    }

    public String getTls_psk_identity() {
        return tls_psk_identity;
    }

    public void setTls_psk_identity(String tls_psk_identity) {
        this.tls_psk_identity = tls_psk_identity;
    }

    public String getTls_psk() {
        return tls_psk;
    }

    public void setTls_psk(String tls_psk) {
        this.tls_psk = tls_psk;
    }
}
