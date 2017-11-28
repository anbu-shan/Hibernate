package com.books;

public class EBook extends Book {
	private String downloadUrl;
	private int sizeInMb;

	public EBook(String title, String author, double price, long isbn, String downloadUrl, int sizeInMb) {
		super(id,title, author, price, isbn);
		this.downloadUrl = downloadUrl;
		this.sizeInMb = sizeInMb;
	}

	public EBook() {
		super();
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public int getSizeInMb() {
		return sizeInMb;
	}

	public void setSizeInMb(int sizeInMb) {
		this.sizeInMb = sizeInMb;
	}

	
	
}
