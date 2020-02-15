package com.codev.mall.order.service;

import com.codev.mall.order.entity.Cateringorder;
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
 * @since 2020-02-15
 */
public interface ICateringorderService extends IService<Cateringorder> {
 
	
	/**
     *  分页查询
     * @param Cateringorder
     * @return
     */
	List<Cateringorder> selectPage(PageQueryBody<Cateringorder> vo);
}
