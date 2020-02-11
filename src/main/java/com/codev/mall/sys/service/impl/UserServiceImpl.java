package com.codev.mall.sys.service.impl;
 


import com.codev.mall.base.PageQueryBody;
import com.codev.mall.sys.entity.User;
import com.codev.mall.sys.mapper.UserMapper;
import com.codev.mall.sys.service.IUserService;

import lombok.extern.slf4j.Slf4j;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
 * @since 2020-01-20
 */
@Slf4j
@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
 
 
	@Autowired
    private UserMapper userMapper;

    protected UserMapper getMapper() {
        return userMapper;
    }
 
	@Override
	public List<User> selectPage(PageQueryBody<User> vo) {
		log.info(vo.getPage()+""+vo.getSize());
		Page<User> page = new Page<User>(vo.getPage(), vo.getSize());
		Page<User> userIPage =  userMapper.selectPage(page, Wrappers.<User>lambdaQuery());
		List<User> records = userIPage.getRecords();
		return records;
	}
 
 
}
