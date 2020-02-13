package com.codev.mall.order.service;

import com.codev.mall.order.entity.Orderinfo;
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
public interface IOrderinfoService extends IService<Orderinfo> {
 
	
	/**
     *  分页查询
     * @param Orderinfo
     * @return
     */
	List<Orderinfo> selectPage(PageQueryBody<Orderinfo> vo);
}
