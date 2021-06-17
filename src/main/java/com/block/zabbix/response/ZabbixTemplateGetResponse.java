package com.block.zabbix.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ZabbixTemplateGetResponse {
    @JsonProperty("proxy_hostid")
    public String proxyHostid;
    @JsonProperty("host")
    public String host;
    @JsonProperty("status")
    public String status;
    @JsonProperty("disable_until")
    public String disableUntil;
    @JsonProperty("error")
    public String error;
    @JsonProperty("available")
    public String available;
    @JsonProperty("errors_from")
    public String errorsFrom;
    @JsonProperty("lastaccess")
    public String lastaccess;
    @JsonProperty("ipmi_authtype")
    public String ipmiAuthtype;
    @JsonProperty("ipmi_privilege")
    public String ipmiPrivilege;
    @JsonProperty("ipmi_username")
    public String ipmiUsername;
    @JsonProperty("ipmi_password")
    public String ipmiPassword;
    @JsonProperty("ipmi_disable_until")
    public String ipmiDisableUntil;
    @JsonProperty("ipmi_available")
    public String ipmiAvailable;
    @JsonProperty("snmp_disable_until")
    public String snmpDisableUntil;
    @JsonProperty("snmp_available")
    public String snmpAvailable;
    @JsonProperty("maintenanceid")
    public String maintenanceid;
    @JsonProperty("maintenance_status")
    public String maintenanceStatus;
    @JsonProperty("maintenance_type")
    public String maintenanceType;
    @JsonProperty("maintenance_from")
    public String maintenanceFrom;
    @JsonProperty("ipmi_errors_from")
    public String ipmiErrorsFrom;
    @JsonProperty("snmp_errors_from")
    public String snmpErrorsFrom;
    @JsonProperty("ipmi_error")
    public String ipmiError;
    @JsonProperty("snmp_error")
    public String snmpError;
    @JsonProperty("jmx_disable_until")
    public String jmxDisableUntil;
    @JsonProperty("jmx_available")
    public String jmxAvailable;
    @JsonProperty("jmx_errors_from")
    public String jmxErrorsFrom;
    @JsonProperty("jmx_error")
    public String jmxError;
    @JsonProperty("name")
    public String name;
    @JsonProperty("flags")
    public String flags;
    @JsonProperty("templateid")
    public String templateid;
    @JsonProperty("description")
    public String description;
    @JsonProperty("tls_connect")
    public String tlsConnect;
    @JsonProperty("tls_accept")
    public String tlsAccept;
    @JsonProperty("tls_issuer")
    public String tlsIssuer;
    @JsonProperty("tls_subject")
    public String tlsSubject;
    @JsonProperty("tls_psk_identity")
    public String tlsPskIdentity;
    @JsonProperty("tls_psk")
    public String tlsPsk;

    public String getProxyHostid() {
        return proxyHostid;
    }

    public void setProxyHostid(String proxyHostid) {
        this.proxyHostid = proxyHostid;
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

    public String getDisableUntil() {
        return disableUntil;
    }

    public void setDisableUntil(String disableUntil) {
        this.disableUntil = disableUntil;
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

    public String getErrorsFrom() {
        return errorsFrom;
    }

    public void setErrorsFrom(String errorsFrom) {
        this.errorsFrom = errorsFrom;
    }

    public String getLastaccess() {
        return lastaccess;
    }

    public void setLastaccess(String lastaccess) {
        this.lastaccess = lastaccess;
    }

    public String getIpmiAuthtype() {
        return ipmiAuthtype;
    }

    public void setIpmiAuthtype(String ipmiAuthtype) {
        this.ipmiAuthtype = ipmiAuthtype;
    }

    public String getIpmiPrivilege() {
        return ipmiPrivilege;
    }

    public void setIpmiPrivilege(String ipmiPrivilege) {
        this.ipmiPrivilege = ipmiPrivilege;
    }

    public String getIpmiUsername() {
        return ipmiUsername;
    }

    public void setIpmiUsername(String ipmiUsername) {
        this.ipmiUsername = ipmiUsername;
    }

    public String getIpmiPassword() {
        return ipmiPassword;
    }

    public void setIpmiPassword(String ipmiPassword) {
        this.ipmiPassword = ipmiPassword;
    }

    public String getIpmiDisableUntil() {
        return ipmiDisableUntil;
    }

    public void setIpmiDisableUntil(String ipmiDisableUntil) {
        this.ipmiDisableUntil = ipmiDisableUntil;
    }

    public String getIpmiAvailable() {
        return ipmiAvailable;
    }

    public void setIpmiAvailable(String ipmiAvailable) {
        this.ipmiAvailable = ipmiAvailable;
    }

    public String getSnmpDisableUntil() {
        return snmpDisableUntil;
    }

    public void setSnmpDisableUntil(String snmpDisableUntil) {
        this.snmpDisableUntil = snmpDisableUntil;
    }

    public String getSnmpAvailable() {
        return snmpAvailable;
    }

    public void setSnmpAvailable(String snmpAvailable) {
        this.snmpAvailable = snmpAvailable;
    }

    public String getMaintenanceid() {
        return maintenanceid;
    }

    public void setMaintenanceid(String maintenanceid) {
        this.maintenanceid = maintenanceid;
    }

    public String getMaintenanceStatus() {
        return maintenanceStatus;
    }

    public void setMaintenanceStatus(String maintenanceStatus) {
        this.maintenanceStatus = maintenanceStatus;
    }

    public String getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(String maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    public String getMaintenanceFrom() {
        return maintenanceFrom;
    }

    public void setMaintenanceFrom(String maintenanceFrom) {
        this.maintenanceFrom = maintenanceFrom;
    }

    public String getIpmiErrorsFrom() {
        return ipmiErrorsFrom;
    }

    public void setIpmiErrorsFrom(String ipmiErrorsFrom) {
        this.ipmiErrorsFrom = ipmiErrorsFrom;
    }

    public String getSnmpErrorsFrom() {
        return snmpErrorsFrom;
    }

    public void setSnmpErrorsFrom(String snmpErrorsFrom) {
        this.snmpErrorsFrom = snmpErrorsFrom;
    }

    public String getIpmiError() {
        return ipmiError;
    }

    public void setIpmiError(String ipmiError) {
        this.ipmiError = ipmiError;
    }

    public String getSnmpError() {
        return snmpError;
    }

    public void setSnmpError(String snmpError) {
        this.snmpError = snmpError;
    }

    public String getJmxDisableUntil() {
        return jmxDisableUntil;
    }

    public void setJmxDisableUntil(String jmxDisableUntil) {
        this.jmxDisableUntil = jmxDisableUntil;
    }

    public String getJmxAvailable() {
        return jmxAvailable;
    }

    public void setJmxAvailable(String jmxAvailable) {
        this.jmxAvailable = jmxAvailable;
    }

    public String getJmxErrorsFrom() {
        return jmxErrorsFrom;
    }

    public void setJmxErrorsFrom(String jmxErrorsFrom) {
        this.jmxErrorsFrom = jmxErrorsFrom;
    }

    public String getJmxError() {
        return jmxError;
    }

    public void setJmxError(String jmxError) {
        this.jmxError = jmxError;
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

    public String getTlsConnect() {
        return tlsConnect;
    }

    public void setTlsConnect(String tlsConnect) {
        this.tlsConnect = tlsConnect;
    }

    public String getTlsAccept() {
        return tlsAccept;
    }

    public void setTlsAccept(String tlsAccept) {
        this.tlsAccept = tlsAccept;
    }

    public String getTlsIssuer() {
        return tlsIssuer;
    }

    public void setTlsIssuer(String tlsIssuer) {
        this.tlsIssuer = tlsIssuer;
    }

    public String getTlsSubject() {
        return tlsSubject;
    }

    public void setTlsSubject(String tlsSubject) {
        this.tlsSubject = tlsSubject;
    }

    public String getTlsPskIdentity() {
        return tlsPskIdentity;
    }

    public void setTlsPskIdentity(String tlsPskIdentity) {
        this.tlsPskIdentity = tlsPskIdentity;
    }

    public String getTlsPsk() {
        return tlsPsk;
    }

    public void setTlsPsk(String tlsPsk) {
        this.tlsPsk = tlsPsk;
    }
}
