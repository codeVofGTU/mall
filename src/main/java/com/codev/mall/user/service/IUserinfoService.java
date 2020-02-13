package com.codev.mall.user.service;

import com.codev.mall.user.entity.Userinfo;
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
public interface IUserinfoService extends IService<Userinfo> {
 
	
	/**
     *  分页查询
     * @param Userinfo
     * @return
     */
	List<Userinfo> selectPage(PageQueryBody<Userinfo> vo);
}
