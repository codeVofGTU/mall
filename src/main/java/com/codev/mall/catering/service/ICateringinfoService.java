package com.codev.mall.catering.service;

import com.codev.mall.catering.entity.Cateringinfo;
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
public interface ICateringinfoService extends IService<Cateringinfo> {
 
	
	/**
     *  分页查询
     * @param Cateringinfo
     * @return
     */
	ResponseBodyBean<List<Cateringinfo>> selectPage(PageQueryBody<Cateringinfo> vo);
}
