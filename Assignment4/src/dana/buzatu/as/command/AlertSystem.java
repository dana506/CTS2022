package dana.buzatu.as.command;

import java.util.ArrayList;

public class AlertSystem {
	public ArrayList<Alert> alertDatabase;
	int alertNo;
			
	public AlertSystem(int alertNumber){
		this.alertNo = alertNumber;
		alertDatabase = new ArrayList<>();
	}
	
	public void receiveInfo(Alert alert){
		this.alertDatabase.add(alert);
	}
	
	public void sendAlert(){
		for(Alert alert: alertDatabase)
			alert.alertNotify();
		this.alertDatabase.clear();
	}
}