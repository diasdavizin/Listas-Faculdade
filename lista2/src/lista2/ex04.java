// Faça um programa que receba três notas, calcule e mostre a média aritmética.

package lista2;
import java.util.Scanner;
public class ex04 {
    public static void main(String[] args){
        
        //variaveis
        float a,b,c,media;
        Scanner teclado=new Scanner(System.in);
        
        //entrada de dados
        System.out.println("Digite sua primeira nota: ");
        a=teclado.nextFloat();
        
        System.out.println("Digite sua segunda nota: ");
        b=teclado.nextFloat();
        
        System.out.println("Digite sua terceira nota: ");
        c=teclado.nextFloat();
        
        //processamento
        media=(a+b+c)/3;
        
        //saida de dados
        System.out.printf("A média das suas notas é: %.2f ",media);
    }
}