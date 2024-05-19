import java.util.Scanner;

public class taskTEN {
    static public void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni nje nr: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i=0;i<n;i++){
          array[i]=n-i;
        }
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        int total=0;
        for (int i=1;i<=array.length;i++) {
            total += i;
        }
        System.out.println("Totali: "+total);


    }
}
