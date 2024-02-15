package com.swagg.service;

import java.util.List;
import java.util.Optional;

import com.swagg.entity.bio;

public interface biodataserviec {
	
	public bio savebio(String name,int salary,String experience);
	
	public List<bio> savebio();
	
	public Optional<bio> getBiobyId(int Id);
	
	public bio updatebio(int Id,String name,int salary,String experience);
	
	public void deletebio(int id);

}
