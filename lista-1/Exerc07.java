package exerc07;
import java.util.Scanner;
public class Exerc07 {
    public static void main(String[] args) {
    
        //variaveis
        double peso,altura,imc;
        Scanner teclado=new Scanner (System.in);
        
        //entrada de dados
            System.out.print("Digite seu peso: ");
        peso=teclado.nextDouble();
            System.out.print("Digite sua altura: ");
        altura=teclado.nextDouble();
        
        //processamento
        imc=peso/(altura*altura);
        if (imc<20){
            System.out.print("Você está abaixo do peso.");
        }
        if (imc>20&&imc<25){
            System.out.println("Você está com o peso normal.");
        }
        if (imc>25&&imc<30){
            System.out.println("Você está com sobrepeso.");
        }
        if (imc>30&&imc<40){
            System.out.println("Você está obeso.");
        }
        if (imc>=40){
            System.out.println("Você está obeso mórbido.");
        }
  
        } 
}