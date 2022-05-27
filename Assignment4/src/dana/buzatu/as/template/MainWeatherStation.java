package dana.buzatu.as.template;
import dana.buzatu.as.*;

public class MainWeatherStation extends AbstractWeatherStation{

		@Override
		public void connectToSensor() {
			System.out.println("MainWeatherStation: sensor connected");
		}

		@Override
		public void readSensorData() {
			System.out.println("MainWeatherStation: read sensor data");
		}

		@Override
		public void stateSensorData() {
			System.out.println("MainWeatherStation: sensor data");
		}

		@Override
		public void publishSensorData() {
			System.out.println("MainWeatherStation: published sensor data");
		}

	}