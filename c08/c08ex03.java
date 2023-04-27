
import java.util.Scanner;
public class c08ex03 {
    public static void main(String[] args) {
        double nota;
        int aprovado = 0;
        int reprovado = 0;
        Scanner kb = new Scanner(System.in);
        for (int a=1;a<=50;a++){
            System.out.println("Coloque o valor da nota do aluno "+a+":");
            nota = kb.nextDouble();
            if (nota>64){
                System.out.println("Aprovado!");
                aprovado++;
            }
            else {
                System.out.println("Reprovado.");
                reprovado++;
            }
        }
        System.out.println(aprovado+" Aprovados e "+reprovado+" reprovados.");
        kb.close();
    }
}
