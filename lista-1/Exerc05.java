package exerc05;
import java.util.Scanner;
public class Exerc05 {
    public static void main(String[] args) {
        
       //variaveis
        float a;
        Scanner teclado=new Scanner(System.in);
       
       //entrada de dados
        System.out.print("Digite um número: ");
        a=teclado.nextFloat();
        
       //processamento
        if (a>=0){
            a=a*2;
            System.out.println("O dobro do número positivo é de: "+a);
        }else{
            a=a*3;
            System.out.println("O triplo do número negativo é de: "+a);
        }        
    }
}
