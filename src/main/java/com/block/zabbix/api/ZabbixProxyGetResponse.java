package com.block.zabbix.api;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ZabbixProxyGetResponse {

    @JsonProperty("host")
    public String host;
    @JsonProperty("status")
    public String status;
    @JsonProperty("lastaccess")
    public String lastaccess;
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
    @JsonProperty("proxy_address")
    public String proxyAddress;
    @JsonProperty("auto_compress")
    public String autoCompress;
    @JsonProperty("proxyid")
    public String proxyid;
    @JsonProperty("interface")
    private List<ZabbixProxyInterface> interfaces ;

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

    public String getLastaccess() {
        return lastaccess;
    }

    public void setLastaccess(String lastaccess) {
        this.lastaccess = lastaccess;
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

    public String getProxyAddress() {
        return proxyAddress;
    }

    public void setProxyAddress(String proxyAddress) {
        this.proxyAddress = proxyAddress;
    }

    public String getAutoCompress() {
        return autoCompress;
    }

    public void setAutoCompress(String autoCompress) {
        this.autoCompress = autoCompress;
    }

    public String getProxyid() {
        return proxyid;
    }

    public void setProxyid(String proxyid) {
        this.proxyid = proxyid;
    }

    public List<ZabbixProxyInterface> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(List<ZabbixProxyInterface> interfaces) {
        this.interfaces = interfaces;
    }
}
