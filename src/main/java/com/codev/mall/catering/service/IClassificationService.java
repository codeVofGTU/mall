package com.codev.mall.catering.service;

import com.codev.mall.catering.entity.Classification;
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
public interface IClassificationService extends IService<Classification> {
 
	
	/**
     *  分页查询
     * @param Classification
     * @return
     */
	ResponseBodyBean<List<Classification>> selectPage(PageQueryBody<Classification> vo);
}
