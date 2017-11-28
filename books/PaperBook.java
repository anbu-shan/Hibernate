package com.books;

public class PaperBook extends Book {
	private float shippingWeight;
	private int inStock;
	
	public PaperBook() {
		super();
	}
	
	public PaperBook(String title, String author, double price, long isbn, float shippingWeight, int inStock) {
		super(id, title, author, price, isbn);
		this.shippingWeight = shippingWeight;
		this.inStock = inStock;
	}

	public float getShippingWeight() {
		return shippingWeight;
	}

	public void setShippingWeight(float shippingWeight) {
		this.shippingWeight = shippingWeight;
	}

	public int getInStock() {
		return inStock;
	}

	public void setInStock(int inStock) {
		this.inStock = inStock;
	}
	
	
	
}
