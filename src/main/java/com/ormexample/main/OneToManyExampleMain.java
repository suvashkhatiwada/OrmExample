package com.ormexample.main;

import com.ormexample.entities.AuthorsEntity;
import com.ormexample.entities.BooksEntity;
import com.ormexample.repositories.AuthorRepository;

public class OneToManyExampleMain {

	public static void main(String[] args) {
		AuthorRepository authorRepository = new AuthorRepository();
		
		AuthorsEntity authorSelected = authorRepository.getById(1);
		
		// update or insert child records

		BooksEntity book1 = new BooksEntity();
		book1.setBookName("Harry Porter");
		book1.setBookEdition(1);
		book1.setBookYear(2010);
		book1.setBookPrice(25);
		book1.setAuthorEntity(authorSelected);
		
		authorSelected.getBooks().add(book1);
		
		
		
		
//		BookEntity book2 = new BookEntity();
//		book2.setName("Harry Porter");
//		book2.setDescription("Harry Porter and deathly hallows part 2");
//		book2.setYear(2012);
//		book2.setAuthorEntity(authorSelected);
//		
//		authorSelected.getBooks().add(book2);
//		
		authorRepository.update(authorSelected);
		
//		System.out.println(" Print list of books");
//		for(BooksEntity b : authorSelected.getBooks()) {
//			System.out.println(b.toString());
//		}
		
	}
}