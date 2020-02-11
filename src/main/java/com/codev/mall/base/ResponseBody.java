package com.codev.mall.base;
/**
 * 返回Response信息.
 * Message都经过了MessageResource的转换
 * 
 */
public class ResponseBody<T> {
	/***
     * 错误代码
     */
    private int errorCode = 0;

    /***
     * Global Message.
     */
    private String message;

    /**
     * 添加或修改成功后，将成功的实体渲染给客户端
     */
    private T entity;

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getEntity() {
		return entity;
	}

	public void setEntity(T entity) {
		this.entity = entity;
	}

	public ResponseBody(int errorCode, String message, T entity) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.entity = entity;
	}

	public ResponseBody(int errorCode) {
		super();
		this.errorCode = errorCode;
	}

	public ResponseBody(String message) {
		super();
		this.message = message;
	}

	public ResponseBody(T entity) {
		super();
		this.entity = entity;
	}

	public ResponseBody(int errorCode, String message) {
		super();
		this.errorCode = errorCode;
		this.message = message;
	}

	public ResponseBody(int errorCode, T entity) {
		super();
		this.errorCode = errorCode;
		this.entity = entity;
	}

	public ResponseBody(String message, T entity) {
		super();
		this.message = message;
		this.entity = entity;
	}

    
}
