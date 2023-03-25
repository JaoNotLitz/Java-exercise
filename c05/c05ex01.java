import java.util.Scanner;

public class c05ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x, funx;
        System.out.println("Qual o valor de X? para a função F(x) = x³+4x+10");
        x = teclado.nextDouble();
        funx = Math.pow(x,3) + 4*x + 10;
        System.out.println(funx);
        teclado.close();
   }
}
