package com.braggbay105.dao;

import java.util.List;

import com.braggbay105.dao.GenericDAO;
import com.braggbay105.domain.Bid;





public interface BidDAO extends GenericDAO<Bid, Integer> {
  
	List<Bid> findAll();
	






}


