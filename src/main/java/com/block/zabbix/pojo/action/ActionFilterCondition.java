package com.block.zabbix.pojo.action;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 动作过滤条件对象定义在运行操作动作之前必须检查的特定条件。
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionFilterCondition {

    /**
     * (只读) 动作条件的ID。
     */
    public String conditionid;

    /**
     * 条件类型。
     * (必要)
     * 触发操作的可能值:
     * 0 - 主机组;
     * 1 - 主机;
     * 2 - 触发器;
     * 3 - 触发器名称;
     * 4 - 触发严重程度;
     * 6 - 时间段;
     * 13 - 主机模板;
     * 15 - 应用;
     * 16 - 维护状态;
     * 25 - 事件标签;
     * 26 - 事件标记值.
     *
     * 发现操作的可能值:
     * 7 - 主机 IP;
     * 8 - 发现服务类型;
     * 9 - 发现服务端口;
     * 10 - 发现状态;
     * 11 - 正常运行时间或停机时间;
     * 12 - 收到的价值;
     * 18 - 发现规则;
     * 19 - 发现检查;
     * 20 - proxy;
     * 21 - 发现对象.
     *
     * 自动注册操作的可能值:
     * 20 - proxy;
     * 22 - 主机名;
     * 24 - 主机元数据.
     *
     * 内部操作的可能值:
     * 0 - 主机组;
     * 1 - 主机;
     * 13 - 主机模板;
     * 15 - 应用;
     * 23 - 事件类型.
     */
    public int conditiontype;

    /**
     * 	要与之比较的值。
     * 	(必要)
     */
    public String value;

    /**
     * 要与之比较的辅助值。条件类型为 26 时触发操作所必需的。
     */
    public String value2;

    /**
     * (只读) 条件所属操作的ID.
     */
    public String actionid;

    /**
     * 用于自定义表达式引用条件的任意唯一ID。
     * 只能包含大写字母。
     * 用户在修改过滤条件时必须定义ID，但在以后请求时会重新生成。
     */
    public String formulaid;

    /**
     * 条件运算符。
     *
     * 可能的值:
     * 0 - (default) =;
     * 1 - <>;
     * 2 - like;
     * 3 - not like;
     * 4 - in;
     * 5 - >=;
     * 6 - <=;
     * 7 - not in.
     */
    public int operator;

    public ActionFilterCondition() {
        super();
    }

    public ActionFilterCondition(int conditiontype,int operator,String value,String formulaid) {
        super();
        this.conditiontype=conditiontype;
        this.operator=operator;
        this.value=value;
        this.formulaid=formulaid;
    }

    public String getConditionid() {
        return conditionid;
    }

    public void setConditionid(String conditionid) {
        this.conditionid = conditionid;
    }

    public int getConditiontype() {
        return conditiontype;
    }

    public void setConditiontype(int conditiontype) {
        this.conditiontype = conditiontype;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getActionid() {
        return actionid;
    }

    public void setActionid(String actionid) {
        this.actionid = actionid;
    }

    public String getFormulaid() {
        return formulaid;
    }

    public void setFormulaid(String formulaid) {
        this.formulaid = formulaid;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }
}
