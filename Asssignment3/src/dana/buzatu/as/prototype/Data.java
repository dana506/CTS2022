package dana.buzatu.as.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Data implements Cloneable {
	
	String fileName;
	int noColumns;
	ArrayList<Integer> categories = null;

	public Data(String fileName, int noColumns) {

		System.out.println("File on web app");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		this.categories = new ArrayList<>();
		this.fileName = fileName;
		this.noColumns = noColumns;
	}

	private Data() {
		super();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Data copy = new Data();
		copy.fileName = this.fileName;
		copy.noColumns = this.noColumns;
		copy.categories = (ArrayList<Integer>) this.categories.clone(); 
		
		return copy;
	}

	@Override
	public String toString() {
		return "ProjectData [fileName=" + fileName + ", noColumns=" + noColumns + ", categories=" + categories + "]";
	}

}
