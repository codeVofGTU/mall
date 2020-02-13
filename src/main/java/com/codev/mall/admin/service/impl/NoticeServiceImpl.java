package com.codev.mall.admin.service.impl;
 


import com.codev.mall.admin.entity.Notice;
import com.codev.mall.admin.mapper.NoticeMapper;
import com.codev.mall.admin.service.INoticeService;
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
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements INoticeService {
 
 
	@Autowired
    private NoticeMapper noticeMapper;

    protected NoticeMapper getMapper() {
        return noticeMapper;
    }
 
	@Override
	public List<Notice> selectPage(PageQueryBody<Notice> vo) {
		Page<Notice> page = new Page<Notice>(vo.getPage(), vo.getSize());
		Page<Notice> NoticeIPage = getMapper().selectPage(page, Wrappers.<Notice>lambdaQuery());
		List<Notice> records = NoticeIPage.getRecords();
		return records;
	}
 
 
}
