package ru.krista.edu.distrib.tech.socket;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

public class portScaner {

    String host = "127.0.0.1";

    public void start() throws IOException {
        int startPort = 1;
        int endPort = 65535;

        for (int port = startPort; port <= endPort; port++){
            if (isOpen(port)){
                System.out.print(port + ": Open\n");
            }
            else
            {
                System.out.print(port + ": Closed/unknown\n");
            }
        }
    }

    boolean isOpen(int port) throws IOException{
        try{
            Socket socket = new Socket(this.host, port);
            socket.close();
            return true;
        }
        catch (ConnectException ex){
            return false;
        }
    }
}
