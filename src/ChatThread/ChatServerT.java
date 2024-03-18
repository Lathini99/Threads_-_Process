package ChatThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServerT {

	static int port = 7744;

	public static void main (String[] args) throws IOException {
		System.out.println("\t\t Chat Serever");
		System.out.println("\t\t==================\n\n");
		
		ServerSocket serversocket = new ServerSocket(port);
		int current_clients = 1;
		
		try {
			while(true) {
				Socket client = serversocket.accept();
				System.out.println("Client is connected......\n\n");
				
				ServerThread ct = new ServerThread(client, current_clients);
				ct.start();
				current_clients++;
				
			}
		}
		finally 
		{
			serversocket.close();
		}
		
			

	



    }

}
