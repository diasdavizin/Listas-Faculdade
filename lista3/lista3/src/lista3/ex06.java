package lista3;
import java.util.Scanner;
public class ex06 {
    public static void main(String[] args){
        
        //variaveis
        float a,b;
        Scanner teclado=new Scanner(System.in);
        
        //entrada de dados
        System.out.print("Digite o primeiro número: ");
        a=teclado.nextFloat();
        
        System.out.print("Digite o segundo número: ");
        b=teclado.nextFloat();
        
        //processamento
        if (a>b){
            System.out.println("Primeiro maior");
        }else if(b>a) {
            System.out.println("Segundo maior");
        }if (a==b){
            System.out.println("Os dois números são iguais.");
        }
    }            
}