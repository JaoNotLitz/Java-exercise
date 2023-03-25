import java.util.Scanner;
public class c05ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double celsius,kelvin,fahrenheit;
        System.out.println("Digite a temperatura em Celsius para ser convertida em Kelvin e Fahrenheit: ");
        celsius=teclado.nextDouble();
        kelvin = celsius + 273;
        fahrenheit = (celsius*9/5)+32;
        System.out.println("Kelvin: "+kelvin);
        System.out.println("Fahrenheit"+fahrenheit);
        teclado.close();

    }
}
