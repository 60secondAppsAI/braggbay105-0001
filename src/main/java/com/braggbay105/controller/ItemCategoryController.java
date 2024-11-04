package com.braggbay105.controller;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;
import java.util.ArrayList;


import com.braggbay105.util.Util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.sql.Timestamp;
import java.util.Date;

import com.braggbay105.domain.ItemCategory;
import com.braggbay105.dto.ItemCategoryDTO;
import com.braggbay105.dto.ItemCategorySearchDTO;
import com.braggbay105.dto.ItemCategoryPageDTO;
import com.braggbay105.service.ItemCategoryService;
import com.braggbay105.dto.common.RequestDTO;
import com.braggbay105.dto.common.ResultDTO;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;




@CrossOrigin(origins = "*")
@RequestMapping("/itemCategory")
@RestController
public class ItemCategoryController {

	private final static Logger logger = LoggerFactory.getLogger(ItemCategoryController.class);

	@Autowired
	ItemCategoryService itemCategoryService;



	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<ItemCategory> getAll() {

		List<ItemCategory> itemCategorys = itemCategoryService.findAll();
		
		return itemCategorys;	
	}

	@GetMapping(value = "/{itemCategoryId}")
	@ResponseBody
	public ItemCategoryDTO getItemCategory(@PathVariable Integer itemCategoryId) {
		
		return (itemCategoryService.getItemCategoryDTOById(itemCategoryId));
	}

 	@RequestMapping(value = "/addItemCategory", method = RequestMethod.POST)
	public ResponseEntity<?> addItemCategory(@RequestBody ItemCategoryDTO itemCategoryDTO, HttpServletRequest request) {

		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = itemCategoryService.addItemCategory(itemCategoryDTO, requestDTO);
		
		return result.asResponseEntity();
	}

	@GetMapping("/itemCategorys")
	public ResponseEntity<ItemCategoryPageDTO> getItemCategorys(ItemCategorySearchDTO itemCategorySearchDTO) {
 
		return itemCategoryService.getItemCategorys(itemCategorySearchDTO);
	}	

	@RequestMapping(value = "/updateItemCategory", method = RequestMethod.POST)
	public ResponseEntity<?> updateItemCategory(@RequestBody ItemCategoryDTO itemCategoryDTO, HttpServletRequest request) {
		RequestDTO requestDTO = new RequestDTO(request);
		ResultDTO result = itemCategoryService.updateItemCategory(itemCategoryDTO, requestDTO);
		
//		if (result.isSuccessful()) {
//		}

		return result.asResponseEntity();
	}



}
