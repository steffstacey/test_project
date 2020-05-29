package com.example.demo.conroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Category;
import com.example.demo.dao.service.CategoryServiceImplement;

@RestController
public class CategoryResource
{

	@Autowired
	CategoryServiceImplement obj;
	
	
	@GetMapping("/shopping/getcategory")
	public List<Category> getCategory()
	{
		List<Category> a = obj.getCategory();
		return a;
	}
	
	
	@PostMapping("/shopping/addcategory")
	public String addCategory(@RequestBody List<Category> category)
	{
		return obj.addCategory(category);
	}
	
	
	@DeleteMapping("/shopping/deletecategory")
	public Optional<Category> deleteCategory(@RequestBody Integer id)
	{
		return obj.deleteCategory(id);
	}
	
	
	@PutMapping("/shopping/updatecategory")
	public String updateCategory(@RequestBody List<Category> category)
	{
		return obj.updateCategory(category);
	}
	
	
	@GetMapping("/shopping/searchcategory")
	public Optional<Category> searchCategory(@RequestBody Integer id)
	{
		return obj.searchCategory(id);
	}
	
	
	@GetMapping("/shopping/searchpartiacategory")
	public Optional<List<Category>> searchPartiaCategory(@RequestBody String name)
	{
		return obj.searchPartialCategory(name);
	}
	
}
