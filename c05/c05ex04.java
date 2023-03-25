import java.util.Scanner;
public class c05ex04 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, distancia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira as coordenadas X de enter e depois Y para o primeiro ponto:  ");
        x1= teclado.nextDouble();
        y1= teclado.nextDouble();
        System.out.println("insira as coordenadas X de enter e depois Y para o segundo ponto");
        x2=teclado.nextDouble();
        y2=teclado.nextDouble();
        distancia = Math.sqrt((Math.pow(x1-x2,2))+(Math.pow(y1-y2,2)));
        System.out.println(distancia);
        teclado.close();
        //raiz quadrada Math.sqrt()
        //potencia Math.pow(x,y)

    }
}
