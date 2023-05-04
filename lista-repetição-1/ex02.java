/*A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes, coletando dados sobre o salário e o número de filhos. A prefeitura deseja saber: 
    a ) A média do salário da população; 
    b ) A média do número de filhos. 
O final da leitura de dados dar-se-á com a entrada de salários negativos. */
package listarepeticao;
import java.util.Scanner;
public class ex02 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        
        //variaveis
        float salario = 0,filho;
        int count = 0;
        float somafilho = 0;
        float somasalario = 0;
        
        //entrada de dados
        while (salario>=0){
            System.out.println("Digite seu salario: ");
            salario=teclado.nextFloat();
            
            if(salario<0){
                break;
            }
            
            somasalario = somasalario + salario;
            
            System.out.println("Digite o numero de filhos: ");
            filho=teclado.nextFloat();
          
            somafilho=somafilho+filho;
            
            count++;
        }
        float mediafilho = 0;
        mediafilho=somafilho/count;
        
        float mediasalario =0;
        mediasalario=somasalario/count;
        
        //saida de dados
        System.out.printf("O numero de entrevistados é de: %d \n -----------\n",count);
        System.out.printf("A média dos salários é de: %.2f \n -----------\n",mediasalario);
        System.out.printf("A média de filhos é de: %.2f \n -----------\n",mediafilho);
    }
}