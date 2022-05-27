package dana.buzatu.as.observer;

public class LocalAlertingSystemHandler implements HandlerNotification{

	@Override
	public void doNotify() {
		System.out.println("Connect local alerting system ");
	}

}
