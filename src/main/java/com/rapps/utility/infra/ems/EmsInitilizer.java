package com.rapps.utility.infra.ems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Access point for spring boot to start execution of the program.
 * 
 * @author vkirodian
 *
 */
@SpringBootApplication
public class EmsInitilizer {

	private static final Logger LOG = LoggerFactory.getLogger(EmsInitilizer.class);

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LOG.info("Initializing Application");
		SpringApplication.run(EmsInitilizer.class, args);
		LOG.info("Initialized Application");
	}
}
