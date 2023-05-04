//Faça um programa que solicite ao usuário que informe o valor das temperaturas coletadas nos 10 primeiros dias do mês de janeiro de 2021, em Belo Horizonte. Imprima em seguida a média dessas temperaturas.
package listarepeticao;
import java.util.Scanner;
public class ex05 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        
        float temp;
        float soma = 0;
        float media = 0;
        
        for(int count = 0; count<10; count++){
            
        System.out.printf("Digite o valor da temperatura no %d° dia de janeiro: \n",count+1);
        temp=teclado.nextFloat();
       
        soma = soma+temp;
        
        }
        media = (soma/10);
        
        System.out.printf("A média de temperatura dos 10 primeiros dias de janeiro é de: %.2f \n",media);
    }
}