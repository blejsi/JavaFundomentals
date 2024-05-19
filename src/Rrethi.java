public class Rrethi {

   private double rezja;

   Rrethi(double rezja) {
       this.rezja = rezja;
   }

    public  double PerimetriIRrethit(){

        return 2*Math.PI*rezja;
    }
    public  double VellimiIRrethit(){

        return Math.pow(rezja, 2)*Math.PI;
    }


}
