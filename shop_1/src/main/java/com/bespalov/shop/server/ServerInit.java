package com.bespalov.shop.server;

import com.bespalov.shop.config.Factory;
import com.bespalov.shop.dao.DatabaseDAO;
import com.bespalov.shop.impl.ProductDAOImpl;
import com.bespalov.shop.util.JAXBUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerInit {
    private static java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ServerInit.class.getName());
    private ServerSocket serverSocket;
    private PrintWriter printWriter;
    private BufferedReader bufferedReader;
    private Socket socket;
    private ProductDAOImpl productDAO;
    private Factory factory;
    private JAXBUtil jaxbUtil;

    public ServerInit(int port) throws IOException, ClassNotFoundException {
        serverSocket = new ServerSocket(port);
        productDAO = new ProductDAOImpl();
        jaxbUtil = new JAXBUtil();
    }

    public void initServer() {
        try (ServerSocket serverSocket = this.serverSocket) {
            while (true) {
                socket = serverSocket.accept();
                System.out.println("Socket is connect " + socket.isConnected());
                if (socket.isConnected()) {
                    printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
                    bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    System.out.println("Wait your command");
                    String s = bufferedReader.readLine();
                    logger.info(s);
                    if (s.equalsIgnoreCase("getAll")) {
                        printWriter.println(jaxbUtil.initJAXB(productDAO));

                    } else {
                        printWriter.println("Another command");
                        System.out.println(jaxbUtil.getJAXB(s).getProductList());
                    }

                    if (s.equalsIgnoreCase("exit")) {
                        printWriter.println("Bye");
                        break;
                    }
                }
                Thread.sleep(2000);
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
