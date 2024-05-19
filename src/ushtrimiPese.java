import java.util.Scanner;

public class ushtrimiPese {
    static public void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni nje nr ");
            int n = sc.nextInt();

        System.out.println("nr me te medhenj se 1 dhe n-s");
            for (int i = 2; i < n; i++) {

                System.out.println(i);
            }


    }
}
