import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // P=2\pi
        Scanner sc = new Scanner(System.in);
        System.out.println("Fut rrezen e rrethit te pare");
        double x = sc.nextDouble();
        System.out.println("Fut rrezen e rrethit te dyte");
        double x1 = sc.nextDouble();

        Rrethi rrethi=new Rrethi(x);
        Rrethi rrethi1=new Rrethi(x1);;

       for (int i=0;i<2;i++){

           if (i==0){


               System.out.println("Perimetri i rrethit te pare eshte : ");
               System.out.println(rrethi.PerimetriIRrethit());
               System.out.println("Siperfaqja e rrethit te pare eshte : ");
               System.out.println(rrethi.VellimiIRrethit());

           }
            if (i==1){


               System.out.println("Perimetri i rrethit te dyte eshte : ");
               System.out.println(rrethi1.PerimetriIRrethit());
               System.out.println("Siperfaqja e rrethit te dyte eshte : ");
               System.out.println(rrethi1.VellimiIRrethit());
           }

       }

       if(x>x1){
           System.out.println("RRethi i pare eshte me i madh se i dyti");

       }else {
           System.out.println("Rrethi i dyte eshte me i madh se i pari");
       }






    }

}