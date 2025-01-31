import  java.util.Scanner;

public class DataEntry {
 
    public static void main(String[]  args) {
    
    
    Scanner entry = new Scanner(System.in);

    System.out.print("Name: ");
    String name = entry.nextLine();
 
    System.out.print("Heigth:");
    double heigth = entry.nextDouble(); 
    
    System.out.print("Weight:");
    int weigth  = entry.nextInt();

    double imc = weigth / (heigth * heigth );
    System.out.print("Imc of : " + name + "is  " + imc);
    
  }

}