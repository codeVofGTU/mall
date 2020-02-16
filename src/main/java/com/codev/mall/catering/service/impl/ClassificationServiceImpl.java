package com.codev.mall.catering.service.impl;
 


import com.codev.mall.catering.entity.Classification;
import com.codev.mall.catering.mapper.ClassificationMapper;
import com.codev.mall.catering.service.IClassificationService;
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
public class ClassificationServiceImpl extends ServiceImpl<ClassificationMapper, Classification> implements IClassificationService {
 
 
	@Autowired
    private ClassificationMapper classificationMapper;

    protected ClassificationMapper getMapper() {
        return classificationMapper;
    }
 
	@Override
	public ResponseBodyBean<List<Classification>> selectPage(PageQueryBody<Classification> vo) {
		Page<Classification> page = new Page<Classification>(vo.getPage(), vo.getSize());
		Page<Classification> ClassificationIPage = getMapper().selectPage(page, Wrappers.<Classification>lambdaQuery());
		List<Classification> records = ClassificationIPage.getRecords();
		return new ResponseBodyBean<List<Classification>>(records, ClassificationIPage.getTotal());
	}
 
 
}
