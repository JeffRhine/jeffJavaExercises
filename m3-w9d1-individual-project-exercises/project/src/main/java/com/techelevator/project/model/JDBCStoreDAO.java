package com.techelevator.project.model;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;


@Component
public class JDBCStoreDAO implements StoreDAO{

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JDBCStoreDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Store> getAllProducts(Long id) {
		List<Store> allProducts = new ArrayList<>();
		String sqlSelectAllReviews = "SELECT * FROM products WHERE category_id=?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllReviews, id);
		while(results.next()) {
			Store product = new Store();
			product.setId(results.getLong("id"));
			product.setProduct(results.getString("product"));
			product.setPrice(results.getDouble("price"));
			product.setDescription(results.getString("description"));
			product.setImage(results.getString("image"));
			product.setLastMonth(results.getInt("last_month"));
			product.setRating(results.getInt("rating"));
			
			allProducts.add(product);
		}
		return allProducts;
	}
	@Override
	public List<Store> getProductDetail(Long id) {
		List<Store> productDetail = new ArrayList<>();
		String sqlSelectAllReviews = "SELECT * FROM products WHERE id=?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllReviews, id);
		while(results.next()) {
			Store product = new Store();
			product.setId(results.getLong("id"));
			product.setProduct(results.getString("product"));
			product.setPrice(results.getDouble("price"));
			product.setDescription(results.getString("description"));
			product.setImage(results.getString("image"));
			
			productDetail.add(product);
		}
		return productDetail;
	}
}
