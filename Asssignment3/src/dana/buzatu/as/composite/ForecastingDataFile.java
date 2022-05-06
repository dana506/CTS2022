package dana.buzatu.as.composite;


public class ForecastingDataFile implements ProjectFile {
	private String name;
	private Integer noDays;
	private Integer noBytes;
	
	@Override
	public void printProjectName() {
		System.out.println(this.name);
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNoDays() {
		return noDays;
	}

	public void setNoDays(Integer noWords) {
		this.noDays = noWords;
	}

	public Integer getNoBytes() {
		return noBytes;
	}

	public void setNoBytes(Integer noBytes) {
		this.noBytes = noBytes;
	}

	public ForecastingDataFile(String name, Integer noDays, Integer noBytes) {
		super();
		this.name = name;
		this.noDays = noDays;
		this.noBytes = noBytes;
	}

	
}