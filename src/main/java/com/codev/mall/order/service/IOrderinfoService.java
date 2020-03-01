package com.codev.mall.order.service;

import com.codev.mall.order.entity.Orderinfo;
import com.codev.mall.order.vo.OrderinfoVO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.codev.mall.base.PageQueryBody;
import com.codev.mall.base.ResponseBodyBean;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;
/**
 * <p>
 * $!{table.comment} 服务类
 * </p>
 *
 * @author godV
 * @since 2020-02-16
 */
public interface IOrderinfoService extends IService<Orderinfo> {
 
	
	/**
     *  分页查询
     * @param Orderinfo
     * @return
     */
	ResponseBodyBean<List<Orderinfo>> selectPage(PageQueryBody<Orderinfo> vo);
	
	
	/**
     *  查询全部
     * @param Orderinfo
     * @return
     */
	List<OrderinfoVO> getAllOrderinfo(Integer oseq);
	
}
