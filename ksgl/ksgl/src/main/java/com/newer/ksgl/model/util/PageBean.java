package com.newer.ksgl.model.util;

import java.util.List;

/**
 * 分页工具类
 * 
 * @author Sony
 *
 */
public class PageBean<T> {
	// 属性
	private List<T> data; // 对象集合
	private int pageNo; // 当前页码
	private int pageSize; // 每页显示数据大小
	private int totalPage; // 总页数
	private int total; // 总记录数

	// 方法
	public PageBean() {
	}

	public PageBean(List<T> data, int pageNo, int pageSize, int totalPage,
			int total) {
		super();
		this.data = data;
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.totalPage = totalPage;
		this.total = total;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		return total%pageSize==0?total/pageSize:total/pageSize+1;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	// 自定义方法
	// 首页
	public int getFirstPage() {
		return 1;
	}

	// 上一页
	public int getUpPage() {
		if (pageNo == 1) {
			return 1;
		}
		return pageNo - 1;
	}

	// 下一页
	public int getDownPage() {
		if (pageNo == getTotalPage()) {
			return getTotalPage();
		}
		return pageNo + 1;
	}

	// 末页
	public int getLastPage() {
		return getTotalPage();
	}

}
