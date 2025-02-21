package com.example.IService;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.example.Entity.Category;
import com.example.Entity.Product;

public interface IProductService 
{

	public List<Product> getallproduct();
	public Product addProduct(Product pro);
	public Product updateProduct(int id,Product p);
	public void deleteProduct(int id);
	public Product getProductbyid(int id);
	public Page<Product> getallproduct(PageRequest pageRequest);
}
