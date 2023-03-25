import java.util.Scanner;

public class c07ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor do imposto.");
        double imposto = teclado.nextDouble();
        double multa;
        System.out.println("Informe o número de dias.");
        int diasatraso = teclado.nextInt();
        switch (diasatraso) {
            case 1, 2, 3, 4, 5: {
                multa = 0;
            }
                break;
            case 6, 7, 8: {
                multa = (0.02 * imposto);
            }
                break;
            case 9, 10: {
                multa = (0.10 * imposto) + ((0.005 * diasatraso) * imposto);
            }
                break;
            default: {
                multa = (1.50 * imposto) + diasatraso;
            }
        }
        System.out.println("a multa é: " + multa);
        teclado.close();
    }
}
