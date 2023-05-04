package exerc01;
import java.util.Scanner;
public class Exerc01 {
    public static void main(String[] args) {
        
        //variaveis
        float a,b,c;
        Scanner teclado=new Scanner(System.in);
        
        //entrada de dados
        System.out.print("Digite o valor de A: ");
        a=teclado.nextFloat();
        
        System.out.print("Digite o valor de B: ");
        b=teclado.nextFloat();
        
        System.out.print("Digite o valor de C: ");
        c=teclado.nextFloat();
        
        //processamento
        if (a+b<c){
            System.out.println("A soma de A + B é menor.");
        }
    }
}