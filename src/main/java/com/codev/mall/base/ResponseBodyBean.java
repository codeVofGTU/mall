package com.codev.mall.base;

import lombok.Getter;
import lombok.Setter;

/**
 * 返回Response信息.
 * Message都经过了MessageResource的转换
 * 
 */
@Getter
@Setter
public class ResponseBodyBean<T> {
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
    
    /**
     * 添加或修改成功后，将成功的实体渲染给客户端
     */
    private long count;

	

	public ResponseBodyBean(int errorCode, String message, T entity) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.entity = entity;
	}

	public ResponseBodyBean(int errorCode) {
		super();
		this.errorCode = errorCode;
	}

	public ResponseBodyBean(String message) {
		super();
		this.message = message;
	}

	public ResponseBodyBean(T entity) {
		super();
		this.entity = entity;
	}

	
	public ResponseBodyBean(T entity,long count) {
		super();
		this.entity = entity;
		this.count = count;
	}
	
	public ResponseBodyBean(int errorCode, String message) {
		super();
		this.errorCode = errorCode;
		this.message = message;
	}

	public ResponseBodyBean(int errorCode, T entity) {
		super();
		this.errorCode = errorCode;
		this.entity = entity;
	}

	public ResponseBodyBean(String message, T entity) {
		super();
		this.message = message;
		this.entity = entity;
	}

    
}
