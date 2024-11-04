package com.braggbay105.dao;

import java.util.List;

import com.braggbay105.dao.GenericDAO;
import com.braggbay105.domain.User;

import java.util.Optional;




public interface UserDAO extends GenericDAO<User, Integer> {
  
	List<User> findAll();
	






}


