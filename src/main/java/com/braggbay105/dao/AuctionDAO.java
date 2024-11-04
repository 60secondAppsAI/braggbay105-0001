package com.braggbay105.dao;

import java.util.List;

import com.braggbay105.dao.GenericDAO;
import com.braggbay105.domain.Auction;





public interface AuctionDAO extends GenericDAO<Auction, Integer> {
  
	List<Auction> findAll();
	






}


