import java.util.Scanner;

public class delta {
    static public void main(String[] args) {
        float delta= deltaValue();
        System.out.println(delta);





    }
    static public float deltaValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        float a = sc.nextFloat();
        System.out.println("Enter the value of b");
        float b = sc.nextFloat();
        System.out.println("Enter the value of c");
        float c = sc.nextFloat();
        float delta = (float) (Math.pow(b, 2))-4*a*c;
        return delta;

    }
    static public float x1(float a, float b){
        float x1=(-b-(float)(Math.sqrt(deltaValue())))/2*a;
        return x1;
    }
    static public float x2(float a, float b){
        float x2=(-b+(float)(Math.sqrt(deltaValue())))/2*a;
        return x2;
    }
}
