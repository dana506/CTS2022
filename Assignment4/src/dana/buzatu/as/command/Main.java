package dana.buzatu.as.command;

public class Main {

	public static void main(String[] args) {

		
		AlertReceiver alertReceiverAlert = new AlertReceiver(12, 30, 38);
		AlertReceiver fireDepartmentAlert = new AlertReceiver(20, 30, 40);
	
		int alertNo = 6;
	
		AlertSystem alertSystem = new AlertSystem(alertNo);
	
		System.out.println("Waiting");
		alertSystem.sendAlert();
	}
}