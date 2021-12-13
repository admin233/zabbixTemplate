package com.block.zabbix.request;

import org.springframework.util.ObjectUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Filter;

public class ZabbixItemGetRequest {

	private Map<String, Object> params = new HashMap<>();

	public Map<String, Object> getParams() {
		return params;
	}

	public ZabbixItemGetRequest addField(String fieldName, Object fieldValue) {
		this.params.put(fieldName, fieldValue);
		return this;
	}

	public ZabbixItemGetRequest setOutput(String output) {
		this.params.put("output", output);
		return this;
	}

	public ZabbixItemGetRequest setHostids(String ... hostids) {
		this.params.put("hostids", Arrays.asList(hostids));
		return this;
	}

	public ZabbixItemGetRequest setHostids(List<String> hostids) {
		this.params.put("hostids", hostids);
		return this;
	}

	public ZabbixItemGetRequest setSearchKey(String key_) {
		Map<String, String> search = new HashMap<>(1);
		search.put("key_", key_);

		this.params.put("search", search);
		return this;
	}

	@SuppressWarnings("unchecked")
	private ZabbixItemGetRequest setFilter(String filterName,Object filterValue){
		Object filter = this.params.get("filter");
		if (ObjectUtils.isEmpty(filter)) {
			Map<String, Object> filterMap = new HashMap<>(2);
			filterMap.put(filterName,filterValue);
			this.params.put("filter", filterMap);
			return this;
		}
		((Map<String, Object>)filter).put(filterName,filterValue);
		this.params.put("filter", filter);
		return this;
	}

	public ZabbixItemGetRequest setFilterName(Object name) {
		return setFilter("name",name);
	}

	public ZabbixItemGetRequest setFilterType(Object type) {
		return setFilter("type",type);
	}

	public ZabbixItemGetRequest setSortfield(String sortfield) {
		this.params.put("sortfield", sortfield);
		return this;
	}

}
