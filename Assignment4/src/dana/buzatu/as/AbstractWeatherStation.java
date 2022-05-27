package dana.buzatu.as;

public abstract class AbstractWeatherStation {
	
	//define the steps
	public abstract void connectToSensor();
	public abstract void readSensorData();
	public abstract void stateSensorData();
	public abstract void publishSensorData();
	
	
	//template method
	public final void sensor(){
		connectToSensor();
		readSensorData();
		stateSensorData();
		publishSensorData();
	}
}