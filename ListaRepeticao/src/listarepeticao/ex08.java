/* Faça um programa que leia a idade e peso de sete pessoas. Calcule e mostre:
   a quantidade de pessoas com mais de 90 kg
   a média das idades das sete pessoas */

package listarepeticao;
import java.util.Scanner;
public class ex08 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        
        int idade = 0;
        int qtdPeso = 0;
        float qtdMedia;
        float soma = 0;
        
        for(int count = 0; count<7; count++){
            System.out.println("Digite sua idade: ");
            idade = teclado.nextInt();
            System.out.println("Digite seu peso: ");
            float peso = teclado.nextFloat();
           
                if (peso >=90){
                    qtdPeso++;
                    
                }
                soma = idade+soma;
        }
        qtdMedia = (soma/7);
        
        System.out.println("A quantidade de pessoas com mais de 90 kgs é de: "+qtdPeso);
        System.out.println("A média das idades das sete pessoas é de: "+qtdMedia);
    }
}