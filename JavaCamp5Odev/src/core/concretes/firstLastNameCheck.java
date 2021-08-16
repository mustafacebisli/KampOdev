package core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import core.abstracts.checks;
import entities.concretes.User;

public class firstLastNameCheck implements checks {

	public firstLastNameCheck() {
	}

	@Override
	public boolean kontrol(User user) {
		String regex1 = ".{2,}";
		Pattern pattern1 = Pattern.compile(regex1);
		Matcher matcher1 = pattern1.matcher(user.getFirstName());
		Matcher matcher2 = pattern1.matcher(user.getLastName());
		if (matcher1.matches() == true && matcher2.matches() == true) {
			return true;
		} else if (matcher1.matches() == false) {

			System.out.println("Adýnýz en az 2 karakter olabilir.");
			return false;
		}

		else if (matcher2.matches() == false) {
			System.out.println("Soyadýnýz en az 2 karakter olabilir.");
			return false;
		}
		else 
			return false;
	}
}
