# Singleton
In scenari comuni è importante garantiere che per una singola classe sia possibile avere un'unica istanza attiva di 
questa. Ad esempio, se la nostra applicazione è in grado di usare un database, esisterà un unico punto di accesso 
dalla prima verso il secondo; oppure, all'interno di un computer, deve essere presente solamente un file system. 
Come possiamo garantire allora che di una classe sia possibile avere una sola istanza? La risposta consiste nello 
spostare la responsabilità dell'istanziazione all'interno della classe stessa, in modo tale che nel nostro caso 
sepcifico non sia più possibile utilizzare l'operatore di istanziazione `new`.

Il Design Pattern Singleton, consiste solamente nel modificare la struttura interna della classe che vogliamo 
rendere univocamente istanziabile. Per prima cosa, è necessario dichiarare il costrutture di questa con visibilità 
`private` in modo tale che sia impossibile istanziarla; dunque, è necessario che la classe contenga un riferimento a 
se stessa, attraverso una variabile d'istanza; infine, deve essere dichiarato un unico punto di accesso alla 
variabile di istanza dell'applicazione stessa, dichiarato come metodo di classe.

## Conseguenze
L'implementazione di questo Design Pattern offre molteplici benefici:

* <u>Accesso controllato ad un'unica istanza.</u> In questa maniera, la classe manterrà il controllo diretto sulle 
  modalità di creazione della classe.
* <u>Riduzione dello spazion dei nomi.</u> Definendo la variabile di istanza della classe all'interno della classe 
  stessa, non è più necessario definire una variabile con visibilità globale che si riferisca all'instanza stessa.
* <u>Gestione del numero di variabili di istanze.</u> Limitando la possibilità di istanziare la classe, si evita 
  allo stesso tempo che vengano create variabili di istanze inutili che successivamente dovranno essere eliminate 
  dal Garbage Collector.