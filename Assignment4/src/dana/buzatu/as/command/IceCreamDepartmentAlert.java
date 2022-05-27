package dana.buzatu.as.command;

public class IceCreamDepartmentAlert implements Alert{

	private AlertReceiver alertReceiver;

	@Override
	public void alertNotify() {
		alertReceiver.alertIceCreamDepartment();
	}
	
	public IceCreamDepartmentAlert(AlertReceiver alertReceiver){
		this.alertReceiver = alertReceiver;
	}

}