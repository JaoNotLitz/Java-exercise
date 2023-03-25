import java.util.Scanner;

public class c04ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor mínimo de poluição: ");
        int valor1 = teclado.nextInt();

        System.out.print("Informe o valor máximo de poluição ");
        int valor2 = teclado.nextInt();

        System.out.print("Informe o valor da multa para emissão até o valor "+valor1+": ");
        double multa1 = teclado.nextDouble();

        System.out.print("Informe o valor da multa para emissão entre "+ valor1+ " e "+ valor2+": ");
        double multa2 = teclado.nextDouble();

        System.out.print("Informe o valor da multa para emissão acima de "+valor2+": ");
        double multa3 = teclado.nextDouble();
        System.out.println("===========================================================");
        System.out.println("    Quantidade de Poluente Emitido x Valor da Multa");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Até " + valor1 + " Multa de R$" + multa1);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Entre " + valor1 + " e " + valor2 + " Multa de R$" + multa2);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Acima de " + valor2 + " Multa de R$" + multa3+" por poluente emitido");
        System.out.println("===========================================================");
    teclado.close();
    }
}
