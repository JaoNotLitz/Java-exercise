import java.util.Scanner;

public class c03ex02 {
    // Função: Calcula a média de 3 números inteiros
    // autor João Gabriel
    public static void main(String[] args) {
        long n1, n2, n3, soma;
        double media;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número: ");
        n1 = teclado.nextLong();
        System.out.print("Informe outro número ");
        n2 = teclado.nextLong();
        System.out.print("Informe mais um apenas ");
        n3 = teclado.nextLong();
        soma = n1 + n2 + n3;
        media = soma / 3.0;
        System.out.printf("A média é: %.2f \n",media);
        teclado.close();

    }
}