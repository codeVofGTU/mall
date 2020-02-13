package com.codev.mall.bus.service.impl;
 


import com.codev.mall.bus.entity.Business;
import com.codev.mall.bus.mapper.BusinessMapper;
import com.codev.mall.bus.service.IBusinessService;
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
public class BusinessServiceImpl extends ServiceImpl<BusinessMapper, Business> implements IBusinessService {
 
 
	@Autowired
    private BusinessMapper businessMapper;

    protected BusinessMapper getMapper() {
        return businessMapper;
    }
 
	@Override
	public List<Business> selectPage(PageQueryBody<Business> vo) {
		Page<Business> page = new Page<Business>(vo.getPage(), vo.getSize());
		Page<Business> BusinessIPage = getMapper().selectPage(page, Wrappers.<Business>lambdaQuery());
		List<Business> records = BusinessIPage.getRecords();
		return records;
	}
 
 
}
