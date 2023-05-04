package lista3;
import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        
        //variaveis
          float altura,peso;
          Scanner teclado=new Scanner(System.in);
        
        //entrada de dados
          System.out.print("Digite sua altura: ");
          altura=teclado.nextFloat();
          
        //procedimentos
          peso=(float) 72.7 *altura - 58;
          
        //saida de dados
          System.out.printf("O seu peso ideal é de: %.2f\n ",peso);
    }
}