//Faça um programa que solicite ao usuário que informe a matrícula e as três notas de um conjunto de alunos. O programa deverá exibir a mensagem informando se o aluno foi aprovado (média maior ou igual a 70), exame (nota maior ou igual a 60 e menor que 70) ou reprovado (nota inferior a 60). O programa irá terminar quando o usuário informar uma matrícula negativa. 
package listarepeticao;
import java.util.Scanner;
public class ex01 {
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        
        //variaveis
        float n1,n2,n3,media;
        int matricula=0;
        
        //entrada de dados
        while (matricula>=0){
            System.out.println("Digite sua matricula: ");
            matricula=teclado.nextInt();
        
        if (matricula<0){
            System.exit(0);
        }
        
        System.out.println("Digite a primeira nota: ");
        n1=teclado.nextFloat();
        
        System.out.println("Digite a segunda nota: ");
        n2=teclado.nextFloat();
        
        System.out.println("Digite a terceira nota: ");
        n3=teclado.nextFloat();
        
        media=(n1+n2+n3)/3;
            System.out.printf("A média das notas é: %.2f, ",media);
            
            if (media>=70){
                System.out.println("aluno aprovado.\n -----------");
            }
            if(media>=60 && media<70){
                System.out.println("aluno em exame.\n -----------");
            }
            if(media<60){
                System.out.println("aluno reprovado.\n -----------");
            }
        }
    }
}