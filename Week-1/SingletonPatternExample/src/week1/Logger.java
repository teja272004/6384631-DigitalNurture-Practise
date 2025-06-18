package week1;

public class Logger {
	private static Logger curlog = new Logger();//log object
	private Logger() {
		System.out.println("Logger Class Called");
		
	}
	static Logger getInstance() {
		return curlog;
	}
	//logging method
	public void log(String msg) {
		System.out.println(msg);
	}
}
