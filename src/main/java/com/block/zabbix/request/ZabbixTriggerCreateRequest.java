package com.block.zabbix.request;

import com.block.zabbix.pojo.ZabbixTag;

import java.util.*;

public class ZabbixTriggerCreateRequest {

	private Map<String, Object> params = new HashMap<>();

	public Map<String, Object> getParams() {
		return params;
	}

	public ZabbixTriggerCreateRequest addField(String fieldName, Object fieldValue) {
		this.params.put(fieldName, fieldValue);
		return this;
	}

	public ZabbixTriggerCreateRequest setName(String name) {
		this.params.put("description", name);
		return this;
	}

	public ZabbixTriggerCreateRequest setExpression(String expression) {
		this.params.put("expression", expression);
		return this;
	}

	public ZabbixTriggerCreateRequest setDependencies(List<String> triggerids) {
		List<Map<String,Object>> dependencies = new ArrayList<>();
		triggerids.forEach( o -> {
			Map m =	new HashMap<>();
			m.put("triggerid",o);
			dependencies.add(m);
		});
		this.params.put("dependencies", dependencies);
		return this;
	}

	public ZabbixTriggerCreateRequest setDependencies(String ... triggerids) {
		return setDependencies(Arrays.asList(triggerids));
	}

	public ZabbixTriggerCreateRequest setTags(List<ZabbixTag> tags){
		this.params.put("tags", tags);
		return this;
	}

	public ZabbixTriggerCreateRequest setTags(String tag,String value){
		List<ZabbixTag> tags = new ArrayList<>();
		tags.add(new ZabbixTag(tag,value));
		return setTags(tags);
	}

	public ZabbixTriggerCreateRequest setComments(String comments) {
		this.params.put("comments", comments);
		return this;
	}

	/**
	 * 触发器的严重性级别。
	 *
	 * 许可值为：
	 * 0 - (默认) 未分类；
	 * 1 - 信息；
	 * 2 - 警告；
	 * 3 - 一般严重；
	 * 4 - 严重；
	 * 5 - 灾难。
	 */
	public ZabbixTriggerCreateRequest setPriority(int priority) {
		this.params.put("priority", priority);
		return this;
	}

	/**
	 * 触发器是否处于启用状态或禁用状态。
	 *
	 * 许可值为：
	 * 0 - (默认) 启用；
	 * 1 - 禁用。
	 */
	public ZabbixTriggerCreateRequest setStatus(int status) {
		this.params.put("status", status);
		return this;
	}

	/**
	 * 触发器是否能够生成多个故障事件。
	 *
	 * 许可值为：
	 * 0 - (默认) 不生成多个事件。
	 * 1 - 生成多个事件。
	 */
	public ZabbixTriggerCreateRequest setType(int type) {
		this.params.put("type", type);
		return this;
	}

	public ZabbixTriggerCreateRequest setUrl(String url) {
		this.params.put("url", url);
		return this;
	}

	/**
	 * 事件恢复生成模式。
	 *
	 * 许可值为：
	 * 0 - (默认) 表达式；
	 * 1 - 恢复表达式；
	 * 2 - 无。
	 */
	public ZabbixTriggerCreateRequest setRecovery_mode(int recovery_mode) {
		this.params.put("recovery_mode", recovery_mode);
		return this;
	}

	/**
	 * 生成的触发恢复表达式。
	 */
	public ZabbixTriggerCreateRequest setRecovery_expression(String recovery_expression) {
		this.params.put("recovery_expression", recovery_expression);
		return this;
	}

	/**
	 * 事件恢复关闭。
	 *
	 * 许可值为：
	 * 0 - (默认) 所有故障；
	 * 1 - 与标签值匹配的所有故障。
	 */
	public ZabbixTriggerCreateRequest setCorrelation_mode(int correlation_mode) {
		this.params.put("correlation_mode", correlation_mode);
		return this;
	}

	/**
	 * 用于匹配的标签。
	 */
	public ZabbixTriggerCreateRequest setCorrelation_tag(String correlation_tag) {
		this.params.put("correlation_tag", correlation_tag);
		return this;
	}

	/**
	 * 允许手动关闭。
	 *
	 * 许可值为：
	 * 0 - (默认) 不允许；
	 * 1 - 允许。
	 */
	public ZabbixTriggerCreateRequest setManual_close(int manual_close) {
		this.params.put("manual_close", manual_close);
		return this;
	}


}
