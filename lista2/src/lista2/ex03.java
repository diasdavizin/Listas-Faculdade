// Faça um algoritmo/programa que receba os lados de um retângulo, calcule a área e perímetro do mesmo e mostre o resultado na tela. 

package lista2;
import java.util.Scanner;
public class ex03 {
    public static void main(String [] args){
        
        //variaveis
        double b,h,a,p;
        Scanner teclado=new Scanner(System.in);
        
        //entrada de dados
        System.out.println("Digite a base do retângulo?");
        b=teclado.nextDouble();
        
        System.out.println("Digite a altura do retângulo?");
        h=teclado.nextDouble();
        
        //processamento
        a=b*h;
        
        p=((b*2)+(h*2));
        
        //saida de dados
        System.out.println("A área do retângulo é: "+a);
        System.out.println("O perímetro do retângulo é: "+p);
    }
}