package com.block.zabbix.request;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ZabbixTemplateGetRequest {

	private Map<String, Object> params = new HashMap<>();

	public Map<String, Object> getParams() {
		return params;
	}

	public ZabbixTemplateGetRequest addField(String fieldName, Object fieldValue) {
		this.params.put(fieldName, fieldValue);
		return this;
	}

	public ZabbixTemplateGetRequest setOutput(String output) {
		this.params.put("output", output);
		return this;
	}

	public ZabbixTemplateGetRequest setHostids(String...hostids){
		this.params.put("hostids", Arrays.asList(hostids));
		return this;
	}

	public ZabbixTemplateGetRequest setHost(String...host) {
		Map<String, Object> filter = new HashMap<>(1);
		filter.put("host", Arrays.asList(host));
		this.params.put("filter", filter);
		return this;
	}

	public ZabbixTemplateGetRequest setEvaltype(int evaltype){
		this.params.put("evaltype", evaltype);
		return this;
	}

	public ZabbixTemplateGetRequest setFilterType(String type) {
		Map<String, String> filter = new HashMap<>(1);
		filter.put("type", type);

		this.params.put("filter", filter);
		return this;
	}

	public ZabbixTemplateGetRequest setSortfield(String sortfield) {
		this.params.put("sortfield", sortfield);
		return this;
	}

}
