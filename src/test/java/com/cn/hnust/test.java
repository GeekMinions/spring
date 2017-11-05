package com.cn.hnust;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;

public class test {

	
	@Test  
	public void createTable() {  
	    // �����������ȫ������  
	    ProcessEngineConfiguration processEngineConfiguration = ProcessEngineConfiguration  
	            .createStandaloneProcessEngineConfiguration();  
	  
	    // �������ݵ�����  
	    processEngineConfiguration.setJdbcDriver("com.mysql.jdbc.Driver");  
	    processEngineConfiguration  
	            .setJdbcUrl("jdbc:mysql://localhost:3306/spring-webapp?useUnicode=true&characterEncoding=utf8");  
	    processEngineConfiguration.setJdbcUsername("root");  
	    processEngineConfiguration.setJdbcPassword("123456789");  
	   
	    /* 
	     * public static final String DB_SCHEMA_UPDATE_FALSE = "false"; �����Զ���������Ҫ����� 
	     * public static final String DB_SCHEMA_UPDATE_CREATE_DROP = "create-drop"; ��ɾ�����ٴ�����
	     *  public static final String DB_SCHEMA_UPDATE_TRUE = "true";��������ڣ��Զ������� 
	     */  
	    //��������ڣ��Զ�������  
	    processEngineConfiguration  
	            .setDatabaseSchemaUpdate(processEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);  
	    // �������ĺ��Ķ���ProcessEnginee����  
	    ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();  
	    System.out.println(processEngine);  
	  
	  
	}  
	
}
