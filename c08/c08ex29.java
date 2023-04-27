import java.util.Scanner;

public class c08ex29 {
    public static void main(String[] args) {
        double resultado=1;
        Scanner kb = new Scanner(System.in);
        System.out.println("Digite X");
        int x=kb.nextInt();
        System.out.println("Digite Y");
        int y=kb.nextInt();
        kb.close();
        for(int a=1;a<=y;a++){
            resultado*=x;
        }
        System.out.println(resultado);
    }
}
