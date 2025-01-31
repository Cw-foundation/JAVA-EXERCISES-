import  java.util.Scanner;

public class ProgramaEmpresa {

    public static void main(String[] args){

        Scanner entry = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = entry.nextLine();

         System.out.print("Valor por Hora : ");
         double valorPorHora = entry.nextDouble();

         System.out.print("Horas trabalhadas : ");
         int horasTrabalhadas = entry.nextInt();
         
         System.out.print("Valor dos Descontos : ");
         double valorDosDescontos = entry.nextDouble();

         double multiplicacao = horasTrabalhadas * valorPorHora ; 
         double subtracao = multiplicacao - valorDosDescontos ;
	 	
         double totalDevido = subtracao ;
          System.out.printf("\n------------------------------------------------------------------------------------------------------------");
          System.out.printf("Folha de Pagamento : " + name + "\n" + horasTrabalhadas + "horas x R$" +  valorPorHora + " = " +  multiplicacao + "\n Descontos: R$"+ valorDosDescontos + "\n Total Devido: "+ totalDevido );
       


          }



}