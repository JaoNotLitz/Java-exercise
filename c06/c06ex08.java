import java.util.Scanner;

public class c06ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = sc.nextLine();

        System.out.print("Digite a altura da pessoa em metros: ");
        double altura = sc.nextDouble();

        double pesoMinimo = 20 * altura * altura;
        double pesoMaximo = 25 * altura * altura;
System.out.print(nome+", ");
        System.out.printf("para a altura de %.2fm, o Peso Mínimo é %.2fkg e o Peso Máximo é %.2fkg", altura, pesoMinimo, pesoMaximo);

        sc.close();
    }
}
