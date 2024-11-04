package com.braggbay105.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggbay105.domain.ItemCategory;
import com.braggbay105.dto.ItemCategoryDTO;
import com.braggbay105.dto.ItemCategorySearchDTO;
import com.braggbay105.dto.ItemCategoryPageDTO;
import com.braggbay105.dto.ItemCategoryConvertCriteriaDTO;
import com.braggbay105.service.GenericService;
import com.braggbay105.dto.common.RequestDTO;
import com.braggbay105.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface ItemCategoryService extends GenericService<ItemCategory, Integer> {

	List<ItemCategory> findAll();

	ResultDTO addItemCategory(ItemCategoryDTO itemCategoryDTO, RequestDTO requestDTO);

	ResultDTO updateItemCategory(ItemCategoryDTO itemCategoryDTO, RequestDTO requestDTO);

    Page<ItemCategory> getAllItemCategorys(Pageable pageable);

    Page<ItemCategory> getAllItemCategorys(Specification<ItemCategory> spec, Pageable pageable);

	ResponseEntity<ItemCategoryPageDTO> getItemCategorys(ItemCategorySearchDTO itemCategorySearchDTO);
	
	List<ItemCategoryDTO> convertItemCategorysToItemCategoryDTOs(List<ItemCategory> itemCategorys, ItemCategoryConvertCriteriaDTO convertCriteria);

	ItemCategoryDTO getItemCategoryDTOById(Integer itemCategoryId);







}





