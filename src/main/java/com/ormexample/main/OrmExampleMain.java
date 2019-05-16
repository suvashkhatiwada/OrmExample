package com.ormexample.main;

import java.util.List;

import com.ormexample.entities.AuthorsEntity;
import com.ormexample.repositories.AuthorRepository;

public class OrmExampleMain {

	public static void main(String[] args) {

		AuthorsEntity authorEntity = new AuthorsEntity();

		authorEntity.setAuthorName("Test7 Rest7");
		authorEntity.setAuthorEmail("test7rest7@gmail.com");
		authorEntity.setAuthorPhone(111222333);
		authorEntity.setIsDeleted(false);

		AuthorRepository authorRepo = new AuthorRepository();
		authorRepo.save(authorEntity);

		AuthorsEntity author1 = authorRepo.getById(1);
		System.out.println(author1.toString());

//		List<AuthorsEntity> authors = authorRepo.getByEmail("suvashkhatiwada@gmail.com");
//		System.out.println("-----------------------------");
//		for (AuthorsEntity a : authors) {
//			System.out.println(a.toString());
//		}		

		AuthorsEntity updateAuthor = authorRepo.getById(2);
		updateAuthor.setAuthorName("Test Rest");
		updateAuthor.setAuthorEmail("testrest@gmail.com");
		updateAuthor.setAuthorPhone(123456789);
		authorRepo.update(updateAuthor);

		AuthorsEntity deleteAuthor = authorRepo.getById(1);
		deleteAuthor.setIsDeleted(true);
		authorRepo.delete(deleteAuthor);

		List<AuthorsEntity> authors = authorRepo.getAll();
		System.out.println("-----------------------------");
		for (AuthorsEntity a : authors) {
			System.out.println(a.toString());
		}

	}

}
