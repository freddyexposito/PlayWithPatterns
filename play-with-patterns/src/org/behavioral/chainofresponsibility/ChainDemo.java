package org.behavioral.chainofresponsibility;

public class ChainDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Creating staff
		Staff director = new Director("Mary", null);
		Staff manager = new Manager("Paul", director);
		Staff teacher = new Teacher("Amelia", manager);
		
		//low priority request
		Request lowRequest = new Request(ResponsibilityLevel.LOW,
				"Parent request a copy of status.");
		teacher.processRequest(lowRequest);
		
		System.out.println("-----------------------");
		
		//medium priority request
		Request mediumRequest = new Request(ResponsibilityLevel.MEDIUM,
				"Parent wants to pay the fees.");
		teacher.processRequest(mediumRequest);

		System.out.println("-----------------------");
				
		//high priority request
		Request highRequest = new Request(ResponsibilityLevel.HIGH,
				"Doctor wants to arrage a visit for all the kids.");
		teacher.processRequest(highRequest);
	}

}
