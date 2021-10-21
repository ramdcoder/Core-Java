package application;

import java.util.logging.Level;

public class Main {

	public static void main(String[] args) {
		try {
			Log my_log = new Log("Log.txt");
			
			my_log.logger.setLevel(Level.WARNING);
			my_log.logger.warning("warning message");
			my_log.logger.severe("Severe Messahe");
			
		}
		catch(Exception e){
			System.out.println("Exception caught : "+e);
			//e.printStackTrace();
		}
	}

}
