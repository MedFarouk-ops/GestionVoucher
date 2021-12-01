package com.stage.info.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stage.info.model.Categorie;
import com.stage.info.service.CategorieService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/categories")
public class CategorieController {

	@Autowired
	private CategorieService service;
	
	// - Add new category :

	@PostMapping("")
	public Categorie create_category(@RequestBody Categorie cat) {
		return service.categorySubmit(cat);
	}
	
	// - Show Voucher:
	@GetMapping("/{id}")
	public ResponseEntity<Categorie> getSingleCategory(@PathVariable long id) {
		return service.getCategory(id);
	}

	// Voucher List
	@GetMapping("")
	public List<Categorie> getAllCategories() {
		return service.getCategories();
	}

	// Edit Voucher :

	@PutMapping("/{id}")
	public ResponseEntity<Categorie> updateCategorie(@PathVariable long id, @RequestBody Categorie catDetails) {
		return service.updateCategory(id, catDetails);
	}

	// - Delete Voucher :

	@DeleteMapping("/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteCategory(@PathVariable Long id) {
		return service.deleteCategory(id);
	}

}
