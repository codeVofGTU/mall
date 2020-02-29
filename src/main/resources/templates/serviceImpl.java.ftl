package ${package.ServiceImpl};
 


import ${package.Entity}.${entity};
import ${package.Mapper}.${table.mapperName};
import ${package.Service}.${table.serviceName};
import ${superServiceImplClassPackage};
import com.codev.mall.base.PageQueryBody;
import com.codev.mall.base.ResponseBodyBean;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
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
 * @author ${author}
 * @since ${date}
 */
@Service
@Transactional
public class ${table.serviceImplName} extends ${superServiceImplClass}<${table.mapperName}, ${entity}> implements ${table.serviceName} {
 
 
	@Autowired
    private ${table.entityName}Mapper ${table.entityPath}Mapper;

    protected ${table.entityName}Mapper getMapper() {
        return ${table.entityPath}Mapper;
    }
 
	@Override
	public IPage<${entity}> selectPage(PageQueryBody<${entity}> vo) {
		Page<${entity}> page = new Page<${entity}>(vo.getPage(), vo.getSize());
		IPage<${entity}> ${table.entityName}IPage = getMapper().selectPage(page, Wrappers.<${entity}>lambdaQuery());
		return IPage<${entity}> ${table.entityName}IPage;
	}
 
 
}
