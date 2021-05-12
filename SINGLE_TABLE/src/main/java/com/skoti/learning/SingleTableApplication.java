package com.skoti.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.skoti.learning.entity.Book;
import com.skoti.learning.entity.Pen;
import com.skoti.learning.repo.BookRepo;
import com.skoti.learning.repo.PenRepo;

@SpringBootApplication
public class SingleTableApplication implements CommandLineRunner{

	@Autowired
	private BookRepo bookRepo;
	
	@Autowired
	private PenRepo penRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SingleTableApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book = new Book();
		book.setProdID(11);
		book.setName("Jungle Book");
		book.setAuthor("shashi");
		
		Pen pen = new Pen();
		pen.setProdID(99);
		pen.setName("Reynolds");
		pen.setColour("Blue");
		
		bookRepo.save(book);
		penRepo.save(pen);
	}

}
