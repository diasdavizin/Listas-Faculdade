//Faça um programa que receba o salário de um funcionário e o percentual de aumento, calcule e mostre o valor do aumento e o novo salário.

package lista2;
import java.util.Scanner;
public class ex05 {
    public static void main(String[] args){
        
        //variaveis
        float salario,aumento,valoraumento,novosalario;
        Scanner teclado=new Scanner(System.in);
      
        //entrada de dados
        System.out.println("Digite o valor do seu salario:" );
        salario=teclado.nextFloat();

        System.out.println("Digite o percentual do seu aumento:" );
        aumento=teclado.nextFloat();

        //processamento 
        valoraumento=(aumento/100)*salario;
        novosalario=valoraumento+salario;
        
        //saida de dados
        System.out.println("O valor do seu aumento é de: "+valoraumento);
        System.out.println("O valor do seu novo salario é de: "+novosalario);
    }
}