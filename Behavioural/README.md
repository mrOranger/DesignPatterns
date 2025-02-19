# Design Pattern Comportamentali
Siamo giunti all'ultimo ma più compilcato capitolo di questo catalo sui Design Pattern. Diversamente dalle 
precedenti categorie, infatti, i Design Pattern __Comportamentali__ concentrano la loro attenzione su come 
implementare comportamenti dinamici all'interno di un'applicazione, azichè limitarsi alle modalità di creazione e di 
composizione delle entità.

Tuttavia, cosa intendiamo con _comportamenti dinamici_? In realtà, è difficile poterne dare una definizione rigorosa,
tuttavia, possiamo identificare questi come tutti quei comportamenti esposti dalle entità della nostra applicazione, 
che possono cambiare in tempo di esecuzione. In altri termini, tramite questi possiamo esprimere la definizione di 
un algoritmo in termini di classi ed oggetti.

All'interno di questa categoria rientrano i seguenti Design Pattern:

* __Chain of Responsibility__. Definisce letteralmente una catena di stati da attraversare, al cui interno è 
  codificato un comportamento specifico. Nel momento in cui un oggetto viene fatto passare attraverso la catena, si 
  valuta se l'anello corrente è il candidato ideale nello stato corrente, affinchè possa esaudre la richiesta. Nel 
  caso in cui la richiesta non può essere evasa nell'anello corrente viene passato a quello successivo.
* __Command__. Diversamente dal Chain of Responsibility, in cui il focus era sulla catena da realizzare. Nel Design 
  Pattern Command, il focus si sposta sulla richiesta da dover evadere, in questo modo, è la richiesta stessa che 
  diventa l'oggetto da passare al comando successivo, e della quale può essere mantenuto uno storico se è necessario.
* __Interpreter__ implementa una grammatica da verificare come una gerarchia di classi, implementando i vari step 
  all'interno della classi della gerarchia.
* __Iterator__ astrae il processo di attraversamento di una collezione di oggetti. In questo modo, viene definita 
  un'unica astrazione applicabile a qualsiasi collezione, indipendentemente dall'approccio con cui questa è stata 
  realizzata.
* __Mediator__. Spesso, l'uso di questi Design Pattern implica la creazioni di reti di dipendenze, quindi che 
  ciascun oggetto debba mantenere un riferimento ad una o diverse destinazioni. Mediator, evita che si crei questa 
  reden di dipendenze ponendosi tra un'oggetto sorgente e la relativa destinazione.
* __Memento__.
* __Observer__ definisce come possono comunicare tra loro diversi oggetti, registrati in istanti diversi all'interno 
  della nostra applicazione.
* __State__ incapsula lo stato di un oggetto, e di conseguenza come le operazioni che su di questo possono eseguite, 
  cambino dinamicamente al cambiare dello stato.
* __Strategy__ semplifica di come cambiare un algoritmo applicato ad un oggetto, incapsulando l'algoritmo stesso 
  all'interno di un oggetto.
* __Template Method__ incapsula un algoritmo all'interno di oggett che ne definiscono i vari passi, in modo tale da 
  poter definire passo per passo se è necessario eseguire un metodo astratto o un'operazione primitiva.
* __Visitor__, infine, incapsula una funzionalità specifica che può essere distribuita in vari classi, senza diverla 
  implementare nuovamente.