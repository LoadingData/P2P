/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Jeroen
 */
import java.io.*;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ServerThread extends Thread {
Socket socket;
ObjectInputStream in;
ObjectOutputStream out;
ArrayList<Container> containerArray;


public ServerThread(Socket socket, ArrayList<Container> containerArray) throws IOException {
   // super("Server Thread");
    this.socket = socket;  
    this.containerArray = containerArray;
}

public void run() 
{   
    showmsg("Accepted connection : " + socket.getInetAddress().getHostName());
    try {
        out = new ObjectOutputStream(socket.getOutputStream());
        out.flush();
        in = new ObjectInputStream(socket.getInputStream());
        
        out.writeObject("lekker jongen");
        out.flush();
//        out.writeObject("die frikandellen");
//        out.flush();
        
        readMessage();
        out.writeObject("nog lekkerder");
        out.flush();
        
         out.writeObject("nog of niet");
        out.flush();
         out.writeObject("nog meer boten");
        out.flush();
         out.writeObject("nog meer VEEL MEER BOTEN");
        out.flush();
    } catch (IOException ex) {
        ex.printStackTrace();                
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}


void readMessage() throws IOException, ClassNotFoundException
{    
    String message;
    message = (String)in.readObject();
    System.out.println(message);
}

void sendMessage(String msg)
	{
		try{
			out.writeObject(msg);
			out.flush();			
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
	}



public static void showmsg(String message) {
    System.out.println("server|| " + message);
}

	
}

