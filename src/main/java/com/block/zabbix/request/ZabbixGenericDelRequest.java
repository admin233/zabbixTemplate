package com.block.zabbix.request;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZabbixGenericDelRequest<T> {
	public List<T> params;

	public ZabbixGenericDelRequest() {
		params = new ArrayList<T>();
	}

	public ZabbixGenericDelRequest(T ...  value) {
		this.params = Arrays.asList(value);
	}

	public ZabbixGenericDelRequest add(T ... value) {
		this.params.addAll(Arrays.asList(value));
		return this;
	}
	public List<T> getParams() {
		return params;
	}
}
