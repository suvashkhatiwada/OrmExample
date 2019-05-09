package com.ormexample.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="authors")
public class AuthorsEntity 
{
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
}
