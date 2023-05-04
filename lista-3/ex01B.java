package lista3;
import java.util.Scanner;
public class ex01B {
     public static void main(String[] args) {
    
    //variaveis
    int n1,numero;
    Scanner teclado=new Scanner(System.in);
    
    //entrada de dados
    System.out.print("Digite um número: ");
    n1=teclado.nextInt();
    
    //processamento
    numero=(n1*n1)*n1;
    
    //saída de dados
    System.out.println("O número digitado ao cubo é: "+numero);
     }
}