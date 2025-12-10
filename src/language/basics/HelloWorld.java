package language.basics;

import java.util.logging.Logger;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Logger log = Logger.getLogger("Hello World!");
		log.info("Hey Man");	
		log.warning("Hey man, we have completed line number 48, but unfortunately, there is some issue. Please check.");
				
	}

	
	}
 	


