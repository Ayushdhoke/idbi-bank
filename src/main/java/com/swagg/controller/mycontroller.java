package com.swagg.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swagg.entity.bio;
import com.swagg.service.biodataserviec;

@RestController
@CrossOrigin
public class mycontroller {
	
	     @Autowired
	     private biodataserviec serv;
	
	     @PostMapping("/boidata")
	     public ResponseEntity<bio> savebio(@RequestParam String name,@RequestParam int salary, @RequestParam String experience)
	     {
	    	 serv.savebio(name, salary, experience);
	    	 return ResponseEntity.created(null).build();
	     }
	     
	     @GetMapping("/biodata")
	     public ResponseEntity<List<bio>> savebio()
	     {
	    	 List<bio> l1 = serv.savebio();
	    	 if(l1.size()<=0)
	    	 {
	    		 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	    	 }
	    	 else
	    	 {
	    		 return ResponseEntity.of(Optional.of(l1));
	    	 }
	    	 
	     }
	     
	     @GetMapping("/boidata/{Id}")
	     public ResponseEntity<Optional<bio>> getBiobyId(int Id)
	     {
	    	 
	    	 
	    	 Optional<bio> l2 = serv.getBiobyId(Id);
	    	 if(l2 == null)
	    	 {
	    		 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	    	 }
	    	 else
	    	 {
	    		 return ResponseEntity.of(Optional.of(l2));
	    	 }
	    	 
	     }
	     
	     @PutMapping("/biodata")
	     public ResponseEntity<bio> updatebio(@RequestParam int Id,@RequestParam String name,@RequestParam int salary, @RequestParam String experience)
	     {
	           serv.updatebio(Id, name, salary, experience);
	           return ResponseEntity.ok(null);
	           
	     }
	     
	     @DeleteMapping("/biodata/{Id}")
	     public void deleteBio(int Id)
	     {
	    	 serv.deletebio(Id);
	    	 
	     }
	
	
    
	

}
