import java.util.Scanner;
public class c05ex08{
    public static void main(String[] args) {
    double pi = 3.1416;
    double s,a,r;
    System.out.println("Defina o valor de S(área circular)");
    Scanner teclado = new Scanner(System.in);
    s=teclado.nextDouble();
    System.out.println("Defina o valor do ângulo: ");
    a=teclado.nextDouble();
    r=Math.sqrt(360*s/(a*pi));
    System.out.printf("O valor do Raio é igual a %.2f ", r);
    teclado.close();
    }
}
//R=Math.sqrt(360*S/a*pi)