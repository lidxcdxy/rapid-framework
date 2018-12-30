package com.free.test;

import cn.org.rapid_framework.generator.GeneratorFacade;
import cn.org.rapid_framework.generator.GeneratorProperties;

public class GeneratorMain {

	/**
	 * 根据template包下的生成文件规则生成相关文件	
	 * 
	 * @param args
	 * @author Lidx
	 * @throws Exception 
	 * @since 2.0.0_2014-4-24
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("开始");
		GeneratorFacade g = new GeneratorFacade();
//		g.printAllTableNames();				//打印数据库中的表名称
		
		g.deleteOutRootDir();							//删除生成器的输出目录
//		g.generateByTable("table_name","template");	//通过数据库表生成文件,template为模板的根目录
		g.generateByAllTable("template");	//自动搜索数据库中的所有表并生成文件,template为模板的根目录
//		g.generateByClass(Blog.class,"template_clazz");
		 
//		g.deleteByTable("table_name", "template"); //删除生成的文件
		//打开文件夹
		Runtime.getRuntime().exec("cmd.exe /c start "+GeneratorProperties.getRequiredProperty("outRoot"));
		System.out.println("结束");
	
	}

}
