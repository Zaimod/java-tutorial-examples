package org.o7planning.springjdbc.demo;

import java.util.List;

import org.o7planning.springjdbc.config.AppConfiguration;
import org.o7planning.springjdbc.dao.QueryWithResultSetExtractorDAO;
import org.o7planning.springjdbc.model.Department;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QueryWithResultSetExtractor_Test  {
	public static void main(String[] args) {
	      ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
	      
	      QueryWithResultSetExtractorDAO dao = context.getBean(QueryWithResultSetExtractorDAO.class);
	      
	      List<Department> departments = dao.queryDepartments();
	      
	      System.out.println(departments);
	      
	      for(Department dep: departments) {
	    	  System.out.println("Department Name: "+dep.getDeptName());
	      }
	}
}
