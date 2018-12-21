package com.example.mybatisdemo.domain.common;

import java.io.Serializable;

/***
 * 返回数据封装类
 * 
 * Created by qingbiao.zhu on 2018/05/30.
 *
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class Result<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	static String result_void = null;
	//异常信息
	private String msg;
	//状态码
	private int status;
	//返回的实体数据
	private T data;

	public Result(int status, String msg, T data) {
		super();
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

	public Result() {
		super();
	}

	public Result(T data) {
		this(Status.OK, Status.OK_MSG, data);
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Result [msg=" + msg + ", status=" + status + ", data=" + data + "]";
	}

	public static Result okMsg() {
		return new Result(Status.OK, Status.OK_MSG, result_void);
	}

	public static Result okMsg(String msg) {
		return new Result(Status.OK, msg, result_void);
	}

	public static <T> Result<T> ok(T data) {
		return new Result(Status.OK, Status.OK_MSG, data);
	}

	public static <T> Result<T> ok(String msg, T data) {
		return new Result(Status.OK, msg, data);
	}

	public static Result fail(int status) {
		return new Result(status, result_void, result_void);
	}

	public static Result fail(int status, String msg) {
		return new Result(status, msg, result_void);
	}

	public static <T> Result<T> fail(int status, String msg, T data) {
		return new Result(status, msg, data);
	}
}
