 ## esempio 00 a
 ### un semplice TCP Server che rimane in ascolto di connessioni
 ### un semplice TCP Client che si connette ad un server, invia un "Hello world!!" e chiude la connessione

 - Lanciare wireshark in registrazione sull'interfaccia di loopback
 
 - Lanciare il server 
 - osservare che il server in ascolto non produce traffico
 
 - Lanciare il client
 - osservare che il semplice lancio del client non produce traffico
 
 - nel client premere invio alla richiesta di attivare la connessione 
 - osservare che il server stampa "oh! Ho una connessione!!"
 - osservare in wireshark i tre pacchetti prodotti ( three way handshake ) , le porte ..

 - nel client premere invio per inviare "ciao mondo!!"
 - osservare che il server non fa nulla
 - osservare in wireshark i due pacchetti prodotti ( cercare i dati "ciao mondo!!")

 - nel client premere invio per chiudere la connessione
 - osservare che il server non fa nulla
 - osservare in wireshark i due pacchetti prodotti ( FIN ...)


 Altri esperimenti :

 - lanciare nuovamente il client, creare la connessione [invio] , inviare il messaggio [invio], chiudere la connessione [invio]
 - osservare in wireshark come cambiano le porte


 - lanciare più client contemporaneamente e in modo asincrono inviare i messaggi
 - osservare come si comporta il server  

 OSSERVAZIONE: il server non chiude mai la connessione con i client ....



