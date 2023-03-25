//João Gabriel Ribeiro Holanda - CC1MA
import javax.swing.JOptionPane;
import java.util.Scanner;

public class D21814B {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String candidato1, candidato2, candidato3;
        candidato1 = JOptionPane.showInputDialog(null,
                "Qual o nome do candidato 1?");
        candidato2 = JOptionPane.showInputDialog(null,
                "Qual o nome do candidato 2?");
        candidato3 = JOptionPane.showInputDialog(null,
                "Qual o nome do candidato 3?");

        System.out.println("Qual a Quantidade de votos do(a) " + candidato1 + "?");
        int voto1 = kb.nextInt();
        System.out.println("Qual a quantidade de votos do(a) " + candidato2 + "?");
        int voto2 = kb.nextInt();
        System.out.println("Qual a quantidade de votos do(a) " + candidato3 + "?");
        int voto3 = kb.nextInt();
        System.out.println("Qual a quantidade de votos nulos?");
        int nulo = kb.nextInt();
        System.out.println("Quantidade de votos brancos?");
        int brancos = kb.nextInt();
        int invalidos = brancos + nulo;
        if (invalidos > voto1 && invalidos > voto2 && invalidos > voto3) {
            JOptionPane.showMessageDialog(null,
                    "A eleição foi inválida");
        } else if (voto1 > voto2 && voto1 > voto3) {
            JOptionPane.showMessageDialog(null,
                    "Vencedor: " + candidato1);
        } else if (voto2 > voto1 && voto2 > voto3) {
            JOptionPane.showMessageDialog(null,
                    "Vencedor: " + candidato2);
        } else if (voto3 > voto2 && voto3 > voto1) {
            JOptionPane.showMessageDialog(null,
                    "Vencedor: " + candidato3);
        } else {
            {
                JOptionPane.showMessageDialog(null,
                        "Insira a quantidade de votos corretamente");
            }
        }
        kb.close();
    }
}
