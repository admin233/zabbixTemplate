package com.block.zabbix.pojo.action;

/**
 * 动作操作条件
 * 动作操作条件对象定义了一个必须满足的条件来执行当前操作。
 */
public class ActionOperationCondition {
    /**
     * (readonly) 动作操作条件的 ID
     */
    String opconditionid;

    /**
     * 条件的类型。
     * (required)
     * 可能的值:
     * 14 - event acknowledged.
     */
    int conditiontype;

    /**
     * 与之比较的值。
     * (required)
     */
    String value;

    /**
     * (readonly) 动作操作的 ID
     */
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
    int operator;

    public String getOpconditionid() {
        return opconditionid;
    }

    public void setOpconditionid(String opconditionid) {
        this.opconditionid = opconditionid;
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

    public String getOperationid() {
        return operationid;
    }

    public void setOperationid(String operationid) {
        this.operationid = operationid;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }
}
