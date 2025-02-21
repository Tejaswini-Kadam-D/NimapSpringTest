package com.example.Controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Category;
import com.example.IService.ICategoryService;
import com.example.Service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController 
{

	@Autowired
	public ICategoryService is;
	
	@GetMapping("/getallcat")
	   
	
	public Page<Category> getallcategory( @RequestParam(value = "page", defaultValue = "0") int page, 
            @RequestParam(value = "size", defaultValue = "10") int size)
	{
		
		PageRequest pageable = PageRequest.of(page, size); 
        return CategoryService.getCategories(pageable); 

		
		
	}
	@PostMapping("/addcategory")
	public Category addcategory(@RequestBody Category c)
	{
		Category cc=null;
		cc=is.addCategory(c);
		return cc;	
	}
	@PutMapping("/updatecategory/{id}")
	public Category updatecategory(@PathVariable int id, @RequestBody Category c)
	{
	    Category cc = is.updateCategory(id, c);
	    return cc;
	}

	@DeleteMapping("/deletecategory/{id}")
	public void deletecategory(@PathVariable int id) 
	{
		
		is.deleteCategory(id);
	}
	@GetMapping("/getcategorybyid/{id}")
	public Category getcategorybyid(@PathVariable int id)
	{
	    Category cc = is.getCategorybyid(id);
	    return cc;
	}

}
