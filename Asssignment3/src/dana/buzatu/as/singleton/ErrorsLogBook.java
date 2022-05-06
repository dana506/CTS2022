package dana.buzatu.as.singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class ErrorsLogBook {

	public String logBookName = "logbook";
	private static File logFile;

	private static ErrorsLogBook instanceLogger = null;

	public static ErrorsLogBook getInstance() {
		if (instanceLogger == null) {
			instanceLogger = new ErrorsLogBook();
		}
		return instanceLogger;
	}

	private ErrorsLogBook() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();

		logBookName = logBookName+ '-' + dateFormat.format(cal.getTime()) + ".log";

		ErrorsLogBook.logFile = new File(logBookName);
		try {
			if (logFile.createNewFile()) {
				System.out.println("New log file");
			}
		} catch (IOException e) {
			System.out.println("Error when creating log file");
		}
	}

	public void log(String message) {
		try {
			FileWriter out = new FileWriter(ErrorsLogBook.logFile, true);
			out.write(message.toCharArray());
			out.close();
			System.out.println("Errors LogBook created.");
		} catch (IOException e) {
			System.err.println("Could not write to log file");
		}
	}
}