package com.techelevator.project.model;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JDBCCategoryDAO implements CategoryDAO{

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JDBCCategoryDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Category> getAllCategories() {
		List<Category> allCategories = new ArrayList<>();
		String sqlSelectAllReviews = "SELECT * FROM categories";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllReviews);
		while(results.next()) {
			Category cat = new Category();
			cat.setId(results.getLong("id"));
			cat.setName(results.getString("name"));	
			cat.setImage(results.getString("image"));
			
			allCategories.add(cat);
		}
		return allCategories;
	}
}
