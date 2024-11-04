package com.braggbay105.dao;

import java.util.List;

import com.braggbay105.dao.GenericDAO;
import com.braggbay105.domain.Review;





public interface ReviewDAO extends GenericDAO<Review, Integer> {
  
	List<Review> findAll();
	






}


