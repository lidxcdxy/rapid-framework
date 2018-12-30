<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.service.impl;

<#include "/java_imports.include">

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yunda.app.entity.vo.Page;
/**
 * 
 * ${className}service实现类
 * 
 * @author Lidx
 * @since 2.0.0_2014-5-8
 */
@Service
@Transactional(rollbackFor = Exception.class, readOnly = true)
public class ${className}ServiceImpl{
	@Resource
	private ${className}Dao ${className}Dao;
	
	/**
	 * 
	 * 新增方法
	 * 
	 * @author Lidx
	 * @since 2.0.0_2014-5-8
	 */
	public void save(${className} entity) throws Exception{
		${className}Dao.save(entity);
	}
	/**
	 * 
	 * 修改方法
	 * 
	 * @author Lidx
	 * @since 2.0.0_2014-5-8
	 */
	public void update(${className} entity) throws Exception{
		${className}Dao.update(entity);
	}
	/**
	 * 
	 * 删除方法
	 * 
	 * @author Lidx
	 * @since 2.0.0_2014-5-8
	 */
	public void delete(String id) throws Exception{
		${className}Dao.delete(id);
	}
	/**
	 * 
	 * get方法
	 * 
	 * @author Lidx
	 * @since 2.0.0_2014-5-8
	 */
	public ${className} get(String id) throws Exception{
		${className}Dao.get(id);
	}
	/**
	 * 
	 * findCount方法
	 * 
	 * @author Lidx
	 * @since 2.0.0_2014-5-8
	 */
	public Long findCount() throws Exception{
		${className}Dao.findCount();
	}
	/**
	 * 
	 * list查询
	 * 
	 * @author Lidx
	 * @since 2.0.0_2014-5-8
	 */
	public List<${className}> list() throws Exception{
		return ${className}Dao.list();
	}
	/**
	 * 
	 * 分页查询
	 * 
	 * @author Lidx
	 * @since 2.0.0_2014-5-8
	 */
	public Page ${className}PageQuery(${className}Vo ${className}Vo) throws Exception{
		Page page = null;
		try {
			List<Map> list = ${className}Dao.${className}PageQuery(${className}Vo);
			if (null != list) {
				page = new Page(${className}Vo.getTotal(), list);
			} else {
				page = new Page();
			}
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
		return null == page ? new Page() : page;
	}
}