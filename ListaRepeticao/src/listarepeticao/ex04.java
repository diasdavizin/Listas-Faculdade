//Faça um programa que leia um número e que imprima os números ímpares de 1 até o número informado. 
package listarepeticao;
import java.util.Scanner;
public class ex04 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int n = 0;
        int count = 0;
        
        System.out.println("Digite um número: ");
        n = teclado.nextInt();
        System.out.println("Os números ímpares são:");
        while(count<n){
            if(count%2 != 0){
                System.out.print(count+",");
            }
        count++;
        }
    }
}