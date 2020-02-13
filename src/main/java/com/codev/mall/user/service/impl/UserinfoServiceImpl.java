package com.codev.mall.user.service.impl;
 


import com.codev.mall.user.entity.Userinfo;
import com.codev.mall.user.mapper.UserinfoMapper;
import com.codev.mall.user.service.IUserinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codev.mall.base.PageQueryBody;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * <p>
 * $!{table.comment} 服务实现类
 * </p>
 *
 * @author godV
 * @since 2020-02-12
 */
@Service
@Transactional
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, Userinfo> implements IUserinfoService {
 
 
	@Autowired
    private UserinfoMapper userinfoMapper;

    protected UserinfoMapper getMapper() {
        return userinfoMapper;
    }
 
	@Override
	public List<Userinfo> selectPage(PageQueryBody<Userinfo> vo) {
		Page<Userinfo> page = new Page<Userinfo>(vo.getPage(), vo.getSize());
		Page<Userinfo> UserinfoIPage = getMapper().selectPage(page, Wrappers.<Userinfo>lambdaQuery());
		List<Userinfo> records = UserinfoIPage.getRecords();
		return records;
	}
 
 
}
