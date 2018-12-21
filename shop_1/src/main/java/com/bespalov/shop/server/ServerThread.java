package com.bespalov.shop.server;

import java.io.*;
import java.net.Socket;

public class ServerThread extends Thread {
   /* private PrintWriter printWriter;
    private BufferedReader bufferedReader;
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    public void getConnection() {
        try {
            printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Wait your command");
            String s = bufferedReader.readLine();
            System.out.println(s);
            if (s.equalsIgnoreCase("exit")) {
                printWriter.println("Bye");
            } else
                printWriter.println("Hello World");
            System.out.println(1);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            printWriter.close();
        }
    }*/

    @Override
    public void run() {
    }

}
