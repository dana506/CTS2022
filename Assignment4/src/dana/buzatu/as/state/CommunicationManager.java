package dana.buzatu.as.state;

import dana.buzatu.as.state.*;

public class CommunicationManager {

	// current state of the manager
	ICommunication currentState;

	public CommunicationManager() {
		currentState = new SMSChannel();
	}

	public void selectREST() {
		this.currentState = new RESTChannel(this);
	}

	public void selectWebsite() {
		this.currentState = new WebsiteChannel(this);
	}

	public void resetPreferences() {
		this.currentState = new SMSChannel();
	}

	public void setMeanOfCommunication(MeanOfCommunication channel){
		if(channel == MeanOfCommunication.SMS)
			this.currentState = new SMSChannel();
		else
			if(channel == MeanOfCommunication.REST)
				this.currentState = new RESTChannel(this);
			else
				this.currentState = new WebsiteChannel(this);
	}

	public void print(String message) {
		this.currentState.print(message);
	}

}