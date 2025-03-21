# Design Patterns

Una delle caratteristiche principali che permette di distinguere una figura senior da una junior, è la capacità di
risusare soluzioni per problem incontrati in passato. Ovviamente, l'ingrediente fondamentale per
acquisire questa capacità è sicuramente l'esperienza, e quindi il tempo trascorso sul campo. Tuttavia, nell'ambito
dell'Ingegneria del Software, con il tempo si è arrivati a redigere un vero e proprio protuario di soluzioni ricorrenti
denominati __Pattern__.

Il termine Pattern deriva principalmente dall'ambito architettonico, tuttavia, fortunatamente, con il tempo questo 
concetto è stato adattato anche all'ambito informatico. Se dovessimo dare una definizione formale al concetto di 
Pattern diremo che questo è *una soluzione efficace e comprovata per un problema ricorrente*.

I __Design Patterns__ sono quindi degli schemi di progettazione basati su Pattern, e vengono classificati sulla base di
due criteri: sulla base del loro scopo; oppure il raggio di azione. Comunemente, siamo abituati ad usare la 
classificazione attraverso il loro scopo, la quale prevede l'identificazione di tre categorie di Design Patterns:

* __Creazionali__, riguardanti il <u>processo di creazione</u> degli oggetti: _Abstract Factory_, _Builder_, _Factory_, 
  _Prototype_ e _Singleton_.
* __Strutturali__, riguardanti la <u>composizione di classi ed oggetti</u>: _Adapted_, _Bridge_, _Composite_, 
  _Decorator_, _Facade_, _Flyweight_ e _Proxy_.
* __Comportamentali__, definiscono le <u>modalità con cui le classi e gli oggetti interagiscono tra di loro</u>, e 
  sono  quindi in grado di distribuire le responsabilità: _Chain Of Responsibilities_, _Command_, _Iterator_, 
  _Mediator_, _Memento_, _Observer_, _State_, _Strategy_, _Template Method_ e _Visitor_.

Oltre a questa classificazione, esistono numerose altre categorie di Design Pattern, come, ad esempio di __Design 
Patterns Architetturali__. Tuttavia, siccome la cassificazione completa dei Design Pattern richiederebbe un corso 
ad-hoc, ci limiteremo ad analizzare i Design pattern "principali" e che sono descritti nel libro da cui ho tratto 
spunto per questa repository: [`Design Patterns: Elements of Reusable Object-Oriented Software`](https://www.amazon.it/Design-Patterns-Object-Oriented-Addison-Wesley-Professional-ebook/dp/B000SEIBB8)

## Le Ragioni per cui usare i Design Patterns

Prima di tuffarci direttamente nell'esaminare i Design Patterns e "divertirci" nel trovare un punto della nostra
applicazione in cui potrebbero essere applicati, sarebbe utile a chiunque lavori con questi concetti teorici
sviluppare un senso critico, e quindi domandarsi perché sarebbe necessario introdurre i Design Pattern all'interno
della nostra applicazione. Vediamo quindi due punti, a mio parere fondamentali, che ci permettono di descrivere in
breve l'utilità dell'applicazione dei Design Pattern:

* Utilizzare i Design Patterns <u>facilita la progettazione e l'ideazione della soluzione da adottare</u>, fornendo una
  soluzione comune a problemi di rappresentazione del dominio di interesse. Spesso infatti, nella codifica del dominio
  di interesse dell'applicazione, sono presenti concetti teorici che non hanno una diretta traduzione in termine di
  classi o interfaccie; ad esempio, potremmo citare una particolare composizione di un algoritmo che si applica in
  diverse configurazioni di un'entità; oppure, un oggetto mutevole, che viene costruito nel tempo anziché avere una
  struttura fissa stabilita un sede di progettazione.

* L'applicazione dei Design pattern <u>favorisce la progettazione per il cambiamento</u>. Quando lavoriamo in 
  applicazione enterprise che nel tempo possono subire molti cambiamenti e di diversa natura, è necessario evitare di 
  rendere il codice un agglomerato di entità ed algoritmi (creato uno __Spaghetti Code__); di conseguenza, esponendo 
  questo a seri problemi qualora si implementa una modifica anche in una classe periferica. Fortunatamente, i 
  Design Pattern si basano su concetti teorici dell'OOP come polimorfismo ed incapsulamento, il cui scopo è 
  definire i limiti di visibilità dei dettagli di un'entità software, evitando quindi che troppe informazioni 
  critiche vengano esposte ad altre entità, dunque, impedendo che un cambiamento nelle prime possa implicare un 
  cambiamento anche nelle seconde.

Un ultimo appunto personale che ho elaborato leggendo questo libro. Qualcuno potrebbe criticarne l'ultilità in 
quanto essere un libro datato per il nostro ambito, considerando quanto spesso cambia la tecnologia e quanto è 
importante rimanere aggiornati con le ultime versioni e/o novità teoriche. Tuttavia, questo libro rappresenta un 
evergreen, che va letto ed interpretato concentrandosi più al ragionamento che espongono gli autori dietro 
l'elaborazione teorica, rispetto al codice effettivo che viene prodotto. In ultima analisa, alla fine di questo 
libro che consiglio a qualsiasi professionista di leggere, comincerete a vedere codice OOP non più come un mero 
agglomerato di classi ed oggetti, ma tuttavia, come una base di conoscenza da modellare secondo i propri interessi, 
orientati spesso sia all'ottimizzazione, ma anche all'aumento della leggibilità e compresione dello stesso, che 
faciliterebbe di gran lunga il lavoro di altri nostri colleghi.

## 📖 Due Concetti Teorici Fondamentali

Capisco che il catalogo dei Design Pattern sia di una notevole dimensione, e che di conseguenza ricordare tutti i
Pattern potrebbe essere un lavoro tedioso. Tuttavia, i Design Pattern si basano su due concetti teorici comuni,
e che aiutano nella comprensione del funzionamento alla base di questi:

1. _Si deve sempre programmare riferendosi ad un'interfaccia, non all'implementazione_.
2. _Favorire la composizione di oggetti rispetto all'ereditarietà di classe_.

Prendiamo in considerazione questo primo diagramma UML:

<img src="./Assets/Images/Introduzione-1.png" alt="Introduzione 1" style="display: block; margin: 0 auto;">

Genericamente potremmo pensare che la classe `Manager`, possa essere codificata in questo modo, usando Java:

```java
public class Manager extends Employee {
    private List<Programmer> responsibleFor;
    
    public Manager(String taxCode, String firstName, String lastName) {
        super(taxCode, firstName, lastName);
        this.responsibleFor = new ArrayList<>();
    }
    
    public void addProgrammer(Programmer programmer) {
        this.responsibleFor.add(programmer);
    }
    
    public void removeProgrammer(Programmer programmer) {
        this.responsibleFor.remove(programmer);
    }
}
```

Sebbene questa implementazione sia corretta, presenta un problema fondamentale che è di natura concettuale più che 
operativa. In questo specifico esempio, un `Manager` può essere responsabile solamente di oggetti di tipo 
`Programmer`, probabilmente perché in fase di progettazione, è stato deciso che questo era un vincolo di 
responsabilità dell'oggetto `Manager`. Tuttavia, se le specifiche dovessero cambiare, tale che un `Manager` può 
essere responsabile sia di un `Programmer` che di un `Engineer`, questo comporterebbe una revisione di questo codice.
Il problema che si presenta, quindi, poteva essere risolto a priori implementando la relazione tra `responsibleFor`, 
in modo tale che non si riferisca direttamente ad un'implementazione specifica (in questo caso la classe 
`Programmer`) ma alla sua astrazione, rappresentata dalla classe `Employee`.

In futuro incontreremo spesso i concetti di astrazione ed implementazione, per il momento basta dire che: 
l'__astrazione__ è la rappresentazione concettuale di un'entità che ne determina i vincoli, ma la quale non può 
essere utilizzata concretamente; mentre, l'__implementazione__ è l'entità derivata da un'astrazione, che ne soddisfa 
i vincoli e può essere utilizzata a livello pratico.

Sebbene l'ereditarietà sia uno dei principi fondamentali dell'OOP, l'uso di questa può comunque portare degli svantaggi
all'interno del nostro codice. Consideriamo l'esempio più banale, una classe `Person` e la sotto classe `Employee`,
con Person che contiene al suo interno il metodo `work` automaticamente ereditato da Employee. Questo meccanismo di
ereditarietà fa in modo che Employee acceda direttamente all'implementazione del metodo work, violando il Principio
dell'Incapsulamento, ed implementando un forte legame tra le due classi, tale che, una modifica all'interno del metodo
work della classe Person, impatterebbe direttamente sulla classe Employee. 

In gergo, si dice che è stata realizzata una relazione del tipo __is-a__. Se, invece, avessimo usato la
composizione, e quindi trasformando la relazione da is-a a __has-a__, saremo stati in grado di disacoppiare le due
classi, permettendo alla classe Employee di non accedere all'implementazione di Person, e riducendo l'impatto delle
modifiche sulla classe padre. 

### ⁉️ N.B.
All'interno di questa repository, come si sarà capito leggendo l'introduzione, si farà molto uso dei diagrammi UML, 
in quanto sono un elemento fondamentale oltre al codice, per capire l'organizzazione e la logica dietro i Design 
Patterns. Inoltre, oltre che i diagrammi UML, ho scelto di usare il linguaggio Java, senza però alcun motivo 
specifico, bisogna notare, infatti, che i Design Pattern possono essere implementati usando un qualsiasi linguaggio 
di programmazione ad oggetti.
