package com.codev.mall.user.service.impl;
 


import com.codev.mall.user.entity.Member;
import com.codev.mall.user.mapper.MemberMapper;
import com.codev.mall.user.service.IMemberService;
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
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements IMemberService {
 
 
	@Autowired
    private MemberMapper memberMapper;

    protected MemberMapper getMapper() {
        return memberMapper;
    }
 
	@Override
	public List<Member> selectPage(PageQueryBody<Member> vo) {
		Page<Member> page = new Page<Member>(vo.getPage(), vo.getSize());
		Page<Member> MemberIPage = getMapper().selectPage(page, Wrappers.<Member>lambdaQuery());
		List<Member> records = MemberIPage.getRecords();
		return records;
	}
 
 
}
