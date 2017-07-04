package org.o7planning.springjdbc.demo;
 
import java.sql.SQLException;
 
import org.o7planning.springjdbc.config.AppConfiguration;
import org.o7planning.springjdbc.dao.QueryWithRowCallbackHandlerDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
public class QueryWithRowCallbackHandler_Test {
 
    
    public static void main(String[] args) throws SQLException {
 
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
 
        QueryWithRowCallbackHandlerDAO dao = context.getBean(QueryWithRowCallbackHandlerDAO.class);
 
        dao.queryEmployee();
    }
    
}