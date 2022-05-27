package dana.buzatu.as.memento;

public class DronePath {

	private StringBuilder route;
	private String name;

	public DronePath(String name){
		this.route = new StringBuilder();
		this.name = name;
	}

	public void addRoute(String newRoute) {
		route.append(newRoute);
	}

	public DroneMemento save() {
		System.out.println("Save new route");
		return new DroneMemento(this.route.toString());
	}

	public void reverse(DroneMemento savedRoute) {
		this.route = new StringBuilder();
		this.route.append(savedRoute.getVersionContent());
	}

	public String getText() {
		return this.route.toString();
	}
}