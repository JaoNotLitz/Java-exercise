//João Gabriel Ribeiro Holanda - CC1MA
import java.util.Scanner;

public class D21814A {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Qual o valor de x para F1(x) e F2(x)");
        double x = kb.nextDouble();
        double fx1, fx2;
        fx1 = ((2/7.0)*Math.pow(x, 2)+(Math.pow((4*Math.pow(x, 5))+10, 1/3.0))-3);
        System.out.println("O valor para F1(x) é: "+fx1);
        fx2 = ((5*x-3)/(Math.pow(x-1, 1/7.0))+6*x-1);
        System.out.println("O valor para F1(x) é: "+fx2);
        kb.close();
    }
}
