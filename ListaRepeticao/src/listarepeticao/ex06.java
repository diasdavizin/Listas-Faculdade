//Faça um programa que leia o sexo e o peso de 10 pessoas, e mostre quantas pessoas do sexo masculino possuem peso entre 60 e 80 kg, bem como a quantidade de mulheres que possuem peso entre 50 e 70 kg.
package listarepeticao;
import java.util.Scanner;
public class ex06 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        String sexo;
        int qtdH = 0;
        int qtdM = 0;
        
        for(int count = 0; count<10; count++){
            System.out.println("Digite H se for homem e M se for mulher.");
            sexo = teclado.next();
            System.out.println("Digite seu peso: ");
            float peso = teclado.nextFloat();
        
        switch (sexo){
            case "H":
               
                if (peso >=60 && peso <=80){
                    qtdH++;
                }
                break;
            case "M":
                
                if(peso >=50 && peso<=70){
                    qtdM++;
                }
                break;
                
            default: System.out.println("Sexo incorreto, digite H ou M. ");
                System.exit(0);
                break;
            }  
        }
        System.out.println("A quantidade de homens com peso entre 60 e 80 kgs é de: "+qtdH);
        System.out.println("A quantidade de mulheres com peso entre 50 e 70kgs é de: "+qtdM);
    }
}