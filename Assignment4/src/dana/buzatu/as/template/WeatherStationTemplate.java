package dana.buzatu.as.template;

public class WeatherStationTemplate {

	public static void main(String[] args) {

		MainWeatherStation mainWeatherStation = new MainWeatherStation();
		AuxWeatherStation auxWeatherStation = new AuxWeatherStation();

		mainWeatherStation.sensor();
		auxWeatherStation.sensor();
	}

}