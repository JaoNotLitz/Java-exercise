import java.util.Scanner;
public class c05ex03 {

    public static void main(String[] args) {
        double salario, liquido, imposto;
        long dependentes;
        System.out.println("Calculador de imposto de renda.\nInforme o número de dependentes");
        Scanner teclado = new Scanner(System.in);
        dependentes = teclado.nextLong();
        System.out.println("Informe o seu salário em Reais: ");
        salario = teclado.nextLong();
        liquido = salario - (dependentes*60);
        imposto = (liquido *15)/100;
        System.out.println("O imposto de renda a ser pago é de : R$"+imposto);
        teclado.close();
    }
}
