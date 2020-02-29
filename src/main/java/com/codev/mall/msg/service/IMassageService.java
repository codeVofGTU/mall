package com.codev.mall.msg.service;

import com.codev.mall.msg.entity.Massage;
import com.codev.mall.msg.vo.MassageVO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.codev.mall.base.PageQueryBody;
import com.codev.mall.base.ResponseBodyBean;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.List;
/**
 * <p>
 * $!{table.comment} 服务类
 * </p>
 *
 * @author godV
 * @since 2020-02-29
 */
public interface IMassageService extends IService<Massage> {
 
	
	/**
     *  分页查询
     * @param Massage
     * @return IPage<Massage>
     */
	IPage<Massage> selectPage(PageQueryBody<Massage> vo);
	
	
	/**
	 * 查询所有
	 * 
	 * @return
	 */
	List<MassageVO> getMsgInfoAll();
}
