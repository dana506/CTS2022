package dana.buzatu.as.registry;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class RegistryLogBook {
	public String loggerName = "logger";
	private static File logFile;
	protected String env = System.getProperty("user.dir");

	private static HashMap<String, RegistryLogBook> loggers = new HashMap<>();
	
	public static RegistryLogBook getInstancesLoggers(String fileName){
		RegistryLogBook logger = loggers.get(fileName);
		if(logger == null) {
			logger = new RegistryLogBook(fileName);
			loggers.put(fileName, logger);
		}
		return logger;
	}

	private RegistryLogBook(String fileName){
		loggerName =  loggerName + '-' +  fileName + ".log";
	
		RegistryLogBook.logFile = new File(loggerName);
		try{
			if(logFile.createNewFile()){
				System.out.println("Creating new log file");	
			}
		}catch(IOException e){
			System.out.println("Cannot create log file");
			System.exit(1);
			}	
		}

	public void log(String message){
		try{
			FileWriter out = new FileWriter(RegistryLogBook.logFile, true);
			out.write(message.toCharArray());
			out.close();
		}catch(IOException e){
			System.err.println("Could not write to log file");
		}
	}
}