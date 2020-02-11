package com.codev.mall.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


import lombok.extern.slf4j.Slf4j;
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {
	
//		@Resource
//	    private UserMapper userMapper;
//	  	
//
////	    @Test
////	    public void testSelect() {
////	        System.out.println(("----- selectAll method test ------"));
////	        List<User> userList = userMapper.selectList(null);
////	        Assert.assertEquals(5, userList.size());
////	        userList.forEach(System.out::println);
////	    }
//	    
//	    @Test
//	    public void tests1() {
//	        log.error("----------------------------------baseMapper 自带分页-------------------------------------------------------");
//	        Page<User> page = new Page<>(1, 5);
//	        Page<User> userIPage = userMapper.selectPage(page, Wrappers.<User>lambdaQuery().eq(User::getPassword, 123));
//	        assertThat(page).isSameAs(userIPage);
//	        log.error("总条数 -------------> {}", userIPage.getTotal());
//	        log.error("当前页数 -------------> {}", userIPage.getCurrent());
//	        log.error("当前每页显示数 -------------> {}", userIPage.getSize());
//	        List<User> records = userIPage.getRecords();
//	        assertThat(records).isNotEmpty();
//	   }
}
