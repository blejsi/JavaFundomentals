import java.util.Scanner;

public class nextExample {
    static public void main(String[] args) {

       boolean bmi =  balanca();
       if (bmi==true){
           System.out.println("BMI is valid");
       }else {
           System.out.println("BMI is not valid");

       }

    }
    static public boolean balanca(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni peshen tuaj trupore ne Kg: ");
        float bodyWeight = sc.nextFloat();
        System.out.println("Vendosni gjatsine tuaj trupore ne cm: ");
        float headHeight = sc.nextFloat();
        headHeight = headHeight/100;

        float bmi = bodyWeight/(headHeight*headHeight)
                ;
        System.out.println("BMI: " + bmi);

        if(bmi > 18.5 && bmi < 25){
            return true;
        }
        else {
            return false;
        }
    }

}
