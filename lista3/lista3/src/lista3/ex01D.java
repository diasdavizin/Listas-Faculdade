package lista3;
import java.util.Scanner;
public class ex01D {
    public static void main(String[] args) {
        
    //variavéis
    float n1,cubica;
    Scanner teclado=new Scanner(System.in);
    
    //entrada de dados
    System.out.print("Digite um número: ");
    n1=teclado.nextFloat();
    
    //processamento
    cubica=(float) Math.cbrt(n1);
    
    //saída de dados
    System.out.printf("A raiz cúbica do número digitado é: ³√%.2f\n",cubica);
    }
}