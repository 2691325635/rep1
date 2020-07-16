package com.lxy.jdbctemplate;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.lxy.bean.Person;
public class Test01 {
	public static void main(String[] args){
		//findAllPerson();
		//addPerson1();
		//updatePerson();
		//deletePerson1();
		findPersonById();
	}
	//查询单个实体
	private static void findPersonById(){
		JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
	   Person person=jt.queryForObject(" select * from person where id =?",new BeanPropertyRowMapper<>(Person.class),5);
		System.out.println(person);
	        }
	//查询单个实体
		/*private static void findPersonById1(){
			JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
			List <Person> list =jt.query("select*from person where id =?",new BeanPropertyRowMapper<Person>(Person.class),6);
			Person person1 =list.get(0);
			System.out.println(person1);
			System.out.println(list);
		}*/
	//删除(按ID)
	/*private static void deletePerson(){
		JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
		int update=jt.update("delete from person where id =?",4);
		System.out.println(update);
	        }
	//删除(按姓名)
		private static void deletePerson1(){
			JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
			int update=jt.update("delete from person where name =?","安琪拉");
			System.out.println(update);
		        }*/
	//修改
	/*private static void updatePerson(){
		JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
		int update=jt.update("update person set name =?,age =? where id =?","兰陵王",45,3);
		System.out.println(update);
	        }*/
	//添加 预编译
			/*private static void addPerson1(){
				JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
				String sql="insert into person(name,age,height)values(?,?,?)";
				int update =jt.update(sql,"赵云",35,260);
				System.out.println(update);
			}*/
	//添加
		/*private static void addPerson(){
			JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
			String sql="insert into person(name,age,height)values('安琪拉',23,165)";
			int update =jt.update(sql);
			System.out.println(update);
		    }*/
	//查询所有英雄
	/*private static void findAllPerson(){
		JdbcTemplate jt =new JdbcTemplate(JDBCUtils.getDataSource());
		String sql ="select *from person";
		 List <Person> list =jt.query(sql,new BeanPropertyRowMapper<Person>(Person.class));
		 for(Person person:list){
			 System.out.println(person);
	
		 }
	 }*/
	
	
	
}
