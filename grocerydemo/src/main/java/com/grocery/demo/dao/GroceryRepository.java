package com.grocery.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grocery.demo.model.Grocery;

public interface GroceryRepository extends JpaRepository<Grocery,Integer> {

}
