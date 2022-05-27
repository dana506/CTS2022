package dana.buzatu.as.template;

import dana.buzatu.as.*;

public class AuxWeatherStation extends AbstractWeatherStation {

	@Override
	public void connectToSensor() {
		System.out.println("AuxWeatherStation: sensor connected");
	}

	@Override
	public void readSensorData() {
		System.out.println("AuxWeatherStation: read sensor data");
	}

	@Override
	public void stateSensorData() {
		System.out.println("AuxWeatherStation: sensor data");
	}

	@Override
	public void publishSensorData() {
		System.out.println("AuxWeatherStation:  published sensor data");
	}

}