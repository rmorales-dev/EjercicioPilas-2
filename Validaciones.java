import java.util.Scanner;

public class Validaciones {
    public int ValidarEntero(Scanner sc){
        while (!sc.hasNextInt()) {
            System.out.println("Ingre un valor entero valido");
            sc.nextInt();
        }
        return sc.nextInt();
    }
    public String ValidarString(Scanner sc){
        while (!sc.hasNext()) {
            System.out.println("Ingrese un valor de texto valido");
            sc.next();
        }
        return sc.next();
    }
}
