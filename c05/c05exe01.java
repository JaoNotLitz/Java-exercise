import java.util.Scanner;
public class c05exe01 {
    public static void main(String[] args) {
        System.out.println("informe o número inteiro de 4 digitos: ");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int num1,num2,num3,num4;
        num1 = num/1000;
        num2 = (num/100)%10;
        num3 = (num/10)%10;
        num4 = num%10;
        if (num1==num4&&num2==num3){
            System.out.println("O número é um palíndromo.");
        }
        else {
            System.out.println("O número não é um palíndromo.");
        }
        teclado.close();
    }
}
