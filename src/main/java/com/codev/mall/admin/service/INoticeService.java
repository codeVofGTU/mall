package com.codev.mall.admin.service;

import com.codev.mall.admin.entity.Notice;
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
public interface INoticeService extends IService<Notice> {
 
	
	/**
     *  分页查询
     * @param Notice
     * @return
     */
	List<Notice> selectPage(PageQueryBody<Notice> vo);
}
