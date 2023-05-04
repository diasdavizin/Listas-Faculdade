package lista3;
import java.util.Scanner;
public class ex03 {
    public static void main(String[] args){
        
        //variaveis
        float dolar,cotacao,reais;
        Scanner teclado=new Scanner(System.in);
        
        //entrada de dados
        System.out.print("Digite a cotação atual: ");
        cotacao=teclado.nextFloat();
        
        System.out.print("Digite quantos dolares você tem: ");
        dolar=teclado.nextFloat();
        
        
        //processamento
        reais= dolar/cotacao;
        
        //saida de dados
        System.out.printf("O valor dos dolares em reais é de: %.2f\n ",reais);
    }
}