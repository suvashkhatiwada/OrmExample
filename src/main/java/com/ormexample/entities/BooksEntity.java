package com.ormexample.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	private Integer bookEdition;
	
	@Column(name = "book_year")
	private Integer bookYear;
	
	@ManyToOne
	@JoinColumn(name = "book_author_id", referencedColumnName = "author_id")
	private AuthorsEntity authorEntity;
	
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

	public Integer getBookEdition() {
		return bookEdition;
	}

	public void setBookEdition(Integer bookEdition) {
		this.bookEdition = bookEdition;
	}

	public Integer getBookYear() {
		return bookYear;
	}

	public void setBookYear(Integer bookYear) {
		this.bookYear = bookYear;
	}

	public AuthorsEntity getAuthorEntity() {
		return authorEntity;
	}

	public void setAuthorEntity(AuthorsEntity authorEntity) {
		this.authorEntity = authorEntity;
	}

	public Integer getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Integer bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "BooksEntity [bookId=" + bookId + ", bookName=" + bookName + ", bookEdition=" + bookEdition
				+ ", bookYear=" + bookYear + ", authorEntity=" + authorEntity + ", bookPrice=" + bookPrice + "]";
	}
	

}
