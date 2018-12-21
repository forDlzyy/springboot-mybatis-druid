package com.example.mybatisdemo.domain.common;

import java.io.Serializable;

/***
 * 返回数据封装类
 * Created by qingbiao.zhu on 2018/05/30.
 *
 */
public class ResultData implements Serializable {
	private static final long serialVersionUID = 1L;

	static String errMessage_void = null;
	static Object[] result_void = null;
	
	private int errCode;
	private String errMessage;
	private Object[] result;

	public ResultData(int errCode,String errMessage, Object[] result) {
		super();
		this.errCode = errCode;
		this.errMessage = errMessage;
		this.result = result;
	}
	
	public ResultData() {
		super();
	}

	public ResultData(Object[] result) {
		this(Status.OK,Status.OK_MSG, result);
	}

	public String getErrMessage() {
		return errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public int getErrCode() {
		return errCode;
	}

	public void setErrCode(int errCode) {
		this.errCode = errCode;
	}

	public void setResult(Object[] result) {
		this.result = result;
	}

	public Object[] getResult() {
		return result;
	}

	@Override
	public String toString() {
		return "Result [errCode=" + errCode + ", errMessage=" + errMessage + ", result=" + result + "]";
	}

	public static ResultData okMsg(){
		return new ResultData(Status.OK,Status.OK_MSG,result_void);
	}
	
	public static ResultData okMsg(String errMessage){
		return new ResultData(Status.OK,errMessage,result_void);
	}
	
	public static ResultData ok(Object[] result){
		return new ResultData(Status.OK,Status.OK_MSG,result);
	}
	
	public static ResultData ok(String msg, Object[] result){
		return new ResultData(Status.OK,msg,result);
	}
	
	public static ResultData fail(int errCode){
		return new ResultData(errCode,errMessage_void,result_void);
	}
	
	public static ResultData fail(int errCode, String errMessage){
		return new ResultData(errCode,errMessage,result_void);
	}
	
	public static ResultData fail(int errCode, String errMessage, Object[] result){
		return new ResultData(errCode,errMessage,result);
	}
}
