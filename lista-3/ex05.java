package lista3;
import java.util.Scanner;
public class ex05 {
    public static void main(String[] args){
       
        //variaveis 
        int a,b,c,delta,x1,x2;
        Scanner teclado=new Scanner(System.in);
        
        //entrada de dados
        System.out.print("Informe o coeficiente A: ");
        a=teclado.nextInt();
        
        System.out.print("Informe o coeficiente B: ");
        b=teclado.nextInt();
        
        System.out.print("Informe o coeficiente C: ");
        c=teclado.nextInt();
        
        //processamento
        delta = (int) Math.sqrt(b*b -4*a*c);
        x1 = (-b+delta)/2*a;
        x2 = (-b-delta)/2*a;
        
        //saida de dados
        System.out.println("As raizes reais são: "+x1+","+x2);
    }
}