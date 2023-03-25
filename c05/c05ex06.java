import java.util.Scanner;
public class c05ex06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x,y,a,b,c,distancia;
        System.out.println("cordenada x");
        x = teclado.nextDouble();
        System.out.println("cordenada y");
        y=teclado.nextDouble();
        System.out.println("valor a da reta R");
        a=teclado.nextDouble();
        System.out.println("valor b da reta R");
        b=teclado.nextDouble();
        System.out.println("valor c da reta R");
        c=teclado.nextDouble();
        distancia = (a*x+b*y+c)/Math.sqrt( Math.pow(a,2)+ Math.pow(b,2));
        System.out.println("Distância: "+distancia);
        teclado.close();
    }
}
