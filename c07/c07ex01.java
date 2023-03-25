import java.util.Scanner;
public class c07ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a quantidade dos seus acertos");
       int a = teclado.nextInt();
        switch (a) {
            case 0: case 1: case 2: case 3: case 4: case 5:    
            System.out.println("Não há premiação");
            break;
            case 6: case 7: case 8: case 9: case 10:
            System.out.println("Outro Cartão");
            break;
            case 11:
            System.out.println("Uau! Você ganhou R$ 100,00!");
            break;
            case 12:
            System.out.println("Minha nossa! Você ganhou R$ 1.000,00!");
            break;
            case 13:
            System.out.println("Catapimbas! Você ganhou 50.000,00!");
            break;
            default :{
            System.out.println("Insira um número valido");
        }
        }
        teclado.close();
    }
}
