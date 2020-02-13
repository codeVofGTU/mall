package com.codev.mall.order.service.impl;
 


import com.codev.mall.order.entity.Cateringorder;
import com.codev.mall.order.mapper.CateringorderMapper;
import com.codev.mall.order.service.ICateringorderService;
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
public class CateringorderServiceImpl extends ServiceImpl<CateringorderMapper, Cateringorder> implements ICateringorderService {
 
 
	@Autowired
    private CateringorderMapper cateringorderMapper;

    protected CateringorderMapper getMapper() {
        return cateringorderMapper;
    }
 
	@Override
	public List<Cateringorder> selectPage(PageQueryBody<Cateringorder> vo) {
		Page<Cateringorder> page = new Page<Cateringorder>(vo.getPage(), vo.getSize());
		Page<Cateringorder> CateringorderIPage = getMapper().selectPage(page, Wrappers.<Cateringorder>lambdaQuery());
		List<Cateringorder> records = CateringorderIPage.getRecords();
		return records;
	}
 
 
}
