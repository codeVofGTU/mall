package com.codev.mall.test.service.impl;
 


import com.codev.mall.test.entity.User;
import com.codev.mall.test.mapper.UserMapper;
import com.codev.mall.test.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
 
 
	@Autowired
    private UserMapper userMapper;

    protected UserMapper getMapper() {
        return userMapper;
    }
 
	@Override
	public List<User> selectPage(PageQueryBody<User> vo) {
		Page<User> page = new Page<User>(vo.getPage(), vo.getSize());
		Page<User> UserIPage = getMapper().selectPage(page, Wrappers.<User>lambdaQuery());
		List<User> records = UserIPage.getRecords();
		return records;
	}
 
 
}
