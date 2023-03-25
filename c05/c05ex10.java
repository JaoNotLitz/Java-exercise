import java.util.Scanner;

public class c05ex10 {
    public static void main(String[] args) {
        System.out.println("qual seu numero de 5 digitos prediletos");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int num1 = num / 10000;
        int num2 = (num / 1000) % 10;
        int num3 = (num / 100) % 10;
        int num4 = (num / 10) % 10;
        int num5 = num % 10;
        System.out.println(num1 + "\n" + num2 + "\n" + num3 + "\n" + num4 + "\n" + num5);
        teclado.close();
    }
}