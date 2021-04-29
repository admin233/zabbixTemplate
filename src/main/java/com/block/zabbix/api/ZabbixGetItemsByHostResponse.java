package com.block.zabbix.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Jackson
 * @name zabbixTemplate
 * @Description
 * @date 2021/4/28
 */


public class ZabbixGetItemsByHostResponse {

    @JsonProperty("itemid")
    private String itemid;
    @JsonProperty("type")
    private String type;
    @JsonProperty("snmp_oid")
    private String snmpOid;
    @JsonProperty("hostid")
    private String hostid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("key_")
    private String key;
    @JsonProperty("delay")
    private String delay;
    @JsonProperty("history")
    private String history;
    @JsonProperty("trends")
    private String trends;
    @JsonProperty("status")
    private String status;
    @JsonProperty("value_type")
    private String valueType;
    @JsonProperty("trapper_hosts")
    private String trapperHosts;
    @JsonProperty("units")
    private String units;
    @JsonProperty("formula")
    private String formula;
    @JsonProperty("logtimefmt")
    private String logtimefmt;
    @JsonProperty("templateid")
    private String templateid;
    @JsonProperty("valuemapid")
    private String valuemapid;
    @JsonProperty("params")
    private String params;
    @JsonProperty("ipmi_sensor")
    private String ipmiSensor;
    @JsonProperty("authtype")
    private String authtype;
    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;
    @JsonProperty("publickey")
    private String publickey;
    @JsonProperty("privatekey")
    private String privatekey;
    @JsonProperty("flags")
    private String flags;
    @JsonProperty("interfaceid")
    private String interfaceid;
    @JsonProperty("description")
    private String description;
    @JsonProperty("inventory_link")
    private String inventoryLink;
    @JsonProperty("lifetime")
    private String lifetime;
    @JsonProperty("evaltype")
    private String evaltype;
    @JsonProperty("jmx_endpoint")
    private String jmxEndpoint;
    @JsonProperty("master_itemid")
    private String masterItemid;
    @JsonProperty("timeout")
    private String timeout;
    @JsonProperty("url")
    private String url;
    @JsonProperty("query_fields")
    private List<?> queryFields;
    @JsonProperty("posts")
    private String posts;
    @JsonProperty("status_codes")
    private String statusCodes;
    @JsonProperty("follow_redirects")
    private String followRedirects;
    @JsonProperty("post_type")
    private String postType;
    @JsonProperty("http_proxy")
    private String httpProxy;
    @JsonProperty("headers")
    private List<?> headers;
    @JsonProperty("retrieve_mode")
    private String retrieveMode;
    @JsonProperty("request_method")
    private String requestMethod;
    @JsonProperty("output_format")
    private String outputFormat;
    @JsonProperty("ssl_cert_file")
    private String sslCertFile;
    @JsonProperty("ssl_key_file")
    private String sslKeyFile;
    @JsonProperty("ssl_key_password")
    private String sslKeyPassword;
    @JsonProperty("verify_peer")
    private String verifyPeer;
    @JsonProperty("verify_host")
    private String verifyHost;
    @JsonProperty("allow_traps")
    private String allowTraps;
    @JsonProperty("discover")
    private String discover;
    @JsonProperty("state")
    private String state;
    @JsonProperty("error")
    private String error;
    @JsonProperty("lastclock")
    private String lastclock;
    @JsonProperty("lastns")
    private String lastns;
    @JsonProperty("lastvalue")
    private String lastvalue;
    @JsonProperty("prevvalue")
    private String prevvalue;

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSnmpOid() {
        return snmpOid;
    }

    public void setSnmpOid(String snmpOid) {
        this.snmpOid = snmpOid;
    }

    public String getHostid() {
        return hostid;
    }

    public void setHostid(String hostid) {
        this.hostid = hostid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getTrends() {
        return trends;
    }

    public void setTrends(String trends) {
        this.trends = trends;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public String getTrapperHosts() {
        return trapperHosts;
    }

    public void setTrapperHosts(String trapperHosts) {
        this.trapperHosts = trapperHosts;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getLogtimefmt() {
        return logtimefmt;
    }

    public void setLogtimefmt(String logtimefmt) {
        this.logtimefmt = logtimefmt;
    }

    public String getTemplateid() {
        return templateid;
    }

    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    public String getValuemapid() {
        return valuemapid;
    }

    public void setValuemapid(String valuemapid) {
        this.valuemapid = valuemapid;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getIpmiSensor() {
        return ipmiSensor;
    }

    public void setIpmiSensor(String ipmiSensor) {
        this.ipmiSensor = ipmiSensor;
    }

    public String getAuthtype() {
        return authtype;
    }

    public void setAuthtype(String authtype) {
        this.authtype = authtype;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPublickey() {
        return publickey;
    }

    public void setPublickey(String publickey) {
        this.publickey = publickey;
    }

    public String getPrivatekey() {
        return privatekey;
    }

    public void setPrivatekey(String privatekey) {
        this.privatekey = privatekey;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getInterfaceid() {
        return interfaceid;
    }

    public void setInterfaceid(String interfaceid) {
        this.interfaceid = interfaceid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInventoryLink() {
        return inventoryLink;
    }

    public void setInventoryLink(String inventoryLink) {
        this.inventoryLink = inventoryLink;
    }

    public String getLifetime() {
        return lifetime;
    }

    public void setLifetime(String lifetime) {
        this.lifetime = lifetime;
    }

    public String getEvaltype() {
        return evaltype;
    }

    public void setEvaltype(String evaltype) {
        this.evaltype = evaltype;
    }

    public String getJmxEndpoint() {
        return jmxEndpoint;
    }

    public void setJmxEndpoint(String jmxEndpoint) {
        this.jmxEndpoint = jmxEndpoint;
    }

    public String getMasterItemid() {
        return masterItemid;
    }

    public void setMasterItemid(String masterItemid) {
        this.masterItemid = masterItemid;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<?> getQueryFields() {
        return queryFields;
    }

    public void setQueryFields(List<?> queryFields) {
        this.queryFields = queryFields;
    }

    public String getPosts() {
        return posts;
    }

    public void setPosts(String posts) {
        this.posts = posts;
    }

    public String getStatusCodes() {
        return statusCodes;
    }

    public void setStatusCodes(String statusCodes) {
        this.statusCodes = statusCodes;
    }

    public String getFollowRedirects() {
        return followRedirects;
    }

    public void setFollowRedirects(String followRedirects) {
        this.followRedirects = followRedirects;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getHttpProxy() {
        return httpProxy;
    }

    public void setHttpProxy(String httpProxy) {
        this.httpProxy = httpProxy;
    }

    public List<?> getHeaders() {
        return headers;
    }

    public void setHeaders(List<?> headers) {
        this.headers = headers;
    }

    public String getRetrieveMode() {
        return retrieveMode;
    }

    public void setRetrieveMode(String retrieveMode) {
        this.retrieveMode = retrieveMode;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getOutputFormat() {
        return outputFormat;
    }

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    public String getSslCertFile() {
        return sslCertFile;
    }

    public void setSslCertFile(String sslCertFile) {
        this.sslCertFile = sslCertFile;
    }

    public String getSslKeyFile() {
        return sslKeyFile;
    }

    public void setSslKeyFile(String sslKeyFile) {
        this.sslKeyFile = sslKeyFile;
    }

    public String getSslKeyPassword() {
        return sslKeyPassword;
    }

    public void setSslKeyPassword(String sslKeyPassword) {
        this.sslKeyPassword = sslKeyPassword;
    }

    public String getVerifyPeer() {
        return verifyPeer;
    }

    public void setVerifyPeer(String verifyPeer) {
        this.verifyPeer = verifyPeer;
    }

    public String getVerifyHost() {
        return verifyHost;
    }

    public void setVerifyHost(String verifyHost) {
        this.verifyHost = verifyHost;
    }

    public String getAllowTraps() {
        return allowTraps;
    }

    public void setAllowTraps(String allowTraps) {
        this.allowTraps = allowTraps;
    }

    public String getDiscover() {
        return discover;
    }

    public void setDiscover(String discover) {
        this.discover = discover;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getLastclock() {
        return lastclock;
    }

    public void setLastclock(String lastclock) {
        this.lastclock = lastclock;
    }

    public String getLastns() {
        return lastns;
    }

    public void setLastns(String lastns) {
        this.lastns = lastns;
    }

    public String getLastvalue() {
        return lastvalue;
    }

    public void setLastvalue(String lastvalue) {
        this.lastvalue = lastvalue;
    }

    public String getPrevvalue() {
        return prevvalue;
    }

    public void setPrevvalue(String prevvalue) {
        this.prevvalue = prevvalue;
    }
}
