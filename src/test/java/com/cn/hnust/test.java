package com.cn.hnust;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;

public class test {

	
	@Test  
	public void createTable() {  
	    // 工作流引擎的全部配置  
	    ProcessEngineConfiguration processEngineConfiguration = ProcessEngineConfiguration  
	            .createStandaloneProcessEngineConfiguration();  
	  
	    // 链接数据的配置  
	    processEngineConfiguration.setJdbcDriver("com.mysql.jdbc.Driver");  
	    processEngineConfiguration  
	            .setJdbcUrl("jdbc:mysql://localhost:3306/spring-webapp?useUnicode=true&characterEncoding=utf8");  
	    processEngineConfiguration.setJdbcUsername("root");  
	    processEngineConfiguration.setJdbcPassword("123456789");  
	   
	    /* 
	     * public static final String DB_SCHEMA_UPDATE_FALSE = "false"; 不能自动创建表，需要表存在 
	     * public static final String DB_SCHEMA_UPDATE_CREATE_DROP = "create-drop"; 先删除表再创建表
	     *  public static final String DB_SCHEMA_UPDATE_TRUE = "true";如果表不存在，自动创建表 
	     */  
	    //如果表不存在，自动创建表  
	    processEngineConfiguration  
	            .setDatabaseSchemaUpdate(processEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);  
	    // 工作流的核心对象，ProcessEnginee对象  
	    ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();  
	    System.out.println(processEngine);  
	  
	  
	}  
	
}
