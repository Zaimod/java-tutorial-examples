package org.o7planning.springjdbc.dao;
 
import java.util.List;
 
import javax.sql.DataSource;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
 
@Repository
public class QueryForListReturnListDAO extends JdbcDaoSupport {
 
    @Autowired
    public QueryForListReturnListDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
 
 
    public List<String> getDepartmentNames() {
 
        String sql = "Select d.dept_name from DEPARTMENT d ";
 
        // queryForList(String sql, Class<T> elementType)
        List<String> list = this.getJdbcTemplate().queryForList(sql, String.class);
 
        return list;
    }
 
    public List<String> getDepartmentNames(String searchName) {
 
        String sql = "Select d.dept_name from DEPARTMENT d "//
                + " Where d.dept_name like ? ";
 
        // queryForList(String sql, Class<T> elementType, Object... args)
        List<String> list = this.getJdbcTemplate().queryForList(sql, String.class, //
                "%" + searchName + "%");
 
        return list;
    }
 
 
}