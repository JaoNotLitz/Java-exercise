
import java.util.Scanner;
public class c08ex01 {
    public static void main(String[] args) {
        double pi = 3.1416;
        double raio;
        Scanner kb = new Scanner(System.in);
        for (int a = 1; a<=10;a++){
            System.out.println("Digite o valor do Raio");
            raio = kb.nextDouble();
            System.out.println("A área é igual a: "+(pi*raio*raio));

        }
        kb.close();
    }
}
