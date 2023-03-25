import java.util.Scanner;
public class c06ex06 {
    
    public static void main(String[] args) {
        System.out.println("Insira o valor de a");
        Scanner teclado = new Scanner (System.in);
        double a = teclado.nextDouble();
            System.out.println("Insira o valor de b");
        double b = teclado.nextDouble();
            System.out.println("Insira o valor de c");
        double c = teclado.nextDouble();
        teclado.close();
            double delta = Math.pow(b,2)-4*a*c;
            if (delta<0){
                System.out.print("não há raizes para esta equacão.");
            }
            else if (delta==0){
                double xposi = (-1*b)/(2*a);
                System.out.println(delta);
                System.out.println("teremos 1 raiz = "+xposi);
            }
            else {
                double xposi = ((-1*b)+Math.sqrt(delta))/(2*a);
                double xneg = ((-1*b)-Math.sqrt(delta))/(2*a);
                System.out.println("o X' é "+xposi+"  \no X'' é: "+xneg);
            }

    }
    
}