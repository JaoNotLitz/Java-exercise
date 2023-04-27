package c10;

import java.util.Scanner;

public class c10ex02 {
    public static void main(String[] args) {
        double val = 1, valtotal = 0, countval = 0, countvalhigh = 0;
        Scanner kb = new Scanner(System.in);
        while (val != 0) {
            System.out.println("Digite o valo recebido");
            val = kb.nextDouble();
            if (val == 1) {

            } else {
                valtotal += val;
                countval++;
                if (val > 1000) {
                    countvalhigh++;
                }
            }
        }
        System.out.println("O valor total recebido é de: "+valtotal);
        System.out.println("A média dos valores recebidos é de: "+(valtotal/(countval-1)));
        System.out.println("A quantidade de valores a cima de R$1000 é de: "+countvalhigh);
        kb.close(); 
    }
}
