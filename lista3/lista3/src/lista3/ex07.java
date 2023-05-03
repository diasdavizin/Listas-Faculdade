package lista3;
import java.util.Scanner;
public class ex07 {
    public static void main(String[] args){
        
        //variaveis
        float n1,n2,m;
        Scanner teclado=new Scanner(System.in);
        
        //entrada de dados
        System.out.print("Digite a primeira nota: ");
        n1=teclado.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        n2=teclado.nextFloat();
        
        //processamento
        m=(n1+n2)/2;
        if (m>=7){
            //saida de dados
            System.out.println("Você está aprovado.");
        }else{
            //saida de dados
            System.out.println("Você está reprovado.");
        }
    }
}