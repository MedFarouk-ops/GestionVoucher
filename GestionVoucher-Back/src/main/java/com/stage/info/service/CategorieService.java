package com.stage.info.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.stage.info.generator.CodeConfig;
import com.stage.info.generator.VoucherCodes;
import com.stage.info.generator.CodeConfig.Charset;
import com.stage.info.model.Categorie;
import com.stage.info.model.Voucher;
import com.stage.info.repository.CategorieRepository;



@Service
public class CategorieService {

	@Autowired
	CategorieRepository catRepository; 


	// Add Categorie :
	public Categorie categorySubmit(Categorie cat) {
		cat.setCreatedate(new Date());
		cat.setUpdateDate(new Date());
		return catRepository.save(cat);
		
	}

	// Show Category :
	public ResponseEntity<Categorie> getCategory(long idcat) {
		Categorie cat = catRepository.findById(idcat).get();
		return ResponseEntity.ok(cat);
	}

	// Show Categories List:

	public List<Categorie> getCategories() {
		return catRepository.findAll();
	}

	// Update Category :

	public ResponseEntity<Categorie> updateCategory(long id, Categorie catDetails) {

		Categorie cat = catRepository.getById(id);
		cat.setNomCat(catDetails.getNomCat());
		cat.setDescription(catDetails.getDescription());
		cat.setUpdateDate(new Date());
		Categorie updatedCategory = catRepository.save(cat);
		return ResponseEntity.ok(updatedCategory);
	}

	// - Delete Category :

	public ResponseEntity<Map<String, Boolean>> deleteCategory(Long id){
		Categorie cat = catRepository.getById(id);
		catRepository.delete(cat);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	

}
