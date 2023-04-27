import java.util.Scanner;

public class c08ex14 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("valor N");
        int n = kb.nextInt();
        kb.close();
        if (n >= 20 || n <= 0) {
            System.out.println("Seu número é grande ou pequeno demais");
        } else {
            for (int b = 1; b <= n; b++) {
                System.out.println();
                for (int a = 1; a <= n; a++) {
                    System.out.print("* ");
                }
            }
        }
    }
}