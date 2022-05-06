package dana.buzatu.as.decorator;

import dana.buzatu.as.decorator.*;

public class TestDecorator {
	
	public static void main(String[] args) throws CloneNotSupportedException {


	User user = new MediatorUser("Dana Buzatu", "dbuzatu@gmail.com", "pass", 20);
	user.dataAnalysisOnProjectFile("forcasting");
	
	AdministratorUser administratorUser = new AdministratorUser("Admin Admin", "admin@gmail.com", "pass2");
	administratorUser.modifyPassword("pass3");
	}

}
