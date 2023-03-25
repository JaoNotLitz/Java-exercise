import java.util.Scanner;

public class c05ex09 {
    public static void main(String[] args) {
        double nota1,nota2,nota3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("defina as 3 notas, informe-as dando enter entre uma e outra:");
        nota1=teclado.nextDouble();
        nota2=teclado.nextDouble();
        nota3=teclado.nextDouble();
        double media = (nota1*2+nota2*3+nota3*5)/10;
        System.out.println("a média é: "+media);
        teclado.close();
    }
}
