package com.swagg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swagg.entity.bio;
import com.swagg.reposatory.boidataReposatory;

@Service
public class BoidataserviecImplemenetr implements biodataserviec {
	
	@Autowired
	private boidataReposatory data;

	@Override
	public bio savebio(String name, int salary, String experience) {
		bio bb = new bio();
		bb.setName(name);
		bb.setSalary(salary);
		bb.setExperience(experience);
		data.save(bb);
		
		return bb;
	}

	@Override
	public List<bio> savebio() {
		
		return data.findAll();
	}

	@Override
	public Optional<bio> getBiobyId(int Id) {
		
		return data.findById(Id);
	}

	@Override
	public bio updatebio(int Id,String name, int salary, String experience) {
		bio b = new bio();
		b.setId(Id);
		b.setName(name);
		b.setSalary(salary);
		b.setExperience(experience);
		data.save(b);
		return b;
	}

	@Override
	public void deletebio(int Id) {
		data.deleteById(Id);

	}

}
