package dana.buzatu.as.chainOfResponsability;

public class AlertProcessor extends Handler {

	@Override
	public void smsManage(Alert alert) {
		System.out.println("\n: " + alert.getAction());
		
	}

	@Override
	public void flyFireDrone(Alert alert) {
		System.out.println("\n: " + alert.getAction());
		
	}

	@Override
	public void fillTruck(Alert alert) {
		System.out.println("\n: " + alert.getAction());
		
	}

}
