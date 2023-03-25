import java.util.Scanner;
public class c06ex03 {
    public static void main(String[] args) {
        System.out.println("informe o valor vendido: ");
        Scanner teclado = new Scanner(System.in);
        double venda = teclado.nextDouble();
        double comissao;
        if (venda<=1000){
            comissao = 0;
        }
        else
         if (venda<=10000){
            comissao = venda*10/100;
         }
         else {
            comissao = 1000;
         }
         System.out.println("o salário será de R$"+(comissao+240));
         teclado.close();
    }
}
