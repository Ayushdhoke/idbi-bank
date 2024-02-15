package com.swagg.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swagg.entity.bio;

@Repository
public interface boidataReposatory extends JpaRepository<bio,Integer>{

}
