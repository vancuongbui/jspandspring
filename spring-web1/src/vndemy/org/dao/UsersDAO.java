package vndemy.org.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("usersDao")
public class UsersDAO {
	private NamedParameterJdbcTemplate jdbc;
	
	@Autowired		//this will look into the beans.xml and find the bean id = "dataSource"
	public void SetDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}
	//get the list of all users from database
	public List<User> getUsers() {
		return jdbc.query("select username,password,enabled from users", new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				User user = new User();
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setEnabled(rs.getBoolean("enabled"));				
				return user;
			}
			
		});		
	}
	//update an user from database
	public boolean update(User user) {
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(user);
		
		return jdbc.update("update users set password=:password, enabled=:enabled where username=:username", params) == 1;
	}
	
	public boolean create(User user) {
		
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(user);
		
		boolean userQuery = jdbc.update("insert into authorities (username, authorities) values (:username, :authorities)", params) == 1;
		boolean orthorityQuery = jdbc.update("insert into users (username, password, enabled) values (:username, :password, :enabled)", params) == 1;
		if (userQuery && orthorityQuery) {
			System.out.println("Insert into database successfully");
			return true;
		}
		else {
			System.out.println("Insert into database unsuccessfully");
			return false;
		}		
	}
	@Transactional
	public int[] create(List<User> users) {
		
		SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(users.toArray());
		
		return jdbc.batchUpdate("insert into users (username, password, enabled) values (:username, :password, :enabled)", params);
	}
	
	public boolean delete(String username) {
		MapSqlParameterSource params = new MapSqlParameterSource("username", username);
		boolean userQuery = jdbc.update("delete from users where username=:username", params) == 1;
		boolean authorityQuery = jdbc.update("delete from authorities where username=:username", params) == 1;
		if (userQuery && authorityQuery) {
			return true;
		}
		else {
			return false;
		}
	}

	public User getUser(String username) {

		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("username", username);

		return jdbc.queryForObject("select * from users where username=:username", params,
				new RowMapper<User>() {

					public User mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						User user = new User();
						
						user.setUsername(rs.getString("username"));
						user.setPassword(rs.getString("password"));
						user.setEnabled(rs.getBoolean("enabled"));

						return user;
					}

				});
	}
	
	public UsersDAO() {
		// TODO Auto-generated constructor stub
	}
	public boolean exist(String username) {
		// TODO Auto-generated method stub
		String countQuery = "select count(*) from users where username=:username";
		MapSqlParameterSource paramMap = new MapSqlParameterSource("username", username);
		return jdbc.queryForObject(countQuery, paramMap, Integer.class) > 0;
	}

}
