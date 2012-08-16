package org.behavioral.chainofresponsibility;

import java.text.MessageFormat;

public class Manager extends Staff {

	public Manager(String name, Staff boss) {
		super(name, boss);
	}

	@Override
	public void processRequest(Request request) {
		if (request.getResponsibilityLevel() == ResponsibilityLevel.MEDIUM) {
			System.out.println(MessageFormat.format("{0} processed the request: {1}",
					getName(), request.getDescription()));
		} else {
			System.out.println(MessageFormat
					.format("{0} doesn''t have enough privileges to process request: {1} so he/she is passing it to her/his boss.",
							getName(), request.getDescription()));
			getBoss().processRequest(request);
		}
	}

}
