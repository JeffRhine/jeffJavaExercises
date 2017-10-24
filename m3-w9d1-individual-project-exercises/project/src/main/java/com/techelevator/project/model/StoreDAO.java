package com.techelevator.project.model;

import java.util.List;

public interface StoreDAO {

	public List<Store> getAllProducts(Long id);

	public List<Store> getProductDetail(Long id);
}
