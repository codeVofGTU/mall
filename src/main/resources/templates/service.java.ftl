package ${package.Service};

import ${package.Entity}.${entity};
import ${superServiceClassPackage};
import com.codev.mall.base.PageQueryBody;
import com.codev.mall.base.ResponseBodyBean;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;
/**
 * <p>
 * $!{table.comment} 服务类
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
public interface ${table.serviceName} extends ${superServiceClass}<${entity}> {
 
	
	/**
     *  分页查询
     * @param ${entity}
     * @return
     */
	ResponseBodyBean<List<${entity}>> selectPage(PageQueryBody<${entity}> vo);
}
