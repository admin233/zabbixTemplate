package com.block.zabbix.api;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ZabbixProxyGetResponse {

    private String host ;
    private String status ;
    private String lastaccess ;
    private String description ;
    private String tls_connect ;
    private String tls_accept ;
    private String tls_issuer ;
    private String tls_subject ;
    private String tls_psk_identity ;
    private String tls_psk ;
    private String proxy_address ;
    private String auto_compress ;
    private String proxyid ;
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

    public String getProxy_address() {
        return proxy_address;
    }

    public void setProxy_address(String proxy_address) {
        this.proxy_address = proxy_address;
    }

    public String getAuto_compress() {
        return auto_compress;
    }

    public void setAuto_compress(String auto_compress) {
        this.auto_compress = auto_compress;
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
