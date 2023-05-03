// Altere o programa para que o usuário digite os 4 boletos que ele deve pagar, e o salário bruto que ele tem disponível e lhe retorne:
// O Salário líquido (desconto de 14% em folha);  
// O total das contas
// O restante do salário.

package lista2;
import java.util.Scanner;
public class ex02 {
    public static void main(String[] args){
    
        //variaveis
        float b1,b2,b3,b4,salario;
        Scanner teclado=new Scanner(System.in);
        
        //entrada de dados
        System.out.println("Digite o valor do seu salário bruto: ");
        salario=teclado.nextFloat();
        
        System.out.println("Digite o valor do primeiro boleto: ");
        b1=teclado.nextFloat();
        
        System.out.println("Digite o valor do segundo boleto: ");
        b2=teclado.nextFloat();
        
        System.out.println("Digite o valor do terceiro boleto: ");
        b3=teclado.nextFloat();
        
        System.out.println("Digite o valor do quarto boleto: ");
        b4=teclado.nextFloat();
        
       
        //processamento
        float total;
        total=b1+b2+b3+b4;
       
        float salariol=(salario * 0.14F);
        
        float salariox= salario-salariol;
        
        float resto;
        resto=salariox-total;
        
        //saida de dados
        System.out.println("O total do seu salário bruto é de: "+salario);
        System.out.println("O total do seu salário líquido é de: "+salariox);
        System.out.println("O total dos seus boletos é de: "+total);
        System.out.println("O valor que sobrará do seu salário é de: "+resto);
    }
}