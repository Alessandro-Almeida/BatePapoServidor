package br.edu;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;


public class Ciente2 {

	public static void main(String[] args)throws IOException, IOException {
		Scanner scanner = new Scanner(System.in);
		Socket socket = new Socket("10.8.175.5", 4235);
		System.out.println("Eu sou a Lenda 2");
		OutputStreamWriter writer = 
				new OutputStreamWriter(socket.getOutputStream());
		do {
			writer.write(scanner.nextLine()+"\n");
			writer.flush();
		}while(true);

	}

}
