package com.product.rating.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.rating.entity.RatingDetails;



public interface RatingRepository extends JpaRepository<RatingDetails,Long> {
	
	 
	List<RatingDetails> findByProductId(long productId);
	
	
}