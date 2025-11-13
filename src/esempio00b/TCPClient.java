package esempio00b;

import utility.Tool;

import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] argv) throws Exception {
        System.out.println("Hello I'm Client - 00b");
        Tool.pressEnterKeyToContinue("c1 ) premi enter per creare un socket connesso al server");

        String serverAddress = "127.0.0.1";
        Socket clientSocket = new Socket(serverAddress, 9999);

        Tool.pressEnterKeyToContinue("c2 ) premi enter per inviare \"ciao mondo!!\" al server");

        String messaggio = "ciao mondo!!";
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        out.println(messaggio);

        Tool.pressEnterKeyToContinue("c3 ) premi enter chiudere la connessione ");
        clientSocket.close();

    }
}