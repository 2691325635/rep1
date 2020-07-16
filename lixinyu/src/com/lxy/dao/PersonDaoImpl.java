package com.lxy.dao;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.lxy.bean.Person;
import com.lxy.jdbctemplate.JDBCUtils;

public class PersonDaoImpl {
	  JdbcTemplate jt=new JdbcTemplate(JDBCUtils.getDataSource());

	  public List<Person>findAllPerson(){
	   String sql="select name,username,password,age,describe,height from person";
	   List <Person> list =jt.query(sql,new BeanPropertyRowMapper<Person>(Person.class));
	   return list;
	  }
}
