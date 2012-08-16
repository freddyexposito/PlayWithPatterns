package org.behavioral.observer;

public class ObserverDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create event source
		EventSource eventSource = new EventSource();
		
		//create observers
		ResponseHandler rh1 = new ResponseHandler("Peter");
		ResponseHandler rh2 = new ResponseHandler("John");
		
		//subscribe observers
		eventSource.addObserver(rh1);
		eventSource.addObserver(rh2);
		
		//start app
		Thread thread = new Thread(eventSource);
		thread.start();
	}

}
