package exerc03;
import java.util.Scanner;
public class Exerc03 {
    public static void main(String[] args) {
        
       //variaveis
       int a,b,c;
       Scanner teclado=new Scanner(System.in);
       
       //entrada de dados
        System.out.print("Digite um valor: ");
        a=teclado.nextInt();
        System.out.print("Digite outro número: ");
        b=teclado.nextInt();
        
        //processamento
        if (a==b){
            c=a+b;
            System.out.println("São iguais e a soma dos números é de: "+c);
        }else{
            c=a*b;
            System.out.println("São diferentes e a multiplicação dos números é de: "+c);
        }  
    }   
}