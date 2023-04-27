package c09;

import java.util.Scanner;

public class c09ex04 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        System.out.println("Num rep");
        int numdotrem=kb.nextInt();
        double numerador=0,denominador=0,soma=0,numeradorpart1=-3.0;
        for(int a=1;a<=numdotrem;a++){
            numeradorpart1+=4.0;
            numerador=(numeradorpart1)*(numeradorpart1+1.0);
            denominador=(numeradorpart1+2.0)*(numeradorpart1+3.0);
            soma+=numerador/denominador;
        }
        System.out.println(Math.sqrt(soma));
        kb.close();
    }
}