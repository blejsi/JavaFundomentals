import java.util.Scanner;

public class usKater {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendosni nje nr pozitiv: ");


         for (int i=1;i <= 25;i++){

             if (i < 0) {
                 System.out.println("Vendosni nje nr pozitiv: ");
                 i = scanner.nextInt();

             } else if (i % 3 == 0 && i % 7 == 0) {
                 System.out.println("FizzBuzz");

             } else if (i % 3 == 0) {
                 System.out.println("Buzz");
             } else if (i % 7 == 0) {
                 System.out.println("Fizz");
             } else {
                 System.out.println(i);
             }
        }



    }
}
