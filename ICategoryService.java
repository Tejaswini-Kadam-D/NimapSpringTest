package com.example.IService;

import java.util.List;

import com.example.Entity.Category;

public interface ICategoryService {

	public List<Category> getAllCategory();
	public Category addCategory(Category cat);
	public Category updateCategory(int id,Category c);
	public void deleteCategory(int id);
	public Category getCategorybyid(int id);
	
	
}
