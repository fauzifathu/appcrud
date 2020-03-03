package com.crud.demo.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.Setter;
import lombok.Getter;
import com.crud.demo.springdatajpa.model.AppUser;
import com.crud.demo.springdatajpa.repository.AppUserRepository;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {

	@Autowired
	private AppUserRepository appUserRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Creating AppUser object: AppUser1");
		AppUser appUser1 = new AppUser();
		appUser1.setUsername("appuser1");
		appUser1.setFirstName("Muhammad");
		appUser1.setLastName("Fauzi");
		appUser1.setJoinDate(new Date());
		System.out.println("appUser1 created.");

		System.out.println("Creating AppUser object: appUser2");
		AppUser appUser2 = new AppUser();
		appUser2.setUsername("appuser2");
		appUser2.setFirstName("Azhary");
		appUser2.setLastName("Furqon");
		appUser2.setJoinDate(new Date());
		System.out.println("appUser1 created.");

		System.out.println("Creating AppUser object: appUser3");
		AppUser appUser3 = new AppUser();
		appUser3.setUsername("appuser3");
		appUser3.setFirstName("Ahmad");
		appUser3.setLastName("Dazzle");
		appUser3.setJoinDate(new Date());
		System.out.println("appUser1 created.");

		System.out.println("saving appUser1 . . .");
		this.appUserRepository.save(appUser1);
		System.out.println("appUser1 saved.");

 		System.out.println("saving appUser2 . . .");
		this.appUserRepository.save(appUser2);
		System.out.println("appUser2 saved.");

		System.out.println("saving appUser3 . . .");
		this.appUserRepository.save(appUser3);
		System.out.println("appUser3 saved.");

		System.out.println("Getting users data . . . ");
		List<AppUser> users = this.appUserRepository.findAll();
		System.out.println(String.format("Found %d users!", users.size()));

//		System.out.println("\nGet user with id=1");
//		AppUser userFromDb1 = this.appUserRepository.getOne(1);
//		if(userFromDb1 != null) {
//			System.out.println("Found user with id=1 !");
//			userFromDb1.setFirstName("Joko");
//			userFromDb1.setLastName("Tingkir");
//
//			System.out.println("Updating user with id=1 . . .");
//			this.appUserRepository.save(userFromDb1);
//			System.out.println("User updated.");
//		}
//
//		System.out.println("Get user with id=2");
//		AppUser userFromDb2 = this.appUserRepository.getOne(2);
//		if(userFromDb2 != null) {
//			System.out.println("Found user with id=2 !");
//			System.out.println("Deleting user with id=2 . . .");
//			this.appUserRepository.delete(userFromDb2);
//			System.out.println("User deleted.");
//		}
//
//		System.out.println("\nGetting users data . . . ");
//		users = this.appUserRepository.findAll();
//		System.out.println(String.format("Found %d user/users!", users.size()));

		System.out.println("Displaying users . . . ");
		for (AppUser user : users) {
			System.out.println(user);
		}
	}
}
