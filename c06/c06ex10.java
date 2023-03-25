import java.util.Scanner;
public class c06ex10 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("dias");
        int dias = kb.nextInt();
        System.out.println("capital");
        double capital = kb.nextDouble();
        System.out.println("taxa diaria (%)");
        double taxadiaria = kb.nextDouble()/100;
        double rendimento = capital*taxadiaria*dias;
        double imposto = 15/100.0*rendimento;
        double valresg = capital + rendimento - imposto-10.0;
        System.out.println("Valor resgatado:"+valresg);
        kb.close();
    }
}
