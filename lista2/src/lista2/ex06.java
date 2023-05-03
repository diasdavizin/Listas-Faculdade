//Faça um programa que receba o salário base de um funcionário, calcule e mostre seu salário a receber, sabendo-se que o funcionário tem gratificação de R$ 50,00 e paga imposto de 10% sobre o salário base.

package lista2;
import java.util.Scanner;
public class ex06{
        public static void main(String[] args){
            Scanner teclado = new Scanner(System.in);
            
            //variaveis
            double sal,imposto,novosal;
            
            //entrada de dados
            System.out.println("Digite o valor do seu salario: ");
            sal=teclado.nextDouble();
            
            //processamento
            imposto=(sal*0.10);
            novosal=(sal - imposto)+50;
            
            //saída de dados
            System.out.printf("O valor do seu salario a receber é de: %.2f \n",novosal);
    }
}