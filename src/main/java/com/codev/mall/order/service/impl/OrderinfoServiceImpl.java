package com.codev.mall.order.service.impl;
 


import com.codev.mall.order.entity.Orderinfo;
import com.codev.mall.order.mapper.OrderinfoMapper;
import com.codev.mall.order.service.IOrderinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codev.mall.base.PageQueryBody;
import com.codev.mall.base.ResponseBodyBean;
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
 * @since 2020-02-16
 */
@Service
@Transactional
public class OrderinfoServiceImpl extends ServiceImpl<OrderinfoMapper, Orderinfo> implements IOrderinfoService {
 
 
	@Autowired
    private OrderinfoMapper orderinfoMapper;

    protected OrderinfoMapper getMapper() {
        return orderinfoMapper;
    }
 
	@Override
	public ResponseBodyBean<List<Orderinfo>> selectPage(PageQueryBody<Orderinfo> vo) {
		Page<Orderinfo> page = new Page<Orderinfo>(vo.getPage(), vo.getSize());
		Page<Orderinfo> OrderinfoIPage = getMapper().selectPage(page, Wrappers.<Orderinfo>lambdaQuery());
		List<Orderinfo> records = OrderinfoIPage.getRecords();
		return new ResponseBodyBean<List<Orderinfo>>(records, OrderinfoIPage.getTotal());
	}
 
 
}
