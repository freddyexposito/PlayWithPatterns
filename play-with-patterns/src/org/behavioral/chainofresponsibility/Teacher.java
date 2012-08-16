package org.behavioral.chainofresponsibility;

import java.text.MessageFormat;

/**
 * Less responsibility in the chain
 * 
 * @author FExposito
 * 
 */
public class Teacher extends Staff {

	public Teacher(String name, Staff boss) {
		super(name, boss);
	}

	@Override
	public void processRequest(Request request) {
		if (request.getResponsibilityLevel() == ResponsibilityLevel.LOW) {
			System.out.println(MessageFormat.format("{0} processed the request: {1}",
					getName(), request.getDescription()));
		} else {
			System.out.println(MessageFormat
					.format("{0} doesn''t have enough privileges to process request: {1} so he/she is passing it to his/her boss.",
							getName(), request.getDescription()));
			getBoss().processRequest(request);
		}
	}

}
