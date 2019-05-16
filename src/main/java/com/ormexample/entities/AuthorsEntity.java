package com.ormexample.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "authors")
public class AuthorsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "author_id")
	private Integer authorId;

	@Column(name = "author_name")
	private String authorName;

	@Column(name = "author_email")
	private String authorEmail;

	@Column(name = "author_phone")
	private Integer authorPhone;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private AddressEntity addressEntity;
	
	@OneToMany(mappedBy = "authorEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<BooksEntity> books;

	@Column(name = "is_deleted")
	private Boolean isDeleted;

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorEmail() {
		return authorEmail;
	}

	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}

	public Integer getAuthorPhone() {
		return authorPhone;
	}

	public void setAuthorPhone(Integer authorPhone) {
		this.authorPhone = authorPhone;
	}

	public AddressEntity getAddressEntity() {
		return addressEntity;
	}

	public void setAddressEntity(AddressEntity addressEntity) {
		this.addressEntity = addressEntity;
	}

	public List<BooksEntity> getBooks() {
		return books;
	}

	public void setBooks(List<BooksEntity> books) {
		this.books = books;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "AuthorsEntity [authorId=" + authorId + ", authorName=" + authorName + ", authorEmail=" + authorEmail
				+ ", authorPhone=" + authorPhone + ", addressEntity=" + addressEntity + ", books=" + books
				+ ", isDeleted=" + isDeleted + "]";
	}
}
