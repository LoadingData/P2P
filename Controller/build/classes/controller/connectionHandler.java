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
import java.net.*;
import java.util.ArrayList;


public class connectionHandler {
    
    static ServerSocket serverSocket = null;
    static Socket clientSocket = null;
    static boolean listening = true;
    public ArrayList<Container> containerArray;

//    public static void main(String[] args) throws IOException {
//        try {
//            serverSocket = new ServerSocket(2004, 10);
//        } catch (IOException e) {
//            ServerThread.showmsg("Port not available!");                      
//        }
//
//        ServerThread.showmsg("server- initialized");
//        ServerThread.showmsg("server- waiting...");
//
//        while (listening) {
//            new ServerThread(serverSocket.accept()).start();
//        }
//    }
    
    public connectionHandler(ArrayList<Container> containerArray) throws IOException
    {
        this.containerArray = containerArray;
                try {
            serverSocket = new ServerSocket(2004, 10);
        } catch (IOException e) {
            ServerThread.showmsg("Port not available!");                      
        }

        ServerThread.showmsg("initialized");
        ServerThread.showmsg("waiting...");

        while (listening) {
            new ServerThread(serverSocket.accept(),containerArray).start();
        }
    }
}
