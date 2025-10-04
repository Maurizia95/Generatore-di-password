import java.util.Scanner; //legge input da tastiera

public class Main{
    public static void main(String[] args) { //metodo principale che avvia l'esecuzione del programma
       Scanner sc = new Scanner(System.in); //creo oggetto scanner per leggere i dati dell'utente
       String lettera;
       String numero;
       String simboliConsentiti = "!#$%&'()*+,-.";
       String carattere; //variabile che conterrà ogni singolo carattere inserito
       String pass; 
       //variabile che conterrà l'intera password

do {
    System.out.println("Inserisci 9 lettere: ");
    lettera = sc.nextLine();

    if (lettera.length() != 9) {
        System.out.println("Errore: devi inserire 9 caratteri!");
    } else if (!lettera.matches("a-zA-Z+")) { //matches restituisce un booleano
        System.out.println("Errore: puoi inserire solo lettere alfabetiche (niente numeri o simboli)!");
    }

} while(!lettera.matches("[a-zA-Z]{9}")); //finche true, il ciclo si ripeterà


do {
    System.out.println("Inserisci 2 numeri: ");
    numero = sc.nextLine();

    if (numero.length() != 2) {
        System.out.println("Errore: devi inserire esattamente 2 caratteri!");
    } else if (!numero.matches("[0-9]{2}")) {
        System.out.println("Errore: puoi inserire solo numeri (0-9)!");
    }

} while (numero.length() != 2 && !numero.matches("[0-9]{2}"));
   
   do{ System.out.println("Inserisci 1 simbolo tra questi proposti ! \" # $ % & ' ( ) * + , - . / ");
       carattere= sc.nextLine(); //carattere verrà memorizzata da scanner e trasformato in un char
    }
     while (simboliConsentiti.indexOf(carattere) == -1); //controllo che sia un solo carattere e sia incluso nella lista. se lo trova cerca la sua posizione nella lista, altrimenti ripete il ciclo

    sc.close();   
    
    pass = lettera + numero + carattere;
    System.out.println("La passowrd inserita e: " + pass);

    
    }
}

    
//To do: capire come convertire una stringa in un carattere
       //To do: controlla che il carattere sia un simbolo
