import java.util.Scanner;

public class c06ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Defina o valor de X:");
        long x = teclado.nextLong();
        double fx = 0;
        if (x == 4) {
            fx = 0;
        }

        else if (x > 4) {
            fx = ((5 * x + 3) / Math.sqrt(Math.pow(x, 2) - 16));
        }

        else {
            fx = ((5 * x + 3) / Math.sqrt(16 - Math.pow(x, 2)));
        }
        System.out.printf("O valor de x é %.3f", fx);
        teclado.close();
    }

}
