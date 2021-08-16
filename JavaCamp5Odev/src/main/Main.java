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
		System.out.println("Giri� i�in s�ras�yla email ve �ifre giriniz");
		String email1 = scanner.next();
		Scanner scanner1 = new Scanner(System.in);
		String password1 = scanner.next();
		
		if(user.getEmail().equals(email1) && user.getPassword().equals(password1)) {
			System.out.println("giri� sa�land�");
		}
		else {
			System.out.println("Giri� yap�lamad�");
		}
		
	}

}
