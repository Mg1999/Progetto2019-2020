import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = 0;
        ArrayList<Registrazione> lista = new ArrayList<Registrazione>();
        System.out.println("Digitare 1 per inserire una Registrazione, 0 per uscire");
        n = Integer.parseInt(in.nextLine());
        do{
            String nome = in.nextLine();
            String cognome = in.nextLine();
            String email = in.nextLine();
            String password = in.nextLine();
            lista.add(new Registrazione(nome,cognome,email,password));
            System.out.println("Digitare 1 per inserire una Registrazione, 0 per uscire");
            n = Integer.parseInt(in.nextLine());
        }while(n==1);
        System.out.println("Oggetti creati: " + lista.size());
        lista.get(0).setNome("Gianfranco");
        System.out.println(lista.get(0).getNome());
    }
}
