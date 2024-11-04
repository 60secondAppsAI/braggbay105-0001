package com.braggbay105.dao;

import java.util.List;

import com.braggbay105.dao.GenericDAO;
import com.braggbay105.domain.Item;





public interface ItemDAO extends GenericDAO<Item, Integer> {
  
	List<Item> findAll();
	






}


