package com.codev.mall.admin.service.impl;
 


import com.codev.mall.admin.entity.Admininfo;
import com.codev.mall.admin.mapper.AdmininfoMapper;
import com.codev.mall.admin.service.IAdmininfoService;
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
public class AdmininfoServiceImpl extends ServiceImpl<AdmininfoMapper, Admininfo> implements IAdmininfoService {
 
 
	@Autowired
    private AdmininfoMapper admininfoMapper;

    protected AdmininfoMapper getMapper() {
        return admininfoMapper;
    }
 
	@Override
	public List<Admininfo> selectPage(PageQueryBody<Admininfo> vo) {
		Page<Admininfo> page = new Page<Admininfo>(vo.getPage(), vo.getSize());
		Page<Admininfo> AdmininfoIPage = getMapper().selectPage(page, Wrappers.<Admininfo>lambdaQuery());
		List<Admininfo> records = AdmininfoIPage.getRecords();
		return records;
	}
 
 
}
