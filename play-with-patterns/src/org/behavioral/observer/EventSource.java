package org.behavioral.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

public class EventSource extends Observable implements Runnable{

	@Override
	public void run() {
		try{
		final InputStreamReader isr = new InputStreamReader(System.in);
		final BufferedReader br = new BufferedReader(isr);
		
		while(true){
			String content = br.readLine();
			setChanged();
			notifyObservers(content);
		}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}


}
