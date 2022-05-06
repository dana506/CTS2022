package dana.buzatu.as.decorator;


public abstract class AbstractUserDecorator extends User {

	User decoratedObject;
	
	public AbstractUserDecorator(User decoratedObject) {
		super(decoratedObject.name, decoratedObject.email, decoratedObject.password);
		this.decoratedObject = decoratedObject;
	}

	@Override
	public void addProjectFile(String fileName) {
		this.decoratedObject.addProjectFile(fileName);	
	}

	@Override
	public void dataAnalysisOnProjectFile(String fileName) {
		this.decoratedObject.dataAnalysisOnProjectFile(fileName);
	}

	@Override
	public void deleteProjectFile(String fileName) {
		this.decoratedObject.deleteProjectFile(fileName);
	}

	@Override
	public void modifyName(String name) {
		this.decoratedObject.modifyName(name);
	}

	@Override
	public void modifyPassword(String pass) {
		this.decoratedObject.modifyPassword(pass);
	}
	
	
}