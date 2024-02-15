package com.swagg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "biodata")
public class bio {
	private int Id;
	private String name;
	private int salary;
	private String experience;
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
     public int getId()
     {
    	 return Id;
     }
     public void setId(int Id)
     {
    	 this.Id = Id;
     }
     
     @Column(name = "NAME")
     public String getName()
     {
    	 return name;
     }
     public void setName(String name)
     {
    	 this.name = name;
    	 
     }
     
     @Column(name = "Salary")
     public int getSalary()
     {
    	 return salary;
     }
     public void setSalary(int salary)
     {
    	 this.salary = salary;
     }
     
     @Column(name = "Experience")
     public String getExperience()
     {
    	 return experience;
     }
     public void setExperience(String experience)
     {
    	 this.experience =  experience;
     }
	public bio(int id, String name, int salary, String experience) {
		super();
		Id = id;
		this.name = name;
		this.salary = salary;
		this.experience = experience;
	}
	public bio() {
		super();
	}
	@Override
	public String toString() {
		return "bio [Id=" + Id + ", name=" + name + ", salary=" + salary + ", experience=" + experience + "]";
	}
     
	
     
     
     
     
	
	

}
