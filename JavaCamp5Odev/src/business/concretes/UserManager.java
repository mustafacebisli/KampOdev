package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.UserService;
import core.abstracts.checks;
import core.concretes.emailCheck;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private checks[] checkss;

	public UserManager(UserDao userDao, checks[] checkss) {
		super();
		this.userDao = userDao;
		this.checkss = checkss;
	}

	@Override
	public void save(User user) {

		for (checks checks1 : checkss) {
			if (checks1.kontrol(user) == false) {
				System.out.println("Kayýt edilemedi");
				return;
			}

		}

		this.userDao.save(user);
	}

}
