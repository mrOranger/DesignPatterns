# Proxy 
Il Design Pattern Proxy, o chiamato alternativamente _Surrogate_, consiste nell'implementare una "copia" di 
un'entità che possa essere usata al posto della stessa su richiesta del Client. Questa è la definizione formale che 
viene assegnato a questo Design Pattern, tuttavia, la definizione secondo me è inutile se non accompagnato ad un 
esempio reale in cui questo Design Pattern viene usato.

Nello sviluppo di applicazioni web, usando un qualsiasi  framework backend come Laravel o Spring, ci si imbatte 
spesso nel concetto di __Lazy Loading__. In altri termini, il Lazy Loading è un meccanismo di caricamento di altre 
entità, legate ad un'altra entità principale, che avviene solamente nel caso in cui siano effettivamente necessarie 
le entità figlie. In contesti operativi, questo meccanismo permette di efficentare di molto delle query molto 
complesse, che altrimenti richiederebbero in caricamento di una serie di relazioni che potrebbero non essere 
effettivamente necessarie.

Nell'esempio appena descritto, infatti, non stiamo effettivamente interagento con l'entità finale di cui vogliamo 
effettivamente leggerne i dati, ma stiamo usando un suo surrogato, ossia il Proxy, che riceve le nostre richieste e 
sulla base di una propria logica interna, comunica le effettive operazioni che l'entità dovrebbe eseguire. 

Consideriamo allora un esempio più dettagliato. Supponiamo che la nostra applicazione faccia uso di una classe 
__Service__ che permetta di leggere una lista di Clienti registrati nel nostro database. Siccome l'effettiva lettura 
della dei nostri clienti all'interno del Database è un operazioni relativamente complessa da realizzare, vogliamo 
implementare una Cache che ha un tempo di accesso alle risorse nettamente inferiore rispetta alla lettura grezza dei 
dati dal nostro Database. Tuttavia, vogliamo però che questo processo sia invisibile al Client, quindi, dobbiamo 
rendere sia il servizio di Cache che quello per leggere i dati dal Database, figli di una stessa interfaccia e 
quindi implementino le stesse operazioni seppure con una logica diversa. Il servizio di caching deve avere, inoltre, 
un riferimento all'entità che regola l'accesso alle risorse dal Database, in modo tale da trasferirne le richieste 
qualora si anecessario. 

Elaborando quando descritto precedentemente, il risultato finale è questo diagramma UML:

<p style="display: flex; justify-content: center">
    <img src="../../Assets/Images/Strutturali/Customer.png" alt="Customer Design Pattern" style="width:70%">
</p>

Notiamo come, sia il servizio effettivo che accede al Database, ossia la classe `CustomerService` che la cache 
`CustomerCache`, affinché implementino correttamente il Design Pattern, devono essere tra loro intercambiabili e 
quindi avere la stessa implementazione definita all'interno dell'interfaccia `CustomerRepository`. Inoltre, non è 
possibile istanziare solamente una classe `CustomerCache`, senza che questa abbia al suo interno un riferimento 
esplicito ad una classe concreta del tipo `CustomerService`, tuttavia, è possibile creare delle Cache o altri 
servizi che siano tra loro annidati e quindi che notifichiano le operazioni da eseguire fino al raggiungimento 
dell'implementazione concreta del servizio.

## Partecipanti
Le classi rappresentate nell'esempio precedente, hanno un nome specifico all'interno di questo Design Pattern:

* Il __Proxy__ è l'effettiva classe `CustomerCache` che può agisce facendo le veci della classe concreta al cui 
  interno sono contenuti i dati di interesse, e che si occupa di delegare le operazioni su richiesta.
* La classe concreta `CustomerService` è chiamata anche __Real Subject__, ossia il soggetto concreto di cui il Proxy 
  ne fa le veci.
* Invece il __Subject__ è rappresentato dall'interfaccia `CustomerRepository`, ed è il soggetto di cui se ne vuole 
  separare la logica di accesso utilizzando l'entità intermedia Proxy.

## Conseguenze
Le conseguenze che l'applicazione del Proxy ha sul nostro codice, dipendono in gran parte dall'uso per cui questo è 
stato configurato, e di cui possiamo definire in tre aree principali:

* Uso di un <u>Proxy Remoto</u> che nasconde quindi l'effettivo luogo in cui l'oggetto su cui è stato definito il 
  proxy è memorizzato.
* Utilizzare un <u>Proxy virtuale</u> in maniera analoga a quanto accade con il processo di Lazy Loading, permette 
  di regolare l'uso delle risorse solamente a quando queste siano effettivamente richieste all'interno della nostra 
  applicazione.
* Infine, usando un <u>Proxy di protezione</u> permette di regolare l'accesso ad una risorsa attraverso l'uso di una 
  serie di Policies.

Dunque, in tutti i casi, il Proxy aggiunge il layer aggiuntivo di accesso alle informazioni, permettendone un 
comportamento più flessibile, tuttavia, bisogna considerare gli svantaggi e vantaggio dell'applicazione di questo 
livello di astrazione aggiuntivo e le operazioni extra che dovranno essere implementate ed eseguite.