# Chain of Responsibilities
Abbiamo appena creato un'applicazione che permette di eseguire degli ordini contenenti una serie di prodotti. 
Ciascun ordine assume uno stato specifico che può essere uno dei seguenti valori: _In Elaborazione_; _In 
Lavorazione_; _Completato_; _Consegnato_ o _Interrotto_. Ogni volta che viene aggiornato lo stato di un ordine è 
necessario eseguire alcune operazioni, come, ad esempio, valutare il quantitativo dei prodotti, oppure inviare una 
notifica al cliente che ha eseguito l'ordine per informarlo del cambiamento di stato. La classica implementazione 
che ci verrebbe in mente di usare potrebbe essere la seguente:

```java
public void manage(Order order) {
    if (order.getStatus().equals(OrderStatus.ELABORATING)) {
        order.setElaboratingDate(LocalDate.now());
        notification.sendNotification(order.getClient(), "Order is elaborating ...");
        return;
    }

    if (order.getStatus().equals(OrderStatus.WORKING)) {
        order.setWorkingDate(LocalDate.now());
        notification.sendNotification(order.getClient(), "Order is working ...");
        return;
    }

    if (order.getStatus().equals(OrderStatus.COMPLETED)) {
        order.setCompletedDate(LocalDate.now());
        notification.sendNotification(order.getClient(), "Order has been completed!");
        return;
    }

    if (order.getStatus().equals(OrderStatus.DELIVERED)) {
        order.setDeliveryDate(LocalDate.now());
        order.setDelivered(true);
        return;
    }

    order.setInterruptionDate(LocalDate.now());
    notification.sendNotification(order.getClient(), "Order has been canceled ...");
    return;
}
```

sicuramente per un neofita questa sarebbe una soluzione completamente accettabile, ed infatti lo è. Tuttavia, 
implementare la nostra catena di condizioni in questa maniera ha diversi svantaggi: prima di tutto la catena è 
"statica" e non è possibile cambiarne la composizione dinamicamente durante l'esecuzione; inoltre, inoltre, la 
catena non è facilmente propensa al cambiamento, e con quest'ultima affermazione intendo dire che nel caso in cui si 
voglia rimuovere uno stato che deve essere valutato, se non si vuole perdere per sempre il codice, deve essere 
necessario incapsularlo all'interno di un metodo o addirittura commentarlo.

Basandoci su queste considerazioni e sul nostro scenario, il Design Pattern Chain of Responsibilities si rivolge a 
risolvere questo genere di problematiche, incapsulando i vari rami della computazione all'interno di classi 
specifiche che implementino necessariamente la stessa interfaccia, affinchè sia possibile sfruttare il Polimorfismo 
per comporre dinamicamente la nostra catena di condizioni. L'astrazione che necessariamente i vari anelli della 
nostra catena deve implementare, deve contenere anche il riferimento all'anello successivo, in modo tale che, se 
l'anello corrente non è in grado di evadere la richiesta passata in input, passi questa al prossimo anello, finchè 
(si spera) che qualcuno nella catena resca ad evaderla.

In termini grafici, implementando il nostro scenario usando questo Design Pattern, otterremo questa una figura simile:

<div style="display: flex; justify-content: center; width: 100vw; padding: 1em 2em">
    <img src="../../Assets/Images/Comportamentali/Chain of Responsibilities.png" alt="Chain of Responsibilities 
Design Pattern" style="width: 70%"/>
</div>

## Partecipanti
Come descritto dalla figura precedente, nel Design Pattern lavorano i seguenti componenti software:

* La classe astratta `OrderHandler` è chiamata anche __Handler__ e definisce l'astrazione comune a tutte le 
  sotto-classi che implementeranno invece la logica condizionale che vogliamo eseguire nei vari casi. Il fatto che 
  l'Handler contenga al suo interno il riferimento al successore della catena è condizionale, tuttavia, in 
  quest'implementazione ho preferito inserirlo al suo interno.
* Le varie classi `OrderElaboratingHandler`, `OrderWorkingHandler`, `OrderCompletedHandler` ... rappresentano invece 
  i __Concrete Handler__, ossia, le implementazioni dell'Handler al cui interno è codificata la logica condizionale 
  per i vari stati in cui può trovarsi una Request. 
* La __Request__, invece, è l'astrazione che viene passata di volta in volta a ciascun anello della catena, e che 
  nel nostro caso è codificata nella classe `Order`.

Come accennato prima, ho preferito codificare il riferimento all'Handler successivo della catena, direttamente 
all'interno della classe astratta `OrderHandler`. Non esiste una regola assoluta che descrive come devono essere 
implementati i riferimenti di una catena di Handler, tuttavia, un'alternativa completamente plausibile è quella di 
inserire i riferimenti direttamente all'interno della clase Concrete Handler. Un'altra alternativa consisterebbe 
nell'usare il Design Pattern Composite in congiunzione con il Chain of Responsibilities, in modo tale da passare il 
riferimento all'Handler successivo direttamente al costruttore di un Concrete Handler, imponendo però che deve 
essere implementato anche un nodo foglia all'interno della nostra struttura, che indichi la terminazione della catena.

## Conseguenze

Applicare questo Design Pattern ha fondamentalmente tre conseguenze sul nostro codice:

1. <u>Disaccoppiamento degli oggetti</u>, in quanto un Handler non ha conoscenza di chi sia il suo successore e di 
   come verrà gestita eventualmente la richiesta.
2. <u>Assegnamento dinamico delle responsabilità</u>, in quanto possiamo facilmente cambiare il flusso di 
   elaborazione della catena cambiano il riferimento all'handler successivo.
3. Tuttavia, <u>manca la garanzia che la richiesta sia effettivamente gestita</u> attraverso tutto il flusso di 
   controllo. Potrebbe capitare, infatti, che esista un caso non mappato e quindi nessun Handler verrebbe attivato.