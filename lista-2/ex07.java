//O proprietário da empresa ABC LTDA precisa de um programa de computador para calcular o novo salário que seus funcionários irão receber a partir do mês que vem. Sabendo que o aumento de salário para todos os funcionários será de 25%, faça um programa que leia o valor do salário atual do funcionário e informe o seu novo salário acrescido de 25%.

package lista2;
import java.util.Scanner;
public class ex07 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        //variaveis
        double sal,aumento,novosal;
        
        //entrada de dados
        System.out.println("Digite o valor do seu salario:");
        sal=teclado.nextDouble();
        
        //processamento
        aumento=(sal*0.25);
        novosal=(sal+aumento);
        
        //saida de dados
        System.out.printf("O valor do seu novo salario acrescido de aumento é de: %.2f \n",novosal);
    }    
}