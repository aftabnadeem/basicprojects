package com.habibi.datasaver;



import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class controller {
	
	@Autowired
	 driverepo dr;
	
	
	@GetMapping("/")
public List<drivers> home() {
		List<drivers> r=dr.findAll();
		return r;
}
	
		@PostMapping("/")
	public void add(@ModelAttribute("drivers")drivers d) {
		 dr.save(d);
		
	}
	
@GetMapping("/{id}")
public Optional<drivers> update(@PathVariable("id")int id) {
	Optional<drivers> d=dr.findById(id);
	return d;
	    
}


@DeleteMapping("/{id}")
public void delete(@PathVariable("id")int id) {
	
	dr.deleteById(id);
}
@ExceptionHandler(Exception.class)
public String exc() {
	return "Invalid ID, please Enter valid ID";
}

}


	
