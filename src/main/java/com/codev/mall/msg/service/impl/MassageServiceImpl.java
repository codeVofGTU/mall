package com.codev.mall.msg.service.impl;
 


import com.codev.mall.msg.entity.Massage;
import com.codev.mall.msg.mapper.MassageMapper;
import com.codev.mall.msg.service.IMassageService;
import com.codev.mall.msg.vo.MassageVO;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codev.mall.base.PageQueryBody;
import com.codev.mall.base.ResponseBodyBean;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
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
 * @since 2020-02-29
 */
@Service
@Transactional
public class MassageServiceImpl extends ServiceImpl<MassageMapper, Massage> implements IMassageService {
 
 
	@Autowired
    private MassageMapper massageMapper;

    protected MassageMapper getMapper() {
        return massageMapper;
    }
 
	@Override
	public IPage<Massage> selectPage(PageQueryBody<Massage> vo) {
		Page<Massage> page = new Page<Massage>(vo.getPage(), vo.getSize());
		IPage<Massage> MassageIPage = getMapper().selectPage(page, Wrappers.<Massage>lambdaQuery());
		return MassageIPage;
	}

	@Override
	public List<MassageVO> getMsgInfoAll() {
		// TODO Auto-generated method stub
		return this.getMapper().getMsgInfoAll();
	}
 
 
}
