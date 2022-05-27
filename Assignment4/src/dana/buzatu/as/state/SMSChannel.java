package dana.buzatu.as.state;

public class SMSChannel implements  ICommunication{

	@Override
	public void print(String message) {
		System.out.println("SMS: " + message);
	}
}