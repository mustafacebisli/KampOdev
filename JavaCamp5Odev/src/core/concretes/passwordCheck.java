package core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import core.abstracts.checks;
import entities.concretes.User;

public class passwordCheck implements checks {
	
	public passwordCheck() {}
	@Override
	public boolean kontrol(User user) {
		// TODO Auto-generated method stub
		String regex1 = ".{6,}";
		Pattern pattern1 = Pattern.compile(regex1);
		Matcher matcher1 = pattern1.matcher(user.getPassword());
		if (matcher1.matches() == true) {
			return true;
		}
		else {
			System.out.println("Þifreniz en az 6 haneli olabilir.");
		return false;
		}
	}

}
