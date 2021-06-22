package com.block.zabbix.pojo;

public class ZabbixUserMedia<T> {

    private String mediatypeid;
    /**
     * 地址, 用户名或者接收方的其他标识符。
     * 如果类型是 媒介类型 电子邮件, 值被设置为数组。 其他类型 媒介类型,值被设置为字符串。
     */
    private T sendto;
    /**
     * 是否启用媒体。
     * 可能的值:
     * 0 - (默认) enabled;
     * 1 - disabled.
     */
    private int active;
    /**
     * 触发发送通知告警级别。
     * 严重性以二进制形式存储，每一位表示相应的严重性。例如，12在二进制中等于1100，这意味着通知将由具有警告和平均级别的触发器发送。
     * 有关支持的触发器严重性的列表，请参阅触发器对象 。
     * 默认: 63
     */
    private int severity;
    /**
     * 	当通知可以作为 时间段 发送或者用分号隔开用户宏。
     * 默认: 1-7,00:00-24:00
     */
    private String period;

    public ZabbixUserMedia() {
        this.setSeverity(63);
        this.setPeriod("1-7,00:00-24:00");
    }

    public ZabbixUserMedia(String mediatypeid) {
        this();
        this.mediatypeid=mediatypeid;
    }

    public ZabbixUserMedia(int mediatypeid) {
        this();
        this.mediatypeid = String.valueOf(mediatypeid);
    }

    public ZabbixUserMedia(String mediatypeid,T sendto) {
        this();
        this.mediatypeid = mediatypeid;
        this.sendto = sendto;
    }

    public ZabbixUserMedia(int mediatypeid,T sendto) {
        this();
        this.mediatypeid = String.valueOf(mediatypeid);
        this.sendto = sendto;
    }

    public String getMediatypeid() {
        return mediatypeid;
    }

    public void setMediatypeid(String mediatypeid) {
        this.mediatypeid = mediatypeid;
    }

    public T getSendto() {
        return sendto;
    }

    public void setSendto(T sendto) {
        this.sendto = sendto;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
