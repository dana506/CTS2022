package dana.buzatu.as.observer;

public class Client extends Notifiable {
	private boolean isNotified = false;

	public void setNotified() {
		if (!isNotified) {
			isNotified = true;
			this.notifyObservers();
		} else
			isNotified = false;
	}

	public void Click() {
		System.out.println("Client notified new recorded data");
		setNotified();

	}
}