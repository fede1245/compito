import a.Strumento;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public static void Main(String[] args){
    Scanner sc = new Scanner(System.in);

     boolean errore = false;
     String tipo;

     //controllo se il numero è maggiore di 50, e in caso chiede di inserire nuovamente il valore fin quando è minore di 50
    do {
        System.out.println("inserisci il numero di strumenti");
        int strumenti = sc.nextInt();

        if(strumenti > 50) {
            errore = true;
            System.out.println("errore, il numero massimo di strumenti è 50, riprova");

        }else{
            errore = false;
        }
    }while(errore == true);
    Array<Strumento> strumenti = new Array<Strumento>();

    for (int i = 0; i < strumenti; i++) {
        System.out.println("inserisci i tipi di strumenti");
        String tipi = sc.nextInt();
        System.out.println("inserisci il tipo" i);
        tipo = sc.next();


    }
 int annoLimite = 2000;

    public static int contaModerni(Strumento[] arr, int annoLimite){
        if(annoCreazione >= annoLimite){
            System.out.println("lo strumento è vecchio");
        }else {
            System.out.println("lo strumento è moderno");
        }
    }
}