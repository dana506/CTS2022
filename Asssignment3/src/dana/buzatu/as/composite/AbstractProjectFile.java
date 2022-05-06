package dana.buzatu.as.composite;

import java.util.ArrayList;
import java.util.List;


public class AbstractProjectFile implements ProjectFile {

	private Integer noBytes;
	private String name;
	
	private List<ProjectFile> files;
	
	public AbstractProjectFile(Integer noBytes, String name) {
		super();
		this.noBytes = noBytes;
		this.name = name;
		this.files = new ArrayList<>();
	}



	@Override
	public void printProjectName() {
		System.out.println(this.name);
	}
	
	public void addProjectFile(ProjectFile projectFile) {
		files.add(projectFile);
	}
	
	public void deleteProjectFile(ProjectFile projectFile) {
		files.remove(projectFile);
	}
	
	public ProjectFile getProjectFile(int index) {
		return files.get(index);
	}



	@Override
	public String getName() {
		return this.name;
	}

}