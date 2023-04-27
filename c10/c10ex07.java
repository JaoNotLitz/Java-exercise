package c10;

import java.util.Scanner;

public class c10ex07 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int countDia = 0, countMes = -1, countAno = 0;
        double quantcontaminados = 1, contaminadospdia,saudaveis;
        System.out.println("Quantidade de pessoas: ");
        saudaveis = kb.nextInt();
        kb.close();
        do {
            contaminadospdia = quantcontaminados * 0.003;
            quantcontaminados += contaminadospdia;
            countDia++;
            if (countDia == 30) {
                countDia = 0;
                countMes++;
            }
            if (countMes == 12) {
                countMes = 0;
                countAno++;
            }
        } while (saudaveis >= quantcontaminados);
        System.out.println(countDia);
        System.out.println(countMes);
        System.out.println(countAno);

    }
}
