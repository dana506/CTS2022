package dana.buzatu.as.decorator;


public class MediatorUser extends User {
	
	int noParties;

	public MediatorUser(String name, String email, String password, int noParties) {
		super(name, email, password);
		this.noParties = noParties;
	}

	@Override
	public void addProjectFile(String fileName) {
		if(this.noParties > 20) {
			System.out.println("large project file");
		}
		else {
			System.out.println("small project file");
		}
	}

	@Override
	public void dataAnalysisOnProjectFile(String fileName) {
		if(this.noParties> 20) {
			System.out.println("large project analysis");
		}
		else {
			System.out.println("large project analysis");
		}
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
		// TODO Auto-generated method stub
		
	}
	
	
}