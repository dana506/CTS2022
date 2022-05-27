package dana.buzatu.as.chainOfResponsability;

public abstract class Handler {
	protected Handler succesor = null;
	
	public void setSuccessor(Handler succesor){
		this.succesor = succesor;
	}

	public abstract void smsManage(Alert alert);
	public abstract void flyFireDrone(Alert alert);
	public abstract void fillTruck(Alert alert);
}