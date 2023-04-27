package c09;

import java.util.Scanner;

public class c09ex03 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double numerador=0,denominador=0,tudao=0;
        int uaisonumeroaquize=kb.nextInt();
        for(int a=1;a<=uaisonumeroaquize;a++){
            numerador=(1+Math.sqrt(4*a));
            denominador+=3;
            tudao+=numerador/denominador;
        }
        System.out.println(tudao);
        kb.close();
    }
}
