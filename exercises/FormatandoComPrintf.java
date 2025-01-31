public class FormatandoComPrintf{

  public static void main(String[] args){
    
    
    String name = "Thiago";
    System.out.printf("Hello, %s%n",  name );

    int quantity = 48 ;
    System.out.printf(" Quantity: %d items%n " , quantity);


    double peso = 123.456 ;
    System.out.printf(" Quantity:  %.3f%n " ,  peso);

   System.out.println(quantity / peso); 
 
   }



}