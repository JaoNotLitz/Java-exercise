
import java.util.Scanner;
public class c08ex02 {
    public static void main(String[] args) {
        double nota;
        Scanner kb = new Scanner(System.in);
        for (int a=1;a<=50;a++){
            System.out.println("Coloque o valor da nota do aluno "+a+":");
            nota = kb.nextDouble();
            if (nota>64){
                System.out.println("Aprovado!");
            }
            else {
                System.out.println("Reprovado.");
            }
            kb.close();
        }
    }
}
