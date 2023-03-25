import java.util.Scanner;
public class c05exe02{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("insira o tempo");
        double t = teclado.nextDouble();
        System.out.println("insira a velocidade em m/s");
        double v = teclado.nextDouble();
        double c = 3*(Math.pow(10,8));
        double tr = t/(Math.sqrt(1-(Math.pow(v, 2))/Math.pow(c, 2)));
        System.out.printf("o tempo relativo é de: %.4f", tr); System.out.print(" segundos");
        teclado.close();
    }
}