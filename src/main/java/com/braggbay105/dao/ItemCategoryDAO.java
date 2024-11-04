package com.braggbay105.dao;

import java.util.List;

import com.braggbay105.dao.GenericDAO;
import com.braggbay105.domain.ItemCategory;





public interface ItemCategoryDAO extends GenericDAO<ItemCategory, Integer> {
  
	List<ItemCategory> findAll();
	






}


