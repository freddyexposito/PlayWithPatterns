package org.behavioral.chainofresponsibility;

import java.text.MessageFormat;

public class Director extends Staff {

	public Director(String name, Staff boss) {
		super(name, boss);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processRequest(Request request) {
		if (request.getResponsibilityLevel() == ResponsibilityLevel.HIGH) {
			System.out.println(MessageFormat.format("{0} processed the request: {1}",
					getName(), request.getDescription()));
		} else {
			
			System.out.println("it shouldn't reach this point ;)");
		}
	}


}
