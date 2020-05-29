package com.example.demo.dao;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "category")
public class Category 
{
	@Id
	private int catid;
	private int parentcatid;
	private String catname;
	private String catdesc;

	
	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}



	public int getParentcatid() {
		return parentcatid;
	}



	public void setParentcatid(int parentcatid) {
		this.parentcatid = parentcatid;
	}



	public String getCatname() {
		return catname;
	}



	public void setCatname(String catname) {
		this.catname = catname;
	}



	public String getCatdesc() {
		return catdesc;
	}



	public void setCatdesc(String catdesc) {
		this.catdesc = catdesc;
	}

}
