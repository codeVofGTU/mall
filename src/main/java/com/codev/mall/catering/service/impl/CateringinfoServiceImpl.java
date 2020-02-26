package com.codev.mall.catering.service.impl;
 


import com.codev.mall.catering.entity.Cateringinfo;
import com.codev.mall.catering.mapper.CateringinfoMapper;
import com.codev.mall.catering.service.ICateringinfoService;
import com.codev.mall.catering.service.IClassificationService;
import com.codev.mall.catering.vo.CateringinfoVO;
import com.codev.mall.util.MapObjUtil;

import lombok.extern.slf4j.Slf4j;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codev.mall.base.PageQueryBody;
import com.codev.mall.base.ResponseBodyBean;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
@Slf4j
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
		QueryWrapper<Cateringinfo> qw = new QueryWrapper<>();
		Map<String,Object> params = new HashMap<String, Object>();
		params=MapObjUtil.object2Map(vo.getEntity());
		log.info(params.toString());
		qw.allEq(params, false);
		//Page<Cateringinfo> CateringinfoIPage = getMapper().selectPage(page, Wrappers.<Cateringinfo>lambdaQuery().eq(Cateringinfo::getCcseq,vo.getEntity().getCcseq()));
		Page<Cateringinfo> CateringinfoIPage = getMapper().selectPage(page, qw);
		List<Cateringinfo> records = CateringinfoIPage.getRecords();
		return new ResponseBodyBean<List<Cateringinfo>>(records, CateringinfoIPage.getTotal());
	}

	@Override
	public List<CateringinfoVO> selectAll() {
//		List<CateringinfoVO> listVO = new ArrayList();
//		QueryWrapper<Classification> wrapper = new QueryWrapper();
//		List<Cateringinfo> infoList = this.getMapper().selectList(null);
//		for (Cateringinfo cateringinfo : infoList) {
//			Classification classification = classificationService.getOne(wrapper.eq("seq", cateringinfo.getCcseq()));
//			CateringinfoVO vo = this.cloneBean(cateringinfo,classification);
//			listVO.add(vo);
//		}
//		return listVO;
		return this.getMapper().getCateringinfoAll();
	}
	
//	private CateringinfoVO cloneBean(Cateringinfo info,Classification classification) {
////		CateringinfoVO vo = new CateringinfoVO(info.getSeq(),
////				info.getCateringname(),classification,info.getNum(),
////				info.getPrice(),info.getInfo(),info.getPicturePath(),info.getBseq());
////		return vo;
//	}
 
 
}
