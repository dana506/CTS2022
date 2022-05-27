package dana.buzatu.as.memento;

import java.util.Date;

public class DroneMemento {
    private final String path;
    private Date timeStamp;
    
    public DroneMemento(String pathToSave) {
    	path = pathToSave;
    	timeStamp = new Date();
    }

    public String getVersionContent() {
        return path;
    }
}