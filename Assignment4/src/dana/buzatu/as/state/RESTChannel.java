package dana.buzatu.as.state;
import dana.buzatu.as.state.*;

public class RESTChannel implements ICommunication{


	CommunicationManager messageManager;
	
	public RESTChannel (CommunicationManager messageManager) {
		this.messageManager = messageManager;
	}
	
	@Override
	public void print(String message) {
		
		System.out.println("REST: "+ message);
		
		//make the transition to a new state
		this.messageManager.setMeanOfCommunication(MeanOfCommunication.SMS);
		this.messageManager.print(message.replace(message, ""));
	}
}
