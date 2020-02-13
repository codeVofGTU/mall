package com.codev.mall.bus.service;

import com.codev.mall.bus.entity.Business;
import com.baomidou.mybatisplus.extension.service.IService;
import com.codev.mall.base.PageQueryBody;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;
/**
 * <p>
 * $!{table.comment} 服务类
 * </p>
 *
 * @author godV
 * @since 2020-02-12
 */
public interface IBusinessService extends IService<Business> {
 
	
	/**
     *  分页查询
     * @param Business
     * @return
     */
	List<Business> selectPage(PageQueryBody<Business> vo);
}
