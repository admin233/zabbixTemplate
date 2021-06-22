package com.block.zabbix.response.action.get;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OpcommandDTO {
    /**
     * 操作命令的类型
     *
     * 可能的值:
     * 0 - custom script;
     * 1 - IPMI;
     * 2 - SSH;
     * 3 - Telnet;
     * 4 - global script.
     */
    @JsonProperty("type")
    public String type;
    /**
     * 用于全局脚本命令的脚本 ID。
     *
     * 需要全局脚本命令。
     */
    @JsonProperty("scriptid")
    public String scriptid;
    /**
     * 	将要执行自定义脚本操作命令的目标。
     *
     * 可能的值:
     * 0 - Zabbix agent;
     * 1 - Zabbix server;
     * 2 - Zabbix server (proxy).
     *
     * 自定义脚本命令所需的。
     */
    @JsonProperty("execute_on")
    public String executeOn;
    /**
     * 用于 SSH 和 telnet 命令的端口号。
     */
    @JsonProperty("port")
    public String port;
    /**
     * SSH 命令的认证方法。
     *
     * 可能的值:
     * 0 - password;
     * 1 - public key.
     *
     * Required for SSH commands.
     */
    @JsonProperty("authtype")
    public String authtype;
    /**
     * 用于登录认证的用户名
     *
     * 使用 SSH 和 Telnet 命令时是必须的.
     */
    @JsonProperty("username")
    public String username;
    /**
     * 密码验证和 telnet 命令时用于 SSH 命令的密码。
     */
    @JsonProperty("password")
    public String password;
    /**
     * 	用于SSH公钥和公钥认证的公钥名称。
     *
     * 具有密钥验证的 SSH 命令所必需的。
     */
    @JsonProperty("publickey")
    public String publickey;
    /**
     * 使用公钥认证的 SSH 命令的私钥文件的名称。
     *
     * 具有密钥验证的 SSH 命令所必需的。
     */
    @JsonProperty("privatekey")
    public String privatekey;
    /**
     * 要运行的命令。 当类型为 (0,1,2,3) 时，此项是必须的
     */
    @JsonProperty("command")
    public String command;
}
