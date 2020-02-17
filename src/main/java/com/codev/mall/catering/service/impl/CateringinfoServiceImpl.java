package com.codev.mall.catering.service.impl;
 


import com.codev.mall.catering.entity.Cateringinfo;
import com.codev.mall.catering.entity.Classification;
import com.codev.mall.catering.mapper.CateringinfoMapper;
import com.codev.mall.catering.mapper.ClassificationMapper;
import com.codev.mall.catering.service.ICateringinfoService;
import com.codev.mall.catering.service.IClassificationService;
import com.codev.mall.catering.vo.CateringinfoVO;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codev.mall.base.PageQueryBody;
import com.codev.mall.base.ResponseBodyBean;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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
public class CateringinfoServiceImpl extends ServiceImpl<CateringinfoMapper, Cateringinfo> implements ICateringinfoService {
 
 
	@Autowired
    private CateringinfoMapper cateringinfoMapper;
	
	@Autowired
    private IClassificationService classificationService;

    protected CateringinfoMapper getMapper() {
        return cateringinfoMapper;
    }
 
	@Override
	public ResponseBodyBean<List<Cateringinfo>> selectPage(PageQueryBody<Cateringinfo> vo) {
		Page<Cateringinfo> page = new Page<Cateringinfo>(vo.getPage(), vo.getSize());
		Page<Cateringinfo> CateringinfoIPage = getMapper().selectPage(page, Wrappers.<Cateringinfo>lambdaQuery());
		List<Cateringinfo> records = CateringinfoIPage.getRecords();
		return new ResponseBodyBean<List<Cateringinfo>>(records, CateringinfoIPage.getTotal());
	}

	@Override
	public List<CateringinfoVO> selectAll() {
		List<CateringinfoVO> listVO = new ArrayList();
		QueryWrapper<Classification> wrapper = new QueryWrapper();
		List<Cateringinfo> infoList = this.getMapper().selectList(null);
		for (Cateringinfo cateringinfo : infoList) {
			Classification classification = classificationService.getOne(wrapper.eq("seq", cateringinfo.getCcseq()));
			CateringinfoVO vo = this.cloneBean(cateringinfo,classification);
			listVO.add(vo);
		}
		return listVO;
	}
	
	private CateringinfoVO cloneBean(Cateringinfo info,Classification classification) {
		CateringinfoVO vo = new CateringinfoVO(info.getSeq(),
				info.getCateringname(),classification,info.getNum(),
				info.getPrice(),info.getInfo(),info.getPicturePath(),info.getBseq());
		return vo;
	}
 
 
}
