package lista3;
import java.util.Scanner;
public class ex01C {
    public static void main(String[] args) {
    
    //variavéis
    float n1,raiz;
    Scanner teclado=new Scanner(System.in);
    
    //entrada de dados
    System.out.print("Digite um número: ");
    n1=teclado.nextFloat();
   
    //processamentos
    raiz= (float) Math.sqrt(n1);
    
    //saida de dados
    System.out.printf("A raiz quadrada é: √%.2f\n ",raiz);
    }
}