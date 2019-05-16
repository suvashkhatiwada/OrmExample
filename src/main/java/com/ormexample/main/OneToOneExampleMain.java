package com.ormexample.main;

import com.ormexample.entities.AddressEntity;
import com.ormexample.entities.AuthorsEntity;
import com.ormexample.repositories.AuthorRepository;

public class OneToOneExampleMain {

	public static void main(String args[]) {

		AuthorRepository authorRepository = new AuthorRepository();

		// Insert
		AuthorsEntity authorEntity = new AuthorsEntity();
		authorEntity.setAuthorName("Suvash Khatiwada");
		authorEntity.setAuthorEmail("suvashkhatiwada@gmail.com");
		authorEntity.setAuthorPhone(111222333);
		authorEntity.setIsDeleted(false);
		
		AddressEntity address = new AddressEntity();
		address.setAddressLine1("9451 Lee Hwy");
		address.setCity("Fairfax");
		address.setState("VA");
		address.setZipcode("22031");
		
		authorEntity.setAddressEntity(address);
		
		authorRepository.save(authorEntity);
	}
}