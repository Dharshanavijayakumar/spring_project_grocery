package com.grocery.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.demo.dao.GroceryRepository;
import com.grocery.demo.model.Grocery;



@Service
public class GroceryService {

	@Autowired
	GroceryRepository grosRepository;
	public List<Grocery>getAllDetails(){
		List<Grocery>grosList=grosRepository.findAll();
		return grosList;
		
	}
	public Grocery saveGrocerys(Grocery s)
	{
		Grocery obj=grosRepository.save(s);
		return obj;
	}

	public Grocery updateDetails(Grocery s)
	{
		Grocery obj= grosRepository.save(s);
		return obj;
		//return studRepository.save(s);
		
		
	}
	public void deleteDetails(int s_no)
	{
		grosRepository.deleteById(s_no);
	}
	public Grocery getDetails(int s_no) {
		Grocery s=grosRepository.findById(s_no).get();
		return s;
	}}
