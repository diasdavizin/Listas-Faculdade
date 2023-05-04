package lista3;
import java.util.Scanner;
public class ex01A {
     public static void main(String[] args) {
    
    //variavéis 
    int n1,n;
    Scanner numero=new Scanner(System.in);
    //entrada de dados
    System.out.print("Digite um número: ");
    n1=numero.nextInt();
    
    //processamento
    n=n1*n1;
    //saída de dados
    System.out.println("O número digitado ao quadrado é: "+n);
    }
}