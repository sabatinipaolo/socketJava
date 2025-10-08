package esempio00c;

import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] argv) throws Exception {
        System.out.println("Hello I'm Client - 00C");
        //Tool.pressEnterKeyToContinue("c1 ) premi enter per creare un socket connesso al server");

        String serverAddress = "127.0.0.1";
        Socket clientSocket = new Socket(serverAddress, 9999);

        System.out.println("Sono il client :" + clientSocket.getLocalAddress() +
                ":" + clientSocket.getLocalPort() +
                " e mi sono connesso al server " + clientSocket.getInetAddress() +
                ":" + clientSocket.getPort());
        
        
        String messaggio;

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
  
        do {
            System.out.print("Inserisci un messaggio da inviare al server (@exit per terminare): ");
            messaggio = scanner.nextLine();
            out.println(messaggio);
            
        } while (!messaggio.equalsIgnoreCase("@exit"));

        //Tool.pressEnterKeyToContinue("c3 ) premi enter chiudere la connessione ");
        clientSocket.close();

        scanner.close();

    }
}