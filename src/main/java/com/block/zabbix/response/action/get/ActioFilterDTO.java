package com.block.zabbix.response.action.get;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 动作过滤
 * action filter 对象定义执行配置的操作必须满足的一组条件。它具有以下属性。
 */
public class ActioFilterDTO {

    /**
     * 过滤条件评估方法。
     * (必要)
     * 可能值:
     * 0 - and/or;
     * 1 - and;
     * 2 - or;
     * 3 - 自定义表达式。
     */
    @JsonProperty("evaltype")
    public String evaltype;

    /**
     * 用户定义的表达式，用于使用自定义表达式计算过滤器的条件。
     * 表达式必须包含通过其“formulaid”引用特定筛选条件的id。
     * 表达式中使用的id必须与过滤器条件中定义的id完全匹配；
     */
    @JsonProperty("formula")
    public String formula;

    /**
     * 用于筛选结果的筛选条件集
     * (必要)
     */
    @JsonProperty("conditions")
    public List<ActionFilterConditionDTO> conditions;

    /**
     * (只读) 用户定义的表达式，用于评估具有自定义表达式的过滤器的条件。
     * 表达式必须包含通过其formulaid引用特定过滤条件的ID。
     * 表达式中使用的ID必须与过滤条件中定义的ID完全匹配：没有条件可以保持未使用或省略。
     *
     * 必要 自定义表达式过滤器。
     */
    @JsonProperty("eval_formula")
    public String evalFormula;

}
