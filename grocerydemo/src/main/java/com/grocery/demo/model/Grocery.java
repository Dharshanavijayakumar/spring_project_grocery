package com.grocery.demo.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Grocery {
	@Id
	private int S_no;
	private String Item;
	private String Category;
	private String Quantity;
	private String price;
	private String Description;
	private String Discount;
	public int getS_no() {
		return S_no;
	}
	public void setS_no(int s_no) {
		S_no = s_no;
	}
	public String getItem() {
		return Item;
	}
	public void setItem(String item) {
		Item = item;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getDiscount() {
		return Discount;
	}
	public void setDiscount(String discount) {
		Discount = discount;
	}
	@Override
	public String toString() {
		return "Grocery [S_no=" + S_no + ", Item=" + Item + ", Category=" + Category + ", Quantity=" + Quantity
				+ ", price=" + price + ", Description=" + Description + ", Discount=" + Discount + ", getS_no()="
				+ getS_no() + ", getItem()=" + getItem() + ", getCategory()=" + getCategory() + ", getQuantity()="
				+ getQuantity() + ", getPrice()=" + getPrice() + ", getDescription()=" + getDescription()
				+ ", getDiscount()=" + getDiscount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public Grocery(int s_no, String item, String category, String quantity, String price, String description,
			String discount) {
		super();
		S_no = s_no;
		Item = item;
		Category = category;
		Quantity = quantity;
		this.price = price;
		Description = description;
		Discount = discount;
	}
	public Grocery() {
		super();
		// TODO Auto-generated constructor stub
	}
}
