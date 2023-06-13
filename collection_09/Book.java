package com.collection_09;

import java.util.Objects;

public class Book {
	
	private String bookName;
	private String auther;
	private int bookId;
	
	
    
	
	public Book(String bookName, String auther, int bookId) {
		super();
		this.bookName = bookName;
		this.auther = auther;
		this.bookId = bookId;
	}

	

	public String getBookName() {
		return bookName;
	}



	public void setBookName(String bookName) {
		this.bookName = bookName;
	}



	public String getAuther() {
		return auther;
	}



	public void setAuther(String auther) {
		this.auther = auther;
	}



	public int getBookId() {
		return bookId;
	}



	public void setBookId(int bookId) {
		this.bookId = bookId;
	}



	@Override
	public int hashCode() {
		return Objects.hash(auther, bookId, bookName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(auther, other.auther) && bookId == other.bookId
				&& Objects.equals(bookName, other.bookName);
	}
	
	
	

}
