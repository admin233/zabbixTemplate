package com.block.zabbix.api;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZabbixProxyGetRequest {

	private Map<String, Object> params = new HashMap<>();

	public Map<String, Object> getParams() {
		return params;
	}

	public ZabbixProxyGetRequest(){
		params.put("selectInterface","extend");
		params.put("output","extend");
	}

	public ZabbixProxyGetRequest addField(String fieldName, Object fieldValue) {
		this.params.put(fieldName, fieldValue);
		return this;
	}

	public ZabbixProxyGetRequest setSelectHosts(String ... selectHosts) {
		this.params.put("selectHosts", Arrays.asList(selectHosts));
		return this;
	}

	public ZabbixProxyGetRequest setOutput(String... output) {
		return this.setOutput(Arrays.asList(output));
	}

	public ZabbixProxyGetRequest setOutput(List<String> output) {
		this.params.put("output", output);
		return this;
	}

	public ZabbixProxyGetRequest setFilterHosts(String... hosts) {
		return this.setFilterHosts(Arrays.asList(hosts));
	}

	public ZabbixProxyGetRequest setFilterHosts(List<String> hosts) {
		Map<String, Object> filter = new HashMap<>(1);
		filter.put("host", hosts);

		this.params.put("filter", filter);
		return this;
	}

	/**
	 * 返回在interface属性中被动代理使用代理接口
	 * @param selectInterface
	 * @return
	 */
	public ZabbixProxyGetRequest setSelectInterface(String ... selectInterface){
		this.params.put("selectInterface", Arrays.asList(selectInterface));
		return this;
	}

}
