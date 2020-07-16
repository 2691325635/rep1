package com.lxy.jdbctemplate;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.lxy.bean.Person;
public class Test03 {
	public static void main(String[] args){
		JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
		String sql = "select*from person";
		List<Person> list =jt.query(sql, new BeanPropertyRowMapper<Person>(Person.class));
		for(Person person:list){
			System.out.println(person);
		}
 		
	}
}