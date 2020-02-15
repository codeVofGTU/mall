package com.codev.mall.massage.service.impl;
 


import com.codev.mall.massage.entity.Massage;
import com.codev.mall.massage.mapper.MassageMapper;
import com.codev.mall.massage.service.IMassageService;
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
 * @since 2020-02-15
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
	public List<Massage> selectPage(PageQueryBody<Massage> vo) {
		Page<Massage> page = new Page<Massage>(vo.getPage(), vo.getSize());
		Page<Massage> MassageIPage = getMapper().selectPage(page, Wrappers.<Massage>lambdaQuery());
		List<Massage> records = MassageIPage.getRecords();
		return records;
	}
 
 
}
