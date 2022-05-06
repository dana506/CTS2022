package dana.buzatu.as.composite;

public class WeatherProjectFile implements ProjectFile {
	private String name;
	private Integer noBytes;
	private Integer noSunnyDays;
	
	@Override
	public void printProjectName() {
		System.out.println(this.name);
	}

	

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNoBytes() {
		return noBytes;
	}

	public void setNoBytes(Integer noBytes) {
		this.noBytes = noBytes;
	}

	public Integer getNoPrecipitationType() {
		return noSunnyDays;
	}

	public void setNoCategories(Integer noSunnyDays) {
		this.noSunnyDays= noSunnyDays;
	}

	public WeatherProjectFile(String name, Integer noBytes, Integer noSunnyDays) {
		super();
		this.name = name;
		this.noBytes = noBytes;
		this.noSunnyDays = noSunnyDays;
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	
}