package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface categoryRepo extends CrudRepository<Category, Integer>
{
	@Query("select u from Category u where u.catname like ?1%")
	List<Category> findByMyName(String catname);
	
}
