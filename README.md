# Setup
Scaricare [apache maven 3.2.x](https://maven.apache.org/download.cgi?Preferred=ftp://mirror.reverse.net/pub/apache/) e scompattarlo in una cartella, (_meglio usare percorsi semplici_).

Rinominare la cartella `apache-maven-3.2.5` in `maven`, e aggiungerla al path dell'utente o opzionalmente dalla riga di comando aggiungerlo al path di sessione.

	path=%path%;e:\dev\maven\bin


Scaricare e installare una shell git ad esempio la shell di [Github](https://windows.github.com/).

Aprire la shell di git e spostarsi nella directory del proprio workspace eclipse , ad esempio: `cd E:\dev\luna\workspaces\lunaws\`.

Clonare il progetto nella dirctory

	git clone https://github.com/minus71/stringalore.git

Aprire `cmd` e aggiungere il path se non compreso nei path utente o di sistema, spostarsi nella directory del progetto e lanciare la creazione del progetto maven per eclipse.

	path=%path%;e:\dev\maven\bin
	cd stringalore
	mvn eclipse:eclipse



A questo punto potete aprire eclipse e importare il progetto maven con :
_**import...>maven>existing maven project**_ scegliendo come folder la cartella del workspace.






