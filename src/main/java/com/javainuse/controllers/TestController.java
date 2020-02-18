package com.javainuse.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Employee;

import java.net.InetAddress;

@RestController
public class TestController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String helloPage() {
		return "Hello Spring Boot";
        }

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		try {
			InetAddress iAddress = InetAddress.getLocalHost();
			String hostName = iAddress.getHostName();

			emp.setLocation(hostName);
		} catch (Exception e) {

		}

		return emp;
	}


	@RequestMapping(value = "/load", method = RequestMethod.GET)
	public String generateLoad() {
        	int numCore = 2;
        	int numThreadsPerCore = 2;
        	double load = 0.8;
        	final long duration = 100000;
        	for (int thread = 0; thread < numCore * numThreadsPerCore; thread++) {
            		new BusyThread("Thread" + thread, load, duration).start();
        	}

		return "finished";
    	}

    	/**
    	 * Thread that actually generates the given load
    	 * @author Sriram
    	 */
    	private static class BusyThread extends Thread {
        	private double load;
        	private long duration;

        	/**
        	 * Constructor which creates the thread
        	 * @param name Name of this thread
        	 * @param load Load % that this thread should generate
        	 * @param duration Duration that this thread should generate the load for
        	 */
        	public BusyThread(String name, double load, long duration) {
            		super(name);
            		this.load = load;
            		this.duration = duration;
        	}

        	/**
        	 * Generates the load when run
        	 */
        	@Override
        	public void run() {
            		long startTime = System.currentTimeMillis();
            		try {
                		// Loop for the given duration
                		while (System.currentTimeMillis() - startTime < duration) {
                    			// Every 100ms, sleep for the percentage of unladen time
                    			if (System.currentTimeMillis() % 100 == 0) {
                        			Thread.sleep((long) Math.floor((1 - load) * 100));
                    			}
                		}
            		} catch (InterruptedException e) {
                		e.printStackTrace();
            		}
        	}
    	}
}
