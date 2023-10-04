package UnitProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.log4j.BasicConfigurator;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
@SpringBootApplication
public class LogjProjectApplication {
	
	static Logger log=Logger.getLogger(LogjProjectApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(LogjProjectApplication.class, args);
		//BasicConfigurator.configure();
		PropertyConfigurator.configure("log4j.properties");
		log.info("Information");
		log.error("Error");
		log.debug("Debugging");
		log.fatal("Critical Error");
		log.warn("Warning");
	
		
	}

}
