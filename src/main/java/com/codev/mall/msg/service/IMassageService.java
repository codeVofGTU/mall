package com.codev.mall.msg.service;

import com.codev.mall.msg.entity.Massage;
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
public interface IMassageService extends IService<Massage> {
 
	
	/**
     *  分页查询
     * @param Massage
     * @return
     */
	List<Massage> selectPage(PageQueryBody<Massage> vo);
}
