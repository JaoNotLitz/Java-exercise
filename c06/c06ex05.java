import java.util.Scanner;
public class c06ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       System.out.println("Insira um número inteiro.");
        int num = teclado.nextInt();
        int num1= num%5;
        int num2= num%7;
        if (num1==0&&num2==0){
            System.out.println("ambos são divisiveis por 5 e 7.");
        }
        else{
            System.out.println("ambos não sao divisiveis por 5 e 7 simultaneamente");
        }
        teclado.close();
    }
}
//  && ou &-> ambos verdadeiros
//  || ou |-> um ou outro ver
//  ! -> negação
//  Se utilizarmos & ou | todas as proposições da condição serão analisadas, no caso de utilizarmos && ou || as demais proposições da condição serão analisadas somente se necessário (mais rápido).