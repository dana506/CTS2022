package dana.buzatu.as.state;

import dana.buzatu.as.state.*;

public class WebsiteChannel implements ICommunication {

	CommunicationManager messageManager;

	public WebsiteChannel(CommunicationManager messageManager) {
		this.messageManager = messageManager;
	}

	@Override
	public void print(String message) {

		System.out.println("Website: " + message);

		// make the transition to a new state
		this.messageManager.setMeanOfCommunication(MeanOfCommunication.SMS);
		this.messageManager.print(message.replace(message, ""));

	}
}
