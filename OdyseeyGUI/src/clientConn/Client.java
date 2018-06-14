package clientConn;

import java.io.*;
import java.net.*;


class socketListenerThread extends Thread{

	public void run() {

		try {
			Client.runSocketListener();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}



public class Client {

	  static Socket SOCK;

	public void startClient() {
		try {
			// connect to socket
			Client.SOCK = new Socket("localhost",1234);
			socketListenerThread ListenThread = new socketListenerThread();
			ListenThread.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// listens for inbound information from server 
	protected static void runSocketListener() throws IOException {
		InputStreamReader inputCatcher;
		BufferedReader bufferedRead;

		
		while(true) {
			inputCatcher = new InputStreamReader(SOCK.getInputStream());
			bufferedRead = new BufferedReader(inputCatcher);
			
			if(bufferedRead.readLine() != null) {
				if(bufferedRead.ready()) {
					String input = "z";
					// find out more about bufferedRead.lines() (its about Streaming)
					while(bufferedRead.readLine() != null) {
						input.concat(bufferedRead.readLine());
					}
					input.substring(1);
					
					organizeInput(input);	
				}	
			}	
			
		}
			
		
	}
	
	
	
	// organizes everything that comes from the server
	private static void organizeInput(String input) {
		
	System.out.println("The Input is...:"+input);
	
	}
	
	
	
	
	
	
	
	
}
