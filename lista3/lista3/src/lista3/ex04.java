package lista3;
import java.util.Scanner;
public class ex04 {
    public static void main(String[] args){
        //variaveis
        double celsius,fahrenheit;
        Scanner teclado=new Scanner(System.in);
        
        //entrada de dados
        System.out.print("Digite a temperatura em Celsius: ");
        celsius=teclado.nextFloat();
        
        //processamento
        fahrenheit=(celsius*1.8)+32;
        
        //saida de dados
        System.out.printf("A temperatura em Fahrenheit é de: %.2f\n",fahrenheit);
     }
}