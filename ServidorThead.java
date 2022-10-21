package br.edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServidorThead implements Runnable{

	private Socket socket;
	public ServidorThead(Socket socket) {
		this.socket = socket;
	}
	public void run() {
	try {
		InputStreamReader isr = new InputStreamReader(socket.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		while(true) {
			System.out.println(br.readLine());
			
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
			}
		
	}
	
	
	

}
