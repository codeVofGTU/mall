package com.codev.mall.orm.service.impl;
 


import com.codev.mall.orm.entity.Mallorder;
import com.codev.mall.orm.mapper.MallorderMapper;
import com.codev.mall.orm.service.IMallorderService;
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
 * @since 2020-01-21
 */
@Service
@Transactional
public class MallorderServiceImpl extends ServiceImpl<MallorderMapper, Mallorder> implements IMallorderService {
 
 
	@Autowired
    private MallorderMapper mallorderMapper;

    protected MallorderMapper getMapper() {
        return mallorderMapper;
    }
 
	@Override
	public List<Mallorder> selectPage(PageQueryBody<Mallorder> vo) {
		Page<Mallorder> page = new Page<Mallorder>(vo.getPage(), vo.getSize());
		Page<Mallorder> MallorderIPage = getMapper().selectPage(page, Wrappers.<Mallorder>lambdaQuery());
		List<Mallorder> records = MallorderIPage.getRecords();
		return records;
	}
 
 
}
