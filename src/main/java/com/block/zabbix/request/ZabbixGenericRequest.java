package com.block.zabbix.request;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ZabbixGenericRequest {
	public Map<String, Object> params = new HashMap<>();

	public ZabbixGenericRequest() {
	}

	public ZabbixGenericRequest(String fieldName, Object fieldValue) {
		this.params.put(fieldName, fieldValue);
	}

	public ZabbixGenericRequest addField(String fieldName, Object fieldValue) {
		this.params.put(fieldName, fieldValue);
		return this;
	}

	public Map<String, Object> getParams() {
		return params;
	}

	public ZabbixGenericRequest setOutput(String ... output) {
		this.params.put("output", Arrays.asList(output));
		return this;
	}
}
