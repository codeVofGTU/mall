package com.codev.mall.orm.service;

import com.codev.mall.orm.entity.Mallorder;
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
 * @since 2020-01-21
 */
public interface IMallorderService extends IService<Mallorder> {
 
	
	/**
     *  分页查询
     * @param Mallorder
     * @return
     */
	List<Mallorder> selectPage(PageQueryBody<Mallorder> vo);
}
