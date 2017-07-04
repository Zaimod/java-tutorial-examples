package org.o7planning.springjdbc.demo;
 
import java.sql.SQLException;
import java.util.List;
 
import org.o7planning.springjdbc.config.AppConfiguration;
import org.o7planning.springjdbc.dao.QueryWithRowMapperDAO;
import org.o7planning.springjdbc.model.Department;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
public class QueryWithRowMapper_Test {
 
    
    public static void main(String[] args) throws SQLException {
 
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
 
        QueryWithRowMapperDAO dao = context.getBean(QueryWithRowMapperDAO.class);
 
        List<Department> list = dao.queryDepartment() ;
        
        for(Department dept: list)  {
            System.out.println("DeptNo: "+ dept.getDeptNo()+" - DeptName: "+ dept.getDeptName());
        }
    }
    
}