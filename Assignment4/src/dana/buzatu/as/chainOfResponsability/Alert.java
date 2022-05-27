package dana.buzatu.as.chainOfResponsability;

public class Alert {

	private int priority;
	private String action;

	public Alert(String Action, int priority){
		this.action = Action;
		this.priority = priority;
	}

	public int getPriority(){
		return priority;
	}

	public String getAction(){
		return action;
	}
}