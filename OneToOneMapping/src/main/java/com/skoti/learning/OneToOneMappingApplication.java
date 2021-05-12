package com.skoti.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.skoti.learning.entity.Address;
import com.skoti.learning.entity.Address2;
import com.skoti.learning.entity.User;
import com.skoti.learning.entity.User2;
import com.skoti.learning.repo.UserRepo;
import com.skoti.learning.repo.UserRepo2;

@SpringBootApplication
public class OneToOneMappingApplication implements CommandLineRunner{

	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private UserRepo2 userRepo2;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToOneMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Address addr = new Address();
		addr.setCity("Bangaore");
		addr.setStreet("Arikere");
		
		User user = new User();
		user.setUserName("Shashi");
		user.setAddress(addr);
		
		//
		Address2 addr2 = new Address2();
		addr2.setCity("Bangaore");
		addr2.setStreet("Arikere");
		
		User2 user2 = new User2();
		user2.setUserName("Shashi");
		
		addr2.setUsers(user2); //required here  refer: https://www.baeldung.com/jpa-one-to-one
		user2.setAddress(addr2);
		
		
		userRepo.save(user);
		userRepo2.save(user2);
	}

}
