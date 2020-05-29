package com.example.demo.dao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.example.demo.dao.Category;

@Component
public interface CategoryService 
{
	public List<Category> getCategory();
	public String addCategory(List<Category> category);
	public Optional<Category> deleteCategory(Integer id);
	public String updateCategory(List<Category> category);
	public Optional<Category> searchCategory(Integer id);
	public Optional<List<Category>> searchPartialCategory(String name);
}
