package dana.buzatu.as.command;

public class FireDepartmentAlert implements Alert{

	private AlertReceiver alertReceiver;

	@Override
	public void alertNotify() {
		alertReceiver.alertFireDepartment();
	}
	
	public FireDepartmentAlert(AlertReceiver alertReceiver){
		this.alertReceiver = alertReceiver;
	}

}