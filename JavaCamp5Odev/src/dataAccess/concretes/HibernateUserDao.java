package dataAccess.concretes;


import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void save(User user) {
		System.out.println("Sisteme e-posta ve parola ile kayýt olundu.Üyelik sonucu kullanýcýya doðrulama e-postasý gönderildi.");
		
	}

	
}
