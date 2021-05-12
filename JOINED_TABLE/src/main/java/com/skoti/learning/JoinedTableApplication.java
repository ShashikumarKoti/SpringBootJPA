package com.skoti.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.skoti.learning.entity.Domestic;
import com.skoti.learning.entity.Pet;
import com.skoti.learning.repo.DomesticRepo;
import com.skoti.learning.repo.PetRepo;

@SpringBootApplication
public class JoinedTableApplication implements CommandLineRunner{

	@Autowired
	private PetRepo petRepo;
	
	@Autowired
	private DomesticRepo domesticRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(JoinedTableApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pet pet = new Pet();
		pet.setAnimalID(222);
		pet.setAnimalName("Rana");
		pet.setAnimalType("Dog");
		
		Domestic dom = new Domestic();
		dom.setAnimalID(999);
		dom.setAnimalType("domestic");
		dom.setLifespan("donkey");
		
		petRepo.save(pet);
		domesticRepo.save(dom);
	}

}
