import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese un número");
        int x = entrada.nextInt();
        int fact = 1;
        for (int i = 0; i < x+1; i++) {
            fact = fact * i;
        }
        System.out.println("el factorial es: "+ fact);
    }

}
