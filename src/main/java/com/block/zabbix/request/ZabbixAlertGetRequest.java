package com.block.zabbix.request;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZabbixAlertGetRequest extends ZabbixGenericRequest{

    public ZabbixAlertGetRequest() {
        super();
        this.params.put("output", "extend");
    }

    public ZabbixAlertGetRequest setAlertids(List<String> alertids){
        this.params.put("alertids",alertids);
        return this;
    }

    public ZabbixAlertGetRequest setAlertids(String ... alertids){
        return setAlertids(Arrays.asList(alertids));
    }

    public ZabbixAlertGetRequest setActionids(List<String> actionids){
        this.params.put("actionids",actionids);
        return this;
    }

    public ZabbixAlertGetRequest setActionids(String ... actionids){
        return setAlertids(Arrays.asList(actionids));
    }

    public ZabbixAlertGetRequest setEventids(List<String> eventids){
        this.params.put("eventids",eventids);
        return this;
    }

    public ZabbixAlertGetRequest setEventids(String ... eventids){
        return setEventids(Arrays.asList(eventids));
    }

    public ZabbixAlertGetRequest setGroupids(List<String> groupids){
        this.params.put("groupids",groupids);
        return this;
    }

    public ZabbixAlertGetRequest setGroupids(String ... groupids){
        return setGroupids(Arrays.asList(groupids));
    }

    public ZabbixAlertGetRequest setHostids(List<String> hostids){
        this.params.put("hostids",hostids);
        return this;
    }

    public ZabbixAlertGetRequest setHostids(String ... hostids){
        return setHostids(Arrays.asList(hostids));
    }

    public ZabbixAlertGetRequest setMediatypeids(List<String> mediatypeids){
        this.params.put("mediatypeids",mediatypeids);
        return this;
    }

    public ZabbixAlertGetRequest setMediatypeids(String ... mediatypeids){
        return setMediatypeids(Arrays.asList(mediatypeids));
    }

    public ZabbixAlertGetRequest setObjectids(List<String> objectids){
        this.params.put("objectids",objectids);
        return this;
    }

    public ZabbixAlertGetRequest setObjectids(String ... objectids){
        return setObjectids(Arrays.asList(objectids));
    }

    public ZabbixAlertGetRequest setUserids(List<String> userids){
        this.params.put("userids",userids);
        return this;
    }

    public ZabbixAlertGetRequest setUserids(String ... userids){
        return setUserids(Arrays.asList(userids));
    }

    /**
     * 仅返回与给定类型的对象相关的事件生成的警报。
     * 参考 事件对象属性 获取受支持的对象类型列表。
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
     * 默认值: 0 - trigger.
     */
    public ZabbixAlertGetRequest setEventobject(int eventobject){
        this.params.put("eventobject",eventobject);
        return this;
    }

    /**
     * 仅返回由给定类型的事件生成的警报。
     * 参考 事件来源属性 获取受支持的对象类型列表。
     * 可能的值:
     * 0 - 由触发器创建的事件;
     * 1 - 由发现规则创建的事件;
     * 2 - active agent自动注册的事件;
     * 3 - 内部事件.
     *
     * 默认值: 0 - trigger events.
     */
    public ZabbixAlertGetRequest setEventsource(int eventsource){
        this.params.put("eventsource",eventsource);
        return this;
    }

    /**
     * 返回在给定时间后生成的警报。
     */
    private ZabbixAlertGetRequest setTime_from(String time_from){
        this.params.put("time_from",time_from);
        return this;
    }

    public ZabbixAlertGetRequest setTime_from(long time_from){
        return setTime_from(String.valueOf(time_from));
    }

    /**
     * 返回在给定时间之前生成的警报。
     */
    private ZabbixAlertGetRequest setTime_till(String time_till){
        this.params.put("time_till",time_till);
        return this;
    }

    public ZabbixAlertGetRequest setTime_till(long time_till){
        return setTime_till(String.valueOf(time_till));
    }


    private ZabbixAlertGetRequest setLimit(String time_till){
        this.params.put("time_till",time_till);
        return this;
    }



    public ZabbixAlertGetRequest addFilter(String key,Object value){
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
