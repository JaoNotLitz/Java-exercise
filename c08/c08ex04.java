
import java.util.Scanner;
public class c08ex04 {
    public static void main(String[] args) {
        double nota;
        String nome;
        int maioridade = 0;
        int menoridade = 0;
        Scanner kb = new Scanner(System.in);
        for (int a=1;a<=5;a++){
            System.out.println("Qual seu nome?");
            kb.nextLine();
            nome = kb.nextLine();
            System.out.println("Coloque a idade do participante "+nome+":");
            nota = kb.nextDouble();
            if (nota>17){
                maioridade++;
            }
            else {
                menoridade++;
            }
        }
        System.out.println(maioridade+" maioridades e "+menoridade+" menoridades.");
        kb.close();
    }
}
