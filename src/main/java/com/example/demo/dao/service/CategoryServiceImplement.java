package com.example.demo.dao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Category;
import com.example.demo.dao.categoryRepo;

@Service
public class CategoryServiceImplement implements CategoryService
{

	@Autowired
	categoryRepo ob;
	
	@Autowired
	Category catob;
	
	@Override
	public List<Category> getCategory() 
	{
		List<Category> a = (List<Category>) ob.findAll();
		return a;
	}
	
	
	@Override
	public String addCategory(List<Category> category) 
	{
		ob.saveAll(category);
		return "Successfully Added";
	}
	

	@Override
	public Optional<Category> deleteCategory(Integer id) 
	{
		try
		{
			if(ob.findById(id) != null)
			{
				ob.deleteById(id);
				System.out.println("Record Deleted");
			}
		}
		catch(Exception e)
		{
			System.out.println("No Such Records!!");
		}
		
		return null;
	}


	@Override
	public String updateCategory(List<Category> category) 
	{
		ob.saveAll(category);
		return "Successfully Updated";
	}

	
	@Override
	public Optional<Category> searchCategory(Integer id) 
	{
		try
		{
			if(ob.findById(id) != null)
			{
				ob.findById(id);
			}
			else
			{
				System.out.println("No Such Records!!");
			}
		}
		catch(Exception e)
		{
			System.out.println("No Such Records!!");
		}
		
		return ob.findById(id);
	}

	
	@Override
	public Optional<List<Category>> searchPartialCategory(String name) 
	{
		ob.findByMyName(name);
		return Optional.of(ob.findByMyName(name));
	}
	
}
