package c10;

import java.util.Scanner;

public class c10ex04 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double taxaBDI;
        System.out.print("Informe a taxa de BDI (em %): ");
        taxaBDI = kb.nextDouble();

        String nomeMaterial;
        int quantidade;
        double precoUnitario, custoParcial, custoTotal = 0;

        while (true) {
            System.out.print("Informe o nome do material (ou FIM para encerrar): ");
            nomeMaterial = kb.next();

            if (nomeMaterial.equals("FIM")) {
                break;
            }

            System.out.print("Informe a quantidade do material: ");
            quantidade = kb.nextInt();

            System.out.print("Informe o preço unitário do material: ");
            precoUnitario = kb.nextDouble();

            custoParcial = quantidade * precoUnitario;
            custoTotal += custoParcial;

            System.out.printf("Custo parcial do material %s: R$ %.2f\n", nomeMaterial, custoParcial);
        }

        double valorBDI = custoTotal * taxaBDI / 100;
        double precoFinal = custoTotal + valorBDI;

        System.out.printf("Custo total: R$ %.2f\n", custoTotal);
        System.out.printf("Valor do BDI: R$ %.2f\n", valorBDI);
        System.out.printf("Preço final: R$ %.2f\n", precoFinal);

        kb.close();
    }
}
