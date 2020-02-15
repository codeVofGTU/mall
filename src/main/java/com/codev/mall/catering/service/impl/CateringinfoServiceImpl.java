package com.codev.mall.catering.service.impl;
 


import com.codev.mall.catering.entity.Cateringinfo;
import com.codev.mall.catering.mapper.CateringinfoMapper;
import com.codev.mall.catering.service.ICateringinfoService;
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
public class CateringinfoServiceImpl extends ServiceImpl<CateringinfoMapper, Cateringinfo> implements ICateringinfoService {
 
 
	@Autowired
    private CateringinfoMapper cateringinfoMapper;

    protected CateringinfoMapper getMapper() {
        return cateringinfoMapper;
    }
 
	@Override
	public List<Cateringinfo> selectPage(PageQueryBody<Cateringinfo> vo) {
		Page<Cateringinfo> page = new Page<Cateringinfo>(vo.getPage(), vo.getSize());
		Page<Cateringinfo> CateringinfoIPage = getMapper().selectPage(page, Wrappers.<Cateringinfo>lambdaQuery());
		List<Cateringinfo> records = CateringinfoIPage.getRecords();
		return records;
	}
 
 
}
