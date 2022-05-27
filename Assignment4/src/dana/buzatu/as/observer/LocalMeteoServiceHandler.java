package dana.buzatu.as.observer;

public class LocalMeteoServiceHandler implements HandlerNotification{

	@Override
	public void doNotify() {
		System.out.println("Connect to meteo service ");
	}

}
