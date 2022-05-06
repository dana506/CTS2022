package dana.buzatu.as.decorator;

import java.util.ArrayList;
import java.util.List;

public class AdministratorUser extends User{

	public AdministratorUser(String name, String email, String password) {
		super(name, email, password);
		// TODO Auto-generated constructor stub
	}

	List<String> unusuablePasswords = new ArrayList<>();

	@Override
	public void addProjectFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dataAnalysisOnProjectFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProjectFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyPassword(String pass) {
		unusuablePasswords.add(pass);
		System.out.println("Password saved");
	}
	
}
