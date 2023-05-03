//Faça um programa que leia as notas de 5 alunos, e que exiba a maior e menor notas entre elas.
package listarepeticao;
import java.util.Scanner;
public class ex07 {
    public static void main(String[] args){
             
            int cont = 0;
        float nota = 0, notaanterior = 0, notamaior = 0, notamenor = 0;
        Scanner teclado = new Scanner (System.in);
        
        while (cont < 5){
        System.out.println("Digite a nota:");
        
        nota = teclado.nextFloat();
        
        
        if (nota > notaanterior){
            notamaior = nota;
        }else if (nota < notaanterior){
            notamenor = nota;
        }
        
        notaanterior = nota;
        cont ++;
        }
        
        System.out.println("\nNota maior: " +notamaior);
        System.out.println("Nota menor: " +notamenor);
    }   
}