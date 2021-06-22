package com.block.zabbix.response.action.get;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActionOperationConditionDTO {

    /**
     * (readonly) 动作操作条件的 ID
     */
    @JsonProperty("opconditionid")
    String opconditionid;
    /**
     * 条件的类型。
     * (required)
     * 可能的值:
     * 14 - event acknowledged.
     */
    @JsonProperty("conditiontype")
    String conditiontype;
    /**
     * 与之比较的值。
     * (required)
     */
    @JsonProperty("value")
    String value;
    /**
     * (readonly) 动作操作的 ID
     */
    @JsonProperty("operationid")
    String operationid;
    /**
     * 条件运算符
     *
     * 可能的值：
     * 0 - (default) =.
     *
     * 每个操作条件类型都支持以下运算符和值。
     *
     * 条件	条件名称	支持的运算	期望值
     * 14	Event acknowledged	=	件是否被确认。
     *
     * 可能的值:
     * 0 - 没有确认;
     * 1 - 已确认。
     */
    @JsonProperty("operator")
    String operator;

}
