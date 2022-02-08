import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        //Scanner is to declare a new object or create one (this line in particular)
        try (Scanner input = new Scanner (System.in)) {
            System.out.println("Ingrese un número");

            //This will get the input from terminal in the variable num
            //nextInt() it scans the next thing in the input
            int num = input.nextInt();
            int fact = 1;

            for (int i = 0; i < num+1; i++) {
                fact = fact * i;
            }

            //This will print the text, plus, the result in terminal
            System.out.println("el factorial es: "+ fact);
        }

        //This makes the text come out in terminal to ask for a input
        // System.out.println is used to print something
        //The difference between prinln and print is that, println lets the input be in the next line
        // System.out.print("Ingrese un número");

    }
}