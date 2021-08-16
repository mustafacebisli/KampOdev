package dataAccess.concretes;


import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void save(User user) {
		System.out.println("Sisteme e-posta ve parola ile kay�t olundu.�yelik sonucu kullan�c�ya do�rulama e-postas� g�nderildi.");
		
	}

	
}
