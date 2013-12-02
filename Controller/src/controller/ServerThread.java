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
        sendContainer();
       // sendAGV();
    } catch (IOException ex) {
        Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
    }
   
    

}

//private void sendShip() throws IOException
//{
//    ObjectOutputStream oos = new ObjectOutputStream(
//    socket.getOutputStream());
//    
//}
void sendContainer() throws IOException
{
    out = new ObjectOutputStream(socket.getOutputStream());
    out.flush();
    in = new ObjectInputStream(socket.getInputStream());

    sendMessage("Connectie blijf niet open staan.");
    
}

void sendAGV() throws IOException
{
    out = new ObjectOutputStream(socket.getOutputStream());
    out.flush();
    in = new ObjectInputStream(socket.getInputStream());

    sendMessage("nu WEL!.");
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

