package week1;

public class Main {
	public static void main(String[] args) {
		Logger log1 = Logger.getInstance();
		log1.log("log1");
		Logger log2 = Logger.getInstance();
		log2.log("log2");
		if(log1==log2) {
			System.out.println("log1 and log2 Objects are Same");
		}else {
			System.out.println("log1 and log2 Objects are not Same");
		}
	}
}
