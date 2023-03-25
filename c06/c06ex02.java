import java.util.Scanner;
public class c06ex02 {
    public static void main(String[] args) {
        double poluente,multa;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a quantidade de poluentes? ");
        poluente = teclado.nextDouble();
        if (poluente <=1500){
            multa = 0;
        }
        else
         if (poluente <=3500){
            multa = 3000;
         }
         else {
            multa = 5000*poluente;
         }
         String multanew = Double.toString(multa);
         System.out.println("A multa é iguual a:  R$"+multanew);
         teclado.close();
    }
}