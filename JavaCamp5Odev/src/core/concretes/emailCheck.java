package core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import core.abstracts.checks;
import entities.concretes.User;

public class emailCheck implements checks {

	public emailCheck() {}
	@Override
	public boolean kontrol(User user) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		if (matcher.matches() == true) {
			return true;
		} 
		else {
			System.out.println("Doðru bir e-mail giriniz.");
			return false;
		}

	}
}
