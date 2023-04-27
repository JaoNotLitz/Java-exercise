package c10;

import java.util.Scanner;

public class c10ex06 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double a,b,c,x,y,r,distancia;
        do{
            System.out.println("digite valor de a");
            a=kb.nextDouble();
            System.out.println("digite valor de b");
            b=kb.nextDouble();
            System.out.println("digite valor de c");
            c=kb.nextDouble();
            System.out.println("digite valor de x");
            x=kb.nextDouble();
            System.out.println("digite valor de y");
            y=kb.nextDouble();
            r=a*x+b*y+c;
            distancia=r/Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
            System.out.println("distancia: "+distancia);
        }
        while(distancia!=0);
        kb.close();
    }
}