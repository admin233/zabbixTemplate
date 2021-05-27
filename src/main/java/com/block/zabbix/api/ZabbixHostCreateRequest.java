package com.block.zabbix.api;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZabbixHostCreateRequest {

	public ZabbixHostCreateRequest() {
		//this.available(1);
	}

	private Map<String, Object> params = new HashMap<>();

	public Map<String, Object> getParams() {
		return params;
	}

	public ZabbixHostCreateRequest addField(String fieldName, Object fieldValue) {
		this.params.put(fieldName, fieldValue);
		return this;
	}

	public ZabbixHostCreateRequest setHost(String host) {
		this.params.put("host", host);
		return this;
	}

	/**
	 * 用于监控主机的Proxy服务器的hostid。
	 * @param proxyid
	 * @return
	 */
	public ZabbixHostCreateRequest setProxyid(String proxyid) {
		this.params.put("proxy_hostid", proxyid);
		return this;
	}

	/**
	 * 
	 * @param available 0 - (default) unknown; 1 - available; 2 - unavailable.
	 * @return ZabbixHostCreateRequest
	 */
	public ZabbixHostCreateRequest available(int available) {
		this.params.put("available", available);
		return this;
	}

	public ZabbixHostCreateRequest setInterface(ZabbixInterface interfaces) {
		return this.setInterfaces(Arrays.asList(interfaces));
	}

	public ZabbixHostCreateRequest setInterfaces(List<ZabbixInterface> interfaces) {
		this.params.put("interfaces", interfaces);
		return this;
	}

	public ZabbixHostCreateRequest setGroupsIds(String... groupids) {
		return this.setGroups(Arrays.asList(groupids).stream().map(ZabbixGroupId::new).collect(toList()));
	}

	public ZabbixHostCreateRequest setGroups(List<ZabbixGroupId> groups) {
		this.params.put("groups", groups);
		return this;
	}

	public ZabbixHostCreateRequest setTags(List<ZabbixTag> tags) {
		this.params.put("tags", tags);
		return this;
	}

	/**
	 * 主机标签
	 * @param zabbixTag
	 * @return
	 */
	public ZabbixHostCreateRequest setTags(ZabbixTag...zabbixTag){
		return setTags(Arrays.asList(zabbixTag));
	}

	public ZabbixHostCreateRequest setTemplateIds(String... templateids) {
		return this.setTemplates(Arrays.asList(templateids).stream().map(ZabbixTemplateId::new).collect(toList()));
	}

	public ZabbixHostCreateRequest setTemplates(List<ZabbixTemplateId> templates) {
		this.params.put("templates", templates);
		return this;
	}

	public ZabbixHostCreateRequest setMacros(List<ZabbixMacro> macros) {
		this.params.put("macros", macros);
		return this;
	}

	public ZabbixHostCreateRequest setInventoryMode(int inventoryMode) {
		this.params.put("inventory_mode", inventoryMode);
		return this;
	}

	public ZabbixHostCreateRequest setInventory(String macaddress_a, String macaddress_b) {
		Map<String, String> inventory = new HashMap<>(2);
		inventory.put("macaddress_a", macaddress_a);
		inventory.put("macaddress_b", macaddress_b);

		this.params.put("inventory", inventory);
		return this;
	}

	public ZabbixHostCreateRequest setPskIdentityAndPskPw(String tls_psk_identity,String tls_psk){
		/**
		 * 到主机的连接。
		 *
		 * 可能的值：
		 * 1 - (默认) 没有加密；
		 * 2 - PSK；
		 * 4 - 证书。
		 */
		Object tls_connect = this.params.get("tls_connect");
		/**
		 * 来自主机的连接。
		 *
		 * 可能的值：
		 * 1 - (默认) 没有加密；
		 * 2 - PSK；
		 * 4 - 证书。
		 */
		Object tls_accept = this.params.get("tls_accept");
		if(tls_connect == null){
			this.params.put("tls_connect", 2);
		}
		if(tls_accept == null){
			this.params.put("tls_accept", 2);
		}

		this.params.put("tls_psk_identity", tls_psk_identity);
		this.params.put("tls_psk", tls_psk);

		return this;
	}

	public ZabbixHostCreateRequest setDescription(String description){
		this.params.put("description", description);
		return this;
	}

}
