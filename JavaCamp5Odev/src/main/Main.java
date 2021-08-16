package main;


import java.util.Scanner;



import business.abstracts.UserService;
import business.concretes.UserManager;
import core.abstracts.checks;
import core.concretes.emailCheck;
import core.concretes.firstLastNameCheck;
import core.concretes.passwordCheck;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		checks[] deneme1 = {new emailCheck(),new firstLastNameCheck(),new passwordCheck()};
		
		UserService userService = new UserManager(new HibernateUserDao(),deneme1);

		User user = new User(1,"Mustafa","asdi","mustas@dsasd.com","123456");
		userService.save(user);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Giriþ için sýrasýyla email ve þifre giriniz");
		String email1 = scanner.next();
		Scanner scanner1 = new Scanner(System.in);
		String password1 = scanner.next();
		
		if(user.getEmail().equals(email1) && user.getPassword().equals(password1)) {
			System.out.println("giriþ saðlandý");
		}
		else {
			System.out.println("Giriþ yapýlamadý");
		}
		
	}

}
