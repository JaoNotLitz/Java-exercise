import java.util.Scanner;

public class c08ex30 {
    public static void main(String[] args) {
        System.out.println("Digite o valor X e em seguida N");
        Scanner kb = new Scanner(System.in);
        double x = kb.nextDouble();
        double n = kb.nextDouble();
        kb.close();
        double somadiv=0;
        for(int a=1;a<=n;a++){
            somadiv+=((Math.pow(x, a)/a));
        }
        System.out.println( java.lang.Math.log(x)+somadiv);
    }
}
