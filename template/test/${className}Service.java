<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.service;

<#include "/java_imports.include">

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 * 
 * ${className}service接口
 * 
 * @author Lidx
 * @since 2.0.0_2014-5-8
 */
public interface ${className}Service{
	/**
	 * 
	 * 新增方法
	 * 
	 * @author Lidx
	 * @since 2.0.0_2014-5-8
	 */
	public void save(${className} entity) throws Exception;
	/**
	 * 
	 * 修改方法
	 * 
	 * @author Lidx
	 * @since 2.0.0_2014-5-8
	 */
	public void update(${className} entity) throws Exception;
	/**
	 * 
	 * 删除方法
	 * 
	 * @author Lidx
	 * @since 2.0.0_2014-5-8
	 */
	public void delete(${className} entity) throws Exception;
	/**
	 * 
	 * list查询
	 * 
	 * @author Lidx
	 * @since 2.0.0_2014-5-8
	 */
	public List<${className}> list() throws Exception;
	/**
	 * 
	 * 分页查询
	 * 
	 * @author Lidx
	 * @since 2.0.0_2014-5-8
	 */
	public  List<${className}> ${className}PageQuery(${className}Vo ${className}Vo) throws Exception;
	/**
	 * 
	 * get方法
	 * 
	 * @author Lidx
	 * @since 2.0.0_2014-5-8
	 */
	public  ${className} get() throws Exception;
	/**
	 * 
	 * findCount方法
	 * 
	 * @author Lidx
	 * @since 2.0.0_2014-5-8
	 */
	public Long findCount() throws Exception;
}