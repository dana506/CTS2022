package dana.buzatu.as.composite;

import dana.buzatu.as.composite.*;

public class TestComposite {

	public static void main(String[] args) throws CloneNotSupportedException {

		ProjectFile file1 = new WeatherProjectFile("File1.csv", 100, 50);
		ProjectFile file2 = new ForecastingDataFile("File2.xml", 365, 1500);
		ProjectFile file3 = new WeatherProjectFile("File3.csv", 10, 4);
		AbstractProjectFile pFile = new AbstractProjectFile(2000, "APF");

		pFile.addProjectFile(file1);
		pFile.addProjectFile(file2);
		pFile.addProjectFile(file3);

		System.out.println(pFile.getProjectFile(1).getName());

	}

}
