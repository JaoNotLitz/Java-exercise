import java.util.Scanner;

public class c07ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua nota");
        int nota = teclado.nextInt();
        switch (nota) {
            case 1:
            case 2:
            case 3:
            case 4: {
                System.out.println("Seu conceito é E, melhore");
            }
                break;
            case 5:
            case 6: {
                System.out.println("Seu conceito é D, meh..");
            }
                break;
            case 7: {
                System.out.println("Seu conceito é C, da pra melhorar");
            }
                break;
            case 8: {
                System.out.println("Seu conceito é B, ta indo bem");
            }
                break;
            case 9:
            case 10: {
                System.out.println("Seu conceito é A, parabéns");
            }
                break;
            default:
                System.out.println("escreva a nota corretetamente seu animal!");
        }
        teclado.close();
    }
}
