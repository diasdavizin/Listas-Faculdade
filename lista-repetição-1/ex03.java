//Faça um programa que faça a leitura de 5 valores, e para cada valor, mostre o seu dobro na tela.
package listarepeticao;
import java.util.Scanner;
public class ex03 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int v;
        for (int n = 1; n <6; n++){
            System.out.printf("Digite o %d° valor:\n", n);
            v = teclado.nextInt();
            v = v*2;
            System.out.println("O dobro do valor é de: "+v);
        }
    }
}