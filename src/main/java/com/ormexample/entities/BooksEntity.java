package com.ormexample.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class BooksEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private Integer bookId;
	
	@Column(name = "book_name")
	private String bookName;
	
	@Column(name = "book_edition")
	private String bookEdition;
	
	@Column(name = "book_year")
	private Integer bookYear;
	
	@Column(name = "book_author_id")
	private Integer bookAuthorId;
	
	@Column(name = "book_price")
	private Integer bookPrice;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookEdition() {
		return bookEdition;
	}

	public void setBookEdition(String bookEdition) {
		this.bookEdition = bookEdition;
	}

	public Integer getBookYear() {
		return bookYear;
	}

	public void setBookYear(Integer bookYear) {
		this.bookYear = bookYear;
	}

	public Integer getBookAuthorId() {
		return bookAuthorId;
	}

	public void setBookAuthorId(Integer bookAuthorId) {
		this.bookAuthorId = bookAuthorId;
	}

	public Integer getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Integer bookPrice) {
		this.bookPrice = bookPrice;
	}

}
