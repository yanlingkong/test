package com.test.model;

/**
 * Created by liuc on 2018/1/8.
 */
public class ResponseJsonData<T> {
    /** String			消息code */
    private String code;
    /** String			访问异常说明 */
    private String msg;

    /** String			查询结果（json） */
    private T data;
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public ResponseJsonData() {
        super();
    }
    public ResponseJsonData(String code, String msg, T data) {
        super();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    @Override
    public String toString() {
        return "ResponseJsonAgainstDataOut [code=" + code + ", msg=" + msg + ", data=" + data + "]";
    }

}
