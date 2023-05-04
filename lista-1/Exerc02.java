package exerc02;
import java.util.Scanner;
public class Exerc02 {
    public static void main(String[] args) {
      
       //variaveis
       int numero;
       Scanner teclado=new Scanner(System.in);
       
       //entrada de dados
        System.out.print("Digite um número: ");
        numero=teclado.nextInt();
        
       //processamento
       if (numero% 2 == 0){
            System.out.println("O número digitado é par.");   
        }else{
            System.out.println("O número digitado é ímpar.");
        }
    }
}
