package org.grocery.stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM_TBL")
public class Item {

	@GeneratedValue
	@Id
	@Column(name = "ITEM_ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "QUANTITY")
	private int quantity;
	@Column(name = "PRICE")
	private double price;
	
	static {
		Item.totalNumberOfProducts = 0;
	}
	
	private static int totalNumberOfProducts; 
	
	public Item(String name, int quantity, double price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Item() {
		super();
		Item.totalNumberOfProducts++;
	}

	public int getId() {
		return id;
	}
	public static int getTotalNumberOfProducts() {
		return totalNumberOfProducts;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
