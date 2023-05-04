// Faça um programa que o usuário digite os 4 boletos que ele deve pagar, e o salário líquido que ele tem disponível e imprima:
// o total de suas contas;
// o valor que irá sobrar (ou faltar).

package lista2;
import java.util.Scanner;
public class ex01 {
    public static void main(String[] args){
      
        //variaveis
        float b1,b2,b3,b4,salario;
        Scanner teclado=new Scanner(System.in);
        
        //entrada de dados
        System.out.print("Digite o valor do seu salário líquido: ");
        salario=teclado.nextFloat();
        
        System.out.print("Digite o valor do primeiro boleto: ");
        b1=teclado.nextFloat();
        
        System.out.print("Digite o valor do segundo boleto: ");
        b2=teclado.nextFloat();
        
        System.out.print("Digite o valor do terceiro boleto: ");
        b3=teclado.nextFloat();
        
        System.out.print("Digite o valor do quarto boleto: ");
        b4=teclado.nextFloat();
        
       
        //processamento
        float total;
        total=b1+b2+b3+b4;
        
        float resto;
        resto=salario-total;
        if (resto<total){
        }
        
        //saida de dados
        System.out.println("O total dos seus boletos é de: "+total);
        System.out.print("O valor que sobrará do seu salário é de: "+resto);
    }
}