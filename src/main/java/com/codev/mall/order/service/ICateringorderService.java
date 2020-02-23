package com.codev.mall.order.service;

import com.codev.mall.order.entity.Cateringorder;
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
public interface ICateringorderService extends IService<Cateringorder> {
 
	
	/**
     *  分页查询
     * @param Cateringorder
     * @return
     */
	ResponseBodyBean<List<Cateringorder>> selectPage(PageQueryBody<Cateringorder> vo);
}
