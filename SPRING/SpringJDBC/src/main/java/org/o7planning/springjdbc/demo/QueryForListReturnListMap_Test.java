package org.o7planning.springjdbc.demo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.o7planning.springjdbc.config.AppConfiguration;
import org.o7planning.springjdbc.dao.QueryForListReturnListMapDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QueryForListReturnListMap_Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

		QueryForListReturnListMapDAO dao = context.getBean(QueryForListReturnListMapDAO.class);

		// Map<String columnName, Object value)
		List<Map<String, Object>> list = dao.queryForList_ListMap2();

		// backed by the map, so changes to the map are reflected in the set,
		// and vice-versa. If the map is modified while an iteration over the
		// set is in progress (except through the iterator's own remove
		// operation), the results of the iteration are undefined. The set
		// supports element removal, which removes the corresponding mapping
		// from the map, via the Iterator.remove, Set.remove, removeAll,
		// retainAll, and clear operations. It does not support the add or
		// addAll operations.Returns:a set view of the keys contained in this
		// map
		for (Map<String, Object> map : list) {
			System.out.println("------");
			for (String key : map.keySet()) {
				System.out.println("Key: "+key+" -value: "+map.get(key));
			}
		}
	}
}
