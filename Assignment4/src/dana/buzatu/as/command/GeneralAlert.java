package dana.buzatu.as.command;

public class GeneralAlert implements Alert {

	private AlertReceiver alertReceiver;

	@Override
	public void alertNotify() {
		alertReceiver.alertIceCreamDepartment();
	}

	public GeneralAlert(AlertReceiver alertReceiver){
			this.alertReceiver = alertReceiver;
		}

}