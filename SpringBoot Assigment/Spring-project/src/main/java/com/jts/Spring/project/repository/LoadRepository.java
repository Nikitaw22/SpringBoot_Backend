package com.jts.Spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jts.Spring.project.entity.Load;



public interface LoadRepository extends JpaRepository<Load, Long> {
	
	Load save(Load load);

}
