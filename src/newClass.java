import java.util.Scanner;

public class newClass {
    static public void main(String[] args) {

    float p =  perimetriRRethit();
        System.out.println("Perimetri  "+ p);


    }
    static public float perimetriRRethit(){
        System.out.println("Vendos rrezzen e rrethit");
        Scanner sc = new Scanner(System.in);
        float rrezja = sc.nextFloat();


        float perimetri = (float) (2*Math.PI*rrezja);
        return perimetri;
    }
}
