package com.codev.mall.base;

public class PageQueryBody<T>  {
	
	 private T entity;
	 
	 private int page;
	 
	 private int size;
	 
	 private String orderby;

	public T getEntity() {
		return entity;
	}

	public void setEntity(T entity) {
		this.entity = entity;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getOrderby() {
		return orderby;
	}

	public void setOrderby(String orderby) {
		this.orderby = orderby;
	}

	public PageQueryBody(T entity, int page, int size, String orderby) {
		super();
		this.entity = entity;
		this.page = page;
		this.size = size;
		this.orderby = orderby;
	}

	public PageQueryBody(T entity, int page, int size) {
		super();
		this.entity = entity;
		this.page = page;
		this.size = size;
	}

	public PageQueryBody(int page, int size) {
		super();
		this.page = page;
		this.size = size;
	}

	public PageQueryBody() {
		super();
	}
	 
	
}
