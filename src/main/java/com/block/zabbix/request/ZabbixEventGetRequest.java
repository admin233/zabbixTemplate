package com.block.zabbix.request;

import com.block.zabbix.pojo.ZabbixTag;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZabbixEventGetRequest extends ZabbixGenericRequest{

    public ZabbixEventGetRequest() {
        super();
        this.params.put("output", "extend");
    }

    public ZabbixEventGetRequest setEventids(List<String> eventids){
        this.params.put("eventids",eventids);
        return this;
    }

    public ZabbixEventGetRequest setEventids(String ... eventids){
        return setEventids(Arrays.asList(eventids));
    }

    public ZabbixEventGetRequest setGroupids(List<String> groupids){
        this.params.put("groupids",groupids);
        return this;
    }

    public ZabbixEventGetRequest setGroupids(String ... groupids){
        return setGroupids(Arrays.asList(groupids));
    }

    public ZabbixEventGetRequest setHostids(List<String> hostids){
        this.params.put("hostids",hostids);
        return this;
    }

    public ZabbixEventGetRequest setHostids(String ... hostids){
        return setHostids(Arrays.asList(hostids));
    }

    public ZabbixEventGetRequest setObjectids(List<String> objectids){
        this.params.put("objectids",objectids);
        return this;
    }

    public ZabbixEventGetRequest setObjectids(String ... objectids){
        return setObjectids(Arrays.asList(objectids));
    }

    public ZabbixEventGetRequest setApplicationids(List<String> applicationids){
        this.params.put("applicationids",applicationids);
        return this;
    }

    public ZabbixEventGetRequest setApplicationids(String ... applicationids){
        return setApplicationids(Arrays.asList(applicationids));
    }

    /**
     * 仅返回给定类型的事件。
     * 可能的值:
     * 0 - 由触发器创建的事件;
     * 1 - 由发现规则创建的事件;
     * 2 - active agent自动注册的事件;
     * 3 - 内部事件.
     * 默认值: 0 - 触发器事件。
     */
    public ZabbixEventGetRequest setSource(int source){
        this.params.put("source",source);
        return this;
    }

    /**
     * 与事件相关的对象类型。
     *
     * 触发器事件可能的值:
     * 0 - 触发器.
     *
     * 发现事件的可能值:
     * 1 - 发现主机;
     * 2 - 发现服务.
     *
     * 自动注册事件的可能值:
     * 3 - 自动注册的主机。
     *
     * 内部事件的可能值:
     * 0 - 触发器;
     * 4 - 监控项;
     * 5 - 低级别发现(LLD)规则.
     *
     * 默认值: 0 - 触发器。
     */
    public ZabbixEventGetRequest setObject(int object){
        this.params.put("object",object);
        return this;
    }

    /**
     * 若设置为“true”，则只返回已被确认的事件。
     * 事件是否被确认。
     */
    public ZabbixEventGetRequest setAcknowledged(boolean acknowledged){
        this.params.put("acknowledged",acknowledged);
        return this;
    }

    /**
     * 仅返回符合所属严重程度的事件。仅当对象为触发器时才适用。
     *
     * 当前事件的严重等级。
     * 可能的值:
     * 0 - 未分类;
     * 1 - 信息;
     * 2 - 警告;
     * 3 - 一般严重;
     * 4 - 严重;
     * 5 - 灾难.
     */
    public ZabbixEventGetRequest setSeverities(List<Integer> severities){
        this.params.put("severities",severities);
        return this;
    }

    public ZabbixEventGetRequest setSeverities(Integer ... severities){
        return setSeverities(Arrays.asList(severities));
    }

    /**
     * 标签搜索的规则。
     *
     * 可能值:
     * 0 - (默认) 与/或;
     * 2 - 或。
     */
    public ZabbixEventGetRequest setEvaltype(Integer evaltype){
        this.params.put("evaltype",evaltype);
        return this;
    }

    /**
     * 仅返回具有给定标签的事件。 按标签进行完全匹配，按值搜索时，不区分大小写。
     * Format: [{"tag": "<tag>", "value": "<value>", "operator": "<operator>"}, ...].
     * 一个空数组会返回所有事件。
     */
    public ZabbixEventGetRequest setTags(List<ZabbixTag> tags){
        this.params.put("tags",tags);
        return this;
    }

    public ZabbixEventGetRequest setTags(ZabbixTag ... tags){
        return setTags(Arrays.asList(tags));
    }

    /**
     * 仅返回ID大于或等于给定ID的事件
     */
    public ZabbixEventGetRequest setEventid_from(String eventid_from){
        this.params.put("eventid_from",eventid_from);
        return this;
    }

    /**
     * 仅返回ID小于或等于给定ID的事件。
     */
    public ZabbixEventGetRequest setEventid_till(String eventid_till){
        this.params.put("eventid_till",eventid_till);
        return this;
    }

    /**
     * 返回在给定时间后生成的警报。
     */
    private ZabbixEventGetRequest setTime_from(String time_from){
        this.params.put("time_from",time_from);
        return this;
    }

    public ZabbixEventGetRequest setTime_from(long time_from){
        return setTime_from(String.valueOf(time_from));
    }

    /**
     * 返回在给定时间之前生成的警报。
     */
    private ZabbixEventGetRequest setTime_till(String time_till){
        this.params.put("time_till",time_till);
        return this;
    }

    public ZabbixEventGetRequest setTime_till(long time_till){
        return setTime_till(String.valueOf(time_till));
    }

    public ZabbixEventGetRequest setValue(Integer ... value){
        return setValue(Arrays.asList(value));
    }

    /**
     * 仅返回具有给定值的事件。
     *
     * 相关对象的状态。
     *
     * 触发器事件可能的值:
     * 0 - 正常;
     * 1 - 异常.
     *
     * 发现事件可能的值:
     * 0 - 主机或服务正常;
     * 1 - 主机或服务故障;
     * 2 - 主机或服务已发现;
     * 3 - 主机或服务丢失。
     *
     * 内部事件的可能值:
     * 0 - “正常”状态;
     * 1 - “未知”或“不支持”状态。
     *
     * 此参数不用于活动代理自动注册事件。
     */
    public ZabbixEventGetRequest setValue(List<Integer> value){
        this.params.put("value",value);
        return this;
    }

    /**
     * 	根据给定属性，对结果进行排序。
     *
     * 可能值: eventid, objectid 以及 clock。
     */
    public ZabbixEventGetRequest setSortfield(List<String> sortfield){
        this.params.put("sortfield",sortfield);
        return this;
    }

    public ZabbixEventGetRequest setSortfield(String ... sortfield){
        return setSortfield(Arrays.asList(sortfield));
    }

    public ZabbixEventGetRequest addFilter(String key,Object value){
        Object filter_Object = this.params.get("filter");
        Map<String, Object> filter = new HashMap<>();
        if (filter_Object != null) {
            filter = (Map<String, Object>) filter_Object;
        }
        filter.put(key, value);
        this.params.put("filter", filter);
        return this;
    }

}
