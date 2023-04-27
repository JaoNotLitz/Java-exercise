import java.util.Scanner;

public class c08ex22 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Digite um númer inteiro e maior do que 0");
        double num = kb.nextDouble();
        int count = 0;
        double divisao = 0;
        for (int a = 1; a <= num; a++) {
            divisao = num / a;
            if (divisao % 2 == 0) {
                count++;
            }

        }
        if (count <= 2) {
            System.out.println("Primo");
        } else {
            System.out.println("Não é primo");
        }
        kb.close();
    }
}
