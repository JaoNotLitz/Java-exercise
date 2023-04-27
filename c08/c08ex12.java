import java.util.Scanner;

public class c08ex12 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double preco1 = 1565.0, preco2 = 1890.0, preco3 = 2150.0, preco4 = 2963.0, preco5 = 3750.0, preco = 0,
                precototal = 0;
        int codigo = 0;
        for (int a = 1; a <= 1000; a++) {
            System.out.println("Qual o codigo do seu produto? ");
            codigo = kb.nextInt();
            if (codigo == 1) {
                preco = preco1;
            } else if (codigo == 2) {
                preco = preco2;
            } else if (codigo == 3) {
                preco = preco3;
            } else if (codigo == 4) {
                preco = preco4;
            } else if (codigo == 5) {
                preco = preco5;
            } else {
                System.out.println("O codigo NAO foi digitado corretamente");
                break;
            }
            precototal += preco;
        }
        System.out.println("Preço total é: " + precototal);
        kb.close();
    }
}