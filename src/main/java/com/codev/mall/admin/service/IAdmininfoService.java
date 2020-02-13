package com.codev.mall.admin.service;

import com.codev.mall.admin.entity.Admininfo;
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
public interface IAdmininfoService extends IService<Admininfo> {
 
	
	/**
     *  分页查询
     * @param Admininfo
     * @return
     */
	List<Admininfo> selectPage(PageQueryBody<Admininfo> vo);
}
