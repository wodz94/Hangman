# Trinat_Coulomb_Hangman
### Hangman Game for a study project
Studyproject created by Anderrüti Julien, Gasser Simon, Krucker Benjamin and Richard Wadsworth

### Einleitung
Im Rahmen einer Projektarbeit möchten wir hiermit eine Spielsoftware vorstellen, welche wir anhand von Software-Engeneering Methoden im Team realisiert haben. Ziel des Projekts war es Methoden wie Scrum oder Agiles praktisch anzuwenden und somit alle wichtige Phase beim strukturierten Erstellen von Software zu durchlaufen.
Zu diesem Zweck erstellten wir ein Spiel allgemein bekannt als Hangman welches in unserer Fassung von zwei oder einem Spieler gespielt werden kann. Ziel des Spiels ist es ein vorgegebenes Wort (Suchbegriff), mit einer beliebigen Anzahl an Buchstaben zu erraten, indem man auf verschiedene Buchstaben tippt. Wenn man das Wort erraten hat ohne eine bestimmte Anzahl falsche Tipps zu überschreiten hat man das Spiel gewonnen.

### Ziele
Wir wollen eine Software gestallten welche dem oder den Benutzern die Möglichkeit gibt Hang man zu Spielen.
Im "One Player"-Modus soll vom Spieler durch Knopfdruck ein Suchbegriff generiert werden. Der Suchbegriff stammt aus einer Datenbank mit einer bestimmten Anzahl an Worten. 

-2player-

Dem Spieler werden verschiedene Anzeigen angezeigt. Zum einen der Spielfortschritt zum anderen die Eingabemšglichkeiten. Der Spielfortschritt wird durch zwei Grafiken erkennbar gemacht. Zum einen wird die Anzahl und die gefunden Buchstaben des Suchbegriffs angezeigt. Zum anderen wird bei jedem eingegebenen Buchstaben, welcher nicht Bestanteil des Suchbegriffs ist, Strich für Strich ein Strichmännchen vervollständigt, welches an einem Galgen hängt. Die Eingabemöglichkeit besteht aus einer virtuellen Tastatur.

### Randbedingungen
Das Programm wird in der Programmiersprache Java erstellt.
Das Projektteam besteht aus vier Personen.
Zur Programmierung wird Eclipse verwendet.
Der Build wird durch Maven automatisiert.

## Build Anleitung

Um unsere Java Application zu builden, benutzen wir Maven und Eclipse als Umgebungen. Dank Maven kann man in den folgenden 3 Schritte unser Programm kompilieren und als ausführbare .jar Datei im **target/** Ordner finden.

### 1) Maven Clean

Um eine saubere Installationspfad zu erhalten, benutzt man zuerst den "maven clean" Befehl.

1) Dafür öffnet man sein Projekt in Eclipse
2) Einen Rechtsklick auf sein Projekt 
3) Unter dem Rubrik Run As findet man die Maven build Befehle (siehe Bild unten)
4) Hier wählt man als erstet Maven Clean

<img src="https://github.com/wodz94/Hangman/blob/master/coulomb.hangman/maven1.png?raw=true" alt="MavenPic1" width="500" height="433">


### 2) Maven Update Project
    
Bei Maven tritt es innerhalb der Eclipse Entwicklungsumgebung oft auf, dass ein Refresh nötig ist, um merkwürdige Fehler zu vermeiden.

Im selben Kontextmenü findet man unter dem Rubrik "Maven" den Update Project Befehl.

<img src="https://github.com/wodz94/Hangman/blob/master/coulomb.hangman/maven%20update.png?raw=true" alt="MavenPic2" width="500" height="473">



### 3) Maven Install

Nun kann man unter dem selben "Run As" Menu wie im ersten Schritt den Befehl "Maven Install" ausführen.

Bei erfolgreichem Build wird das Artefakt des Buildes im Target Ordner erscheinen als ".jar" Datei.

<img src="https://github.com/wodz94/Hangman/blob/master/coulomb.hangman/done.png?raw=true" alt="MavenPic2" width="500" height="165">


## Bedienungsanleitung




## Userstories mit Akzeptanzkriterien
inkl Storypoints

## TestCases

| Test Scenario ID      | TS001                                                                        | Test Case ID   | TC001 |
|-----------------------|------------------------------------------------------------------------------|----------------|-------|
| Test Case Description | Check if the Alphabet Class delivers all its expected values                 | Test Priority  | High  |
| Pre-Requisite         | The Class Alphabet with methods to deliver values depending on entered value | Post-Requisite | None   |

| Nr | Action                           | Input | Expected Output | Actual Output | IDE            | Test Result |
|----|----------------------------------|-------|-----------------|---------------|----------------|-------------|
| 1  | Return letter based on number    | 3     | 'D'             | 'D'           | Eclipse EE IDE | Passed      |
| 2  | Return number based on letter    | 'a'   | 0               | 0             | Eclipse EE IDE | Passed      |
| 3  | Caps-insensitivity of Test Nr 2  | 'A'   | 0               | 0             | Eclipse EE IDE | Passed      |

### User Stories

| US | Name                 |                                                                                                                                                                                                                                                                                                                                                | SP | Prio |
|---:|----------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:--:|:----:|
| 1  | Virtuelle Tastatur   |	Als Spieler 2 moechte ich virtuelle tasten betaetigen können um dem Spiel einen Buchstaben vor zu schlagen".   <br><b> Akzeptanzkriterien: </b><br> - Teste, ob im Spiel eine virtuelle Tastatur angezeigt wird. <br> - Teste, ob das Programm eine bzw. die richtige Eingabe entgegennimmt.																						| 5  | 2    |
| 2  | Physische Tastatur   |	Als Spieler 2 moechte ich über die physischen Tasten, Eingaben machen koennen um  dem Spiel einen Buchstaben vor zu schlagen. <br><b> Akzeptanzkriterien: <br></b> - Teste, ob mit der Tastatur, Eingaben gemacht werden koennen die das Programm erkennt.																														| 3  | 1    |
| 3  | Spielinitialisierung |	Als Spieler 1 moechte ich über die physische oder vituelle Tastatur ein Wort eingeben koennen um  das Spiel zu beginnen. <br><b> Akezeptanzkriterien: <br></b> - Teste, ob sich über die physische Tastatur ein Wort eingeben laesst um das Spiel zu initialisieren.<br> - Teste, ob sich ueber die virtuelle Tastatur ein Wort eingeben laesst um das Spiel zu initialisieren.	| 3  | 1    |
| 4  | Tastenverriegelung   |	Als Spieler 2 moechte ich das Tasten die bereits gedrueckt wurden angezeigt werden  um  Falscheingaben zu vermeiden. <br><b> Akzeptanzkriterien: <br></b> - Teste, ob bereits ausgewaehlte Tasten "Buchstaben" disabled werden. <br> - Teste, ob das Programm von bereits ausgewaehlten Tasten keine eingabe mehr entgegennimmt.													| 3  | 2    |   
| 5  | Hangmananzeige       |	Als Spieler 2 moechte ich sehen wie nach jeder Falscheingabe ein Element des Hangmans hinzu kommt um zu sehen wie viele Falscheingaben noch moeglich sind. <br> <b> Akzeptanzkriterien </b> <br> - Teste, ob nach jeder Falscheingabe ein Element des Hangmans hinzukommt. <br> - Teste, ob das Spiel beendet wird, wenn der Hangman fertig aufgebaut ist.						| 8  | 1 	|
| 6  | Wortanzeige          |	Als Spieler 2 moechte ich sehen wie nach jeder richtigen Eingabe der Buchstabe am entsprechenden Platz im Wort erscheint, um zu sehen aus welchen Buchstaben das Wort bereits besteht. <br><b> Akzeptanzkriterien: <br></b> - Teste ob, nach jeder richtigen Eingabe ein Element des Wortes hinzukommt. <br> - Teste ob das Spiel beendet wird, wenn das Wort komplett ist.		| 8  | 1 	|
| 7  | Gewonnen / Verloren  |	Als Spieler 2 moechte ich am Ende des Spiels darauf hingewiesen werden ob ich das Spiel gewonnen oder verloren habe, um zu wissen wann das Spiel beendet ist. <br> <b> Akzeptanzkriterien </b> <br> - Teste ob, am Ende des Spiels eine Anzeige erscheint welche besagt ob das Spiel gewonnen oder verloren ist.																| 2  | 1    |
| 8  | New Game				|	Als Benutzer moechte ich ein New Game-Button klicken koennen, um eine neue Runde zu spielen ohne das Programm neu starten zu müssen. <br> <b> Akzeptanzkriterien </b> <br> - Teste ob, man zu jeder Zeit des Spiels den New Game Button drücken kann und ein neues Spiel initialisiert wird.																					| 2  | 3    |
| 9  | Maven		 		|	Als Benutzer moechte ich von Git-Hub eine JAR-Datei herunterladen koennen um das Spiel auf meinem Computer zu Spielen. <br> <b> Akzeptanzkriterien </b> <br> - Teste ob, auf Git-Hub eine JAR-Datei vorhanden ist. <br> - Teste ob, auf Git-Hub eine Dokumentation vorhanden ist.																								| 8  | 3	|

### Priorisierung
      
| US | Name                 |  Funktional	| Dysfunktional |  Merkmal 	| Priorität |
|---:|----------------------|:-------------:|:-------------:|:---------:|:---------:|
| 1  | Virtuelle Tastatur 	| 1				| 5				| L			| 2			|		
| 2  | Physische Tastatur	| 2				| 5				| M			| 1			|		
| 3  | Spielinitialisierung	| 2				| 5				| M			| 1			|
| 4  | Tastenverriegelung	| 1				| 5				| L			| 2			|
| 5  | Hangmananzeige		| 2				| 5				| M			| 1			|
| 6  | Wortanzeige			| 2				| 5				| M			| 1			|
| 7  | Gewonnen / Verloren	| 1				| 5				| M			| 1			|
| 8  | New Game				| 1				| 4				| E			| 3			|
| 9  | Maven           		| 1				| 4				| E			| 3			|

#### Legende

-	M -> Basis - Merkmal
-	L -> Leistungs - Merkmal
-	E -> Begeisterungs - Merkmal


### Release Plan

| Sprint 1:  07.12.2018-15.12.2018  |SP |Sprint 2:  15.12.2018-27.12.2018  |SP |
|-----------|:-----:|--------|:-:|
|User Story 2	|3	 	|User Story 4	|3	|
|User Story 3	|3		|User Story 8	|2	|
|User Story 5	|8		|User story 9	|8	|
|User Story 6	|8		|				|	|
|User Story 7	|2		|				|	|
|User Story 1	|5		|				|	|
|Total: 		|29		|Total:			|13	|


### Velocity

-	Etwiklungsteam: 4 Personen
-	Arbeitspensum pro Entwickler : 40 min Pro Tag
-	Iterationslänge: 8 Tage
-	Iteration max Arbeitszeit: 21h 20 min 

| US 2    |Physische Tastatur													| Time  |
|:-------:|---------------------------------------------------------------------|:-----:|
| Task 1  |Im TastaturController Key Events erstellen							|1 h	|
| Task 2  |MainApp erstellen mit rootPane										|3 h	|
|		  |																		|		|

| US 3    |Spielinitialisierung													| Time  |
|:-------:|---------------------------------------------------------------------|:-----:|

| Task 1  |Textfeld erstellen & Eingabe Entgegennahme erstellen					|2 h	|
| Task 2  |Eingabeprüfung														|1 h	|
|		  |																		|		|
| US 5    |Hangmananzeige														| Time  |
|:-------:|---------------------------------------------------------------------|:-----:|

| Task 1  |Grafikelemente malen													|1 h	|
| Task 2  |Controllerklasse erstellen											|2 h	|
| Task 3  |Zuweisung und Darstellungskontrolle der Elemente						|2 h	|
|		  |																		|		|
| US 6    |Wortanzeige															| Time  |
|:-------:|---------------------------------------------------------------------|:-----:|

| Task 1  |Label erstellen & Einbettung											|1 h	|
| Task 2  |Programmierung Platzhalterverwaltung									|2 h	|
| Task 3  |Erstellung der Aktualisierungsmethode								|1 h	|
|		  |																		|		|

| US 7    |Gewonnen / Verloren													| Time  |
|:-------:|---------------------------------------------------------------------|:-----:|
| Task 1  |Label erstellen & Einbettung											|1 h	|
| Task 2  |Programmierung der Gewinnerlogik										|1 h	|


|	Auswertung			|		|
|----------------------:|-------|
| Total Stunden:  		|  16	|
| Total Story Points: 	|  24	|
| SP/h: 				|  1.5	|
| SP/ Iteration: 		|  31.5	|




-	Business value 
inkl Ausbaustufen

## Dokumentation Sprint


## Klassendiagramm
<img src="https://github.com/wodz94/Hangman/blob/Julien/coulomb.hangman/CD.png?raw=true" alt="MainApp_showButton" width="657" height="657">


## Beschreibung von Code-Snippeds
### Methode showButton() aus der MainApp
<img src="https://github.com/wodz94/Hangman/blob/master/coulomb.hangman/MainApp_showButton.PNG?raw=true" alt="MainApp_showButton" width="657" height="519">
In dieser Methode werden die Keys generiert, welche anschliessend in das GritPane gesetzt werden, dabei werden mithilfe einiger
Laufvariablen die Positionen in der Kolonne und Reihe, sowie der Buchstaben 
festgelegt, welcher auf dem Knopf angezeigt werden soll. 
Die Interger Variable z ist dafür da, dass mithife der for-Schlaufen-Laufvariablen i und j eine Zahl generiert wird die eine fortlaufende
Nummer ergibt. (Dies könnte man in einem Nachgang um einiges Vereinfachern).
Die Interger Variable l startet bei 0 und ist da für die Erstellung der Keys in der ArrayList und für die Auswahl der Buchstaben.
Die Variable a Springt mithilfe einer If - Else Funktion zwischen 1 und 2 bei einem Wechsel einer Reihe. 
Dies um eine Versetzung der Buchstaben zwischen den Reihen zu erhalten. Dies sieht man im folgenden Bild.
Nun wird mithilfe der Variablen in der button-ArrayList an der Position l (beginnt bei 0 und wird anschliessend immer um Eins erhöt),
einen neuen Key durch einen Konstruktor, welcher einen Char verlangt (der Char wird durch eine Methode im Util Alphabet durch eine Zahl übergeben), erstellt.
Anschliessend wird dieser im Grid an der Position i+a,j eingefügt. 
<img src="https://github.com/wodz94/Hangman/blob/master/coulomb.hangman/Keyboard.PNG?raw=true" alt="Keyboard" width="1429" height="330">


### Methode setKeyDisable() aus dem Objekt Key:
<img src="https://github.com/wodz94/Hangman/blob/master/coulomb.hangman/Key_setKeyDisable.PNG?raw=true" alt="Key_setKeyDisable" width="833" height="146">
In der Methode setKeyDisable vom Objekt Key, welches aus dem JavaFX Objekt Button vererbt entsteht,
ist eine Ergenzung zur eigentlichen setDisable(true) Methode aus dem Button Objekt. 
Diese ist zuständig für die Übergabe der Buchstaben zur Prüfung der Übereinstimmung mit dem gesuchten Wort,
um diesen Buchstaben weitergeben zu dürfen wird zuerst geprüft:
- ob es bereits ein Lösungswort eingegeben worden ist (länge des Wortes wird ermittelt mit dem Zusatz .laenth und bei der Initialisierung des Wortes hat es eine länge von 0),
- ob dieser Buchstabe bereits gedrückt worden ist (Button/Key wird abgefragt ob er deaktiviert ist, die Abfrage folgt über die Methode in Button isDisable()).
Falls einer der Fälle eintrifft wird die Methode beendet ohne etwas weiter zu geben, damit keine ungewollten Eingaben entstehen können.
Falls beides nicht der Fall ist wird der Button Deaktiviert, dass dieser in danach nicht mehr gedrückt werden kann. 
Weiter wird eine Methode aufgeruf, welche den Buchstaben prüft.
Die Methode setKeyDisable kann von 2 Aktionen ausgelöst werden, einmal wird ein onAktion Event bei jedem Key erstellt und die Methode aufruft, wenn der Key/Button gedrückt wird.
<img src="https://github.com/wodz94/Hangman/blob/master/coulomb.hangman/KeyKonstruktor_Aufruf_setKeyDisable.PNG?raw=true" alt="KeyKonstruktor_Aufruf_setKeyDisable" width="650" height="360">
Zum Anderen wird sie Aufgerufen im KeyboardController mittels EventHandeler, beim Drücken einer Tastaturtaste, die Aufgrund einer If-Bedingungen Aufgerufen wird, wenn ein Buchstabe gedrückt wird.
<img src="https://github.com/wodz94/Hangman/blob/master/coulomb.hangman/KeyboardController_keyPressed_AktionHandler.PNG?raw=true" alt="KeyboardController_keyPressed_AktionHandler" width="972" height="183">

