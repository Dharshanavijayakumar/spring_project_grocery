package com.grocery.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.demo.model.Grocery;
import com.grocery.demo.service.GroceryService;
import com.grocery.demo.model.Grocery;

@RestController
public class GroceryController {
	@Autowired
	GroceryService grosService;
	@GetMapping(value="fetchDetails")
	public List<Grocery> getAllDetails(){
		List<Grocery> grosList=grosService.getAllDetails();
		return grosList;
	}
	@PostMapping(value="/saveDetails")
	public Grocery saveDetails(@RequestBody Grocery s)
	{
		return grosService.saveGrocerys(s);
	}
	@PutMapping(value="/updateDetails")
	 public Grocery updateDetails(@RequestBody Grocery s) 
		{
			return grosService.saveGrocerys(s);
			
		}
	
	 
	 @DeleteMapping(value="/deleteDetails/{s_no}") 
	 public void  deleteDetails(@PathVariable("s_no") int s_no)
	 {
	 	grosService.deleteDetails(s_no);
	 }
	 @GetMapping(value="/getDetails/{s_no}")
	 public Grocery getDetails(@PathVariable("s_no")  int s_no)
	 {
	 	return grosService.getDetails(s_no);
	 }
	 
	 
	}
	


