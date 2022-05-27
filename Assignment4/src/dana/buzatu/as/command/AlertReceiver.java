package dana.buzatu.as.command;

public class AlertReceiver {

	private int humidity;
	private int windSpeed;
	private int temperature;

	public AlertReceiver(int humid, int windspeed, int temp) {
		this.humidity = humid;
		this.windSpeed = windspeed;
		this.temperature = temp;
	}

	public void alertFireDepartment() {
		if (humidity < 30 & windSpeed > 30 & temperature > 39)
			System.out.println("Alert the Fire Department");
	}

	public void publishGeneralAlert() {
		if (temperature < -15)
			System.out.println("Stay at home Alert");
	}

	public void publishStormAlert() {
		if (windSpeed > 90)
			System.out.println("Storm Alert");
	}

	public void alertIceCreamDepartment() {
		if (humidity < 30 & windSpeed < 5 & temperature > 39)
			System.out.println("Alert the Ice cream Department");
	}

}
