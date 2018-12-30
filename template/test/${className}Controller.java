<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.controller;

<#include "/java_imports.include">

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yunda.app.entity.vo.Message;
/**
 * 
 * ${className}Controller
 * 
 * @author Lidx
 * @since 2.0.0_2014-5-8
 */
@Controller               
@RequestMapping(value = "/${className}")
public class ${className}Controller{
	@Resource
	private ${className}Service ${className}Service;
	/**
	 * 
	 * 新增方法
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author Lidx
	 * @since 2.0.0_2014-5-8
	 */
	@RequestMapping(value = "/save.do")
	@ResponseBody
	public Message save(HttpServletRequest request,HttpServletResponse response) throws Exception{
		Message message = new Message(false, "操作失败");
		try{
			${className}Service.save(${className} entity);
			message = new Message(true,"操作成功");
		}catch(Exception e){
			LOG.error("save方法出错",e);
		}
		return message;
	}
	/**
	 * 
	 * 修改方法
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author Lidx
	 * @since 2.0.0_2014-5-8
	 */
	@RequestMapping(value = "/update.do")
	@ResponseBody
	public Message update(HttpServletRequest request,HttpServletResponse response) throws Exception{
		Message message = new Message(false, "操作失败");
		try{
			${className}Service.update(${className} entity);
			message = new Message(true,"操作成功");
		}catch(Exception e){
			LOG.error("update方法出错",e);
		}
		return message;
	}
	/**
	 * 
	 * 删除方法
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author Lidx
	 * @since 2.0.0_2014-5-8
	 */
	@RequestMapping(value = "/delete.do")
	@ResponseBody
	public Message delete(HttpServletRequest request,HttpServletResponse response) throws Exception{
		Message message = new Message(false, "操作失败");
		try{
			${className}Service.delete(${className} entity);
			message = new Message(true,"操作成功");
		}catch(Exception e){
			LOG.error("delete方法出错",e);
		}
		return message;
	}
	/**
	 * 
	 * 获取方法
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author Lidx
	 * @since 2.0.0_2014-5-8
	 */
	@RequestMapping(value = "/get.do")
	@ResponseBody
	public ${className} get(HttpServletRequest request,HttpServletResponse response) throws Exception{
		try{
			${className} ${className} = ${className}Service.get(${className} entity);
		}catch(Exception e){
			LOG.error("get方法出错",e);
		}
		return ${className};
	}
	/**
	 * 
	 * 查询数量方法
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author Lidx
	 * @since 2.0.0_2014-5-8
	 */
	@RequestMapping(value = "/fincCount.do")
	public Long findCount(HttpServletRequest request,HttpServletResponse response) throws Exception{
		try{
			Long count = ${className}Service.findCount(${className} entity);
		}catch(Exception e){
			LOG.error("findCount方法出错",e);
		}
		return count;
	}
	/**
	 * 
	 * list查询方法
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author Lidx
	 * @since 2.0.0_2014-5-8
	 */
	@RequestMapping(value = "/list.do")
	@ResponseBody
	public List<${className}> list(HttpServletRequest request,HttpServletResponse response) throws Exception{
		try{
			List<${className}> list = ${className}Service.list();
		}catch(Exception e){
			LOG.error("list方法出错",e);
		}
		 return list;
	}
	/**
	 * 
	 * 分页查询方法
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 * @author Lidx
	 * @since 2.0.0_2014-5-8
	 */
	@RequestMapping(value = "/PageQuery.do")
	@ResponseBody
	public Page ${className}PageQuery(HttpServletRequest request,HttpServletResponse response) throws Exception{
		try{
			Page page = ${className}Service.${className}PageQuery();
		}catch(Exception e){
			LOG.error("PageQuery方法出错",e);
		}
		 return page;
	}
}