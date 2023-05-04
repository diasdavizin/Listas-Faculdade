package exerc06;
import java.util.Scanner;
public class Exerc06 {
    public static void main(String[] args) {
        
        //variaveis
        float n1,n2,n3,media;
        Scanner teclado=new Scanner(System.in);
        
        //entrada de dados
        System.out.print("Digite a primeira nota: ");
        n1=teclado.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        n2=teclado.nextFloat();
        
        System.out.print("Digite a terceira nota: ");
        n3=teclado.nextFloat();
        
       
        //processamento
        media=(n1+n2+n3)/3;
        
        //saida de dados
        if (media>=0 &&media<3){
            System.out.printf("sua media foi de: %.2f ",media);
            System.out.println("REPROVADO");
        }
        if (media>=3 && media<7){
            System.out.printf("sua media foi de: %.2f ",media);
            System.out.println("EXAME");
        }
        if (media>=7 && media<=10){
            System.out.printf("sua media foi de: %.2f ",media);
            System.out.println("APROVADO");
        }
        if (media>10){
            System.out.println("nota invalida");
        }
    }
}