package dana.buzatu.as.command;

public class StormAlert implements Alert{

	private AlertReceiver alertReceiver;

	@Override
	public void alertNotify() {
		alertReceiver.alertIceCreamDepartment();
	}
	
	public StormAlert(AlertReceiver alertReceiver){
		this.alertReceiver = alertReceiver;
	}

}