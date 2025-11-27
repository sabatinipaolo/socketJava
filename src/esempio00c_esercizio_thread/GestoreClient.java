package esempio00c_esercizio_thread;


import java.net.Socket;
import java.util.Scanner;

class GestoreClient implements Runnable {
    Socket connectionSocket;

    public GestoreClient(Socket connectionSocket) {
        this.connectionSocket = connectionSocket;
    }

    public void run() {
        try {
            Scanner scanner = new Scanner(connectionSocket.getInputStream());
               
            
            String messaggio;
            do {
                 messaggio = scanner.nextLine();
                 System.out.println("Messaggio ricevuto da "+ connectionSocket.getInetAddress() +
                    ":" + connectionSocket.getPort() +"=" + messaggio);

                                 
                    
            } while (!messaggio.equalsIgnoreCase("@exit"));
            
            connectionSocket.close();
            scanner.close();
            System.out.println("Connessione chiusa dal client"+ connectionSocket.getInetAddress() +
                    ":" + connectionSocket.getPort());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
