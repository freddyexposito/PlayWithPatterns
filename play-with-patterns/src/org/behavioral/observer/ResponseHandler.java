package org.behavioral.observer;

import java.text.MessageFormat;
import java.util.Observable;
import java.util.Observer;

public class ResponseHandler implements Observer{

	private String name;
	
	public ResponseHandler(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof String){
			String content = (String) arg;
			System.out.println(MessageFormat.format("{0} received: {1}", name, content));
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
