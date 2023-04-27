import java.util.Scanner;

public class c08ex18 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Qual o valor que você quer a tabuada?");
        int valor = kb.nextInt();
        kb.close();
        for(int a=1;a<=9;a++){
            System.out.println(a+"x"+valor+"="+a*valor);
        }
    }
}
