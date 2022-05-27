package dana.buzatu.as.memento;

import java.util.ArrayList;
import java.util.List;


public class FireDrone {
	private List<DroneMemento> history = new ArrayList<DroneMemento>();

	
	public void smokeSignal(DroneMemento newpath){
		this.history.add(newpath);
	}
	
	public DroneMemento recoverLastVersion(){
		if(history.size()!=0){
			DroneMemento newpath =  history.get(history.size()-1);
			history.remove(history.size()-1);
			return newpath;
		}
		else
			return new DroneMemento("");
	}
}