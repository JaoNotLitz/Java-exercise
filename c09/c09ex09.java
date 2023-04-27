package c09;

import java.util.Scanner;

public class c09ex09 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Digite a quantidade de termos a serem realizados");
        int numx=kb.nextInt();
        double numerador,denominador1,denominador2,tudao=0;
            for(int a=1;a<=numx;a++){
                numerador=Math.pow(3,(a+1));
                denominador1=(a+9);
                denominador2=Math.pow(a, 4);
                tudao+=numerador/(denominador1*Math.sqrt(denominador2));

            }
            tudao=100-(Math.pow(tudao, 3));
            System.out.println(tudao);
            kb.close();
    }
}
