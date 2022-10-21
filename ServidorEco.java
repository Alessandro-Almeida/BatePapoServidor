package br.edu;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorEco {

	public static void main(String[] args) throws IOException{
		ServerSocket socket;
		socket = new ServerSocket(4235);
		System.out.println("Servidor Alessandro");
		while(true) {
			Socket ssocket	= socket.accept();
			ServidorThead srun = new ServidorThead(ssocket);
			Thread thread = new Thread (srun);
			thread.start();
		}
	}

}
