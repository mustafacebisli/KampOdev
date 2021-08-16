package dataAccess.abstracts;

import entities.concretes.User;

public interface UserDao {
	
	void save(User user);
	
	
}
