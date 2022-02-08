import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        try (Scanner input = new Scanner (System.in)) {
            System.out.println("Ingrese un número");
            int num1 = input.nextInt();

            System.out.println("Ingrese otro número");
            int num2 = input.nextInt();

            int sum = num1 + num2;

            System.out.println("La suma de ambos es: "+ sum);
        }
    }
}
