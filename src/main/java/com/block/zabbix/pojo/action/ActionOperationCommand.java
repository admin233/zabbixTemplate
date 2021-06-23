package com.block.zabbix.pojo.action;

/**
 * 动作操作命令
 * 操作命令对象包含有关运行操作命令的数据。
 * The operation command object contains data about the command that will be run by the operation.
 */
public class ActionOperationCommand {
    /**
     * Command to run. Required when type IN (0,1,2,3)
     */
    String command;
    /**
     * Type of operation command.
     *
     * Possible values:
     * 0 - custom script;
     * 1 - IPMI;
     * 2 - SSH;
     * 3 - Telnet;
     * 4 - global script.
     */
    int type;
    /**
     * Authentication method used for SSH commands.
     *
     * Possible values:
     * 0 - password;
     * 1 - public key.
     *
     * Required for SSH commands.
     */
    int authtype;
    /**
     * Target on which the custom script operation command will be executed.
     *
     * Possible values:
     * 0 - Zabbix agent;
     * 1 - Zabbix server;
     * 2 - Zabbix server (proxy).
     *
     * Required for custom script commands.
     */
    int execute_on;
    /**
     * Password used for SSH commands with password authentication and Telnet commands.
     */
    String password;
    /**
     * Port number used for SSH and Telnet commands.
     */
    String port;
    /**
     * Name of the private key file used for SSH commands with public key authentication.
     *
     * Required for SSH commands with public key authentication.
     */
    String privatekey;
    /**
     * 	Name of the public key file used for SSH commands with public key authentication.
     *
     * Required for SSH commands with public key authentication.
     */
    String publickey;
    /**
     * ID of the script used for global script commands.
     *
     * Required for global script commands.
     */
    String scriptid;
    /**
     * User name used for authentication.
     *
     * Required for SSH and Telnet commands.
     */
    String username;

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getAuthtype() {
        return authtype;
    }

    public void setAuthtype(int authtype) {
        this.authtype = authtype;
    }

    public int getExecute_on() {
        return execute_on;
    }

    public void setExecute_on(int execute_on) {
        this.execute_on = execute_on;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPrivatekey() {
        return privatekey;
    }

    public void setPrivatekey(String privatekey) {
        this.privatekey = privatekey;
    }

    public String getPublickey() {
        return publickey;
    }

    public void setPublickey(String publickey) {
        this.publickey = publickey;
    }

    public String getScriptid() {
        return scriptid;
    }

    public void setScriptid(String scriptid) {
        this.scriptid = scriptid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
