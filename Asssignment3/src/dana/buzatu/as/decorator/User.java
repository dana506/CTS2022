package dana.buzatu.as.decorator;

public abstract class User {
	String name;
	String email;
	String password;
	
	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public abstract void addProjectFile(String fileName);
	
	public abstract void dataAnalysisOnProjectFile(String fileName);
	
	public abstract void deleteProjectFile(String fileName);
	
	public abstract void modifyName(String name);
	
	public abstract void modifyPassword(String pass);
}