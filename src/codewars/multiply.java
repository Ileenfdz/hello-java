package codewars;
import java.util.Scanner;

public class multiply {
    public static void main(String[] args){
        try (Scanner input = new Scanner (System.in)) {
            System.out.println("Ingrese un número");
            int num1 = input.nextInt();

            System.out.println("Ingrese otro número");
            int num2 = input.nextInt();

            int result = num1 * num2;

            System.out.println("Al multiplicar sale: "+ result);
        }
    }
}