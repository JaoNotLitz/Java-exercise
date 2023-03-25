import java.util.Scanner;

public class c05ex07 {
    public static void main(String[] args) {
        double fx, x;
        x = 0;
        System.out.println("Determine o valor de X: ");
        Scanner teclado = new Scanner(System.in);
        x = teclado.nextDouble();
        fx = Math.sqrt(Math.pow((x / 4) + 1, 2) + x / 5);
        System.out.printf("O valor de F(x) é igual a: %.2f", fx);
        teclado.close();
    }
}
