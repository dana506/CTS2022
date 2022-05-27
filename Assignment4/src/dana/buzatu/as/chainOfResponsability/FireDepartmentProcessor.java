package dana.buzatu.as.chainOfResponsability;

public class FireDepartmentProcessor extends Handler {

	@Override
	public void smsManage(Alert alert) {
		System.out.println("SMS voluntary firemen");
		if (this.succesor != null)
			this.succesor.smsManage(alert);
	}

	@Override
	public void flyFireDrone(Alert alert) {
		System.out.println("fly fire drone");
		if (this.succesor != null)
			this.succesor.flyFireDrone(alert);

	}

	@Override
	public void fillTruck(Alert alert) {
		System.out.println("fill truck with water");
		if (this.succesor != null)
			this.succesor.fillTruck(alert);

	}
}
