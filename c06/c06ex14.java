import java.util.Scanner;

public class c06ex14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // leitura do número
        System.out.print("Digite um número inteiro de 4 dígitos: ");
        int numero = sc.nextInt();
        
        // verificação do número de dígitos
        if (numero < 1000 || numero > 9999) {
            System.out.println("NÚMERO TEM QUE TER 4 DÍGITOS");
        } else {
            // cálculo do número invertido
            int digito1 = numero % 10;
            int digito2 = (numero / 10) % 10;
            int digito3 = (numero / 100) % 10;
            int digito4 = numero / 1000;
            int numeroInvertido = digito1 * 1000 + digito2 * 100 + digito3 * 10 + digito4;
            
            // impressão do número invertido
            System.out.printf("Número invertido: %d", numeroInvertido);
        }
        
        sc.close();
    }

}
