package com.cts.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cts.bean.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	//wire dependency
	@Override
	public Product getProductDetails(int product_code) {
		//add your code here
		String query="select * from product where product_code=?";
	return jdbcTemplate.queryForObject(query, new Object[] {product_code},new BeanPropertyRowMapper<>(Product.class));
	}

}
