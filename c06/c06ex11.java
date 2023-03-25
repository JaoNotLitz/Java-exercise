import java.util.Scanner;

public class c06ex11 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Informe o nome da Equipe 1:");
        String equipe1 = kb.nextLine();

        System.out.println("Informe o nome da Equipe 2:");
        String equipe2 = kb.nextLine();

        System.out.println("Informe o número de sets ganhos pela " + equipe1 + ":");
        int setsEquipe1 = kb.nextInt();

        System.out.println("Informe o número de sets ganhos pela " + equipe2 + ":");
        int setsEquipe2 = kb.nextInt();

        int pontosEquipe1 = 0;
        int pontosEquipe2 = 0;

        if (setsEquipe1 > setsEquipe2) {
            if (setsEquipe1 - setsEquipe2 >= 2) {
                pontosEquipe1 = 3;
            } else {
                pontosEquipe1 = 2;
                pontosEquipe2 = 1;
            }
        } else if (setsEquipe2 > setsEquipe1) {
            if (setsEquipe2 - setsEquipe1 >= 2) {
                pontosEquipe2 = 3;
            } else {
                pontosEquipe2 = 2;
                pontosEquipe1 = 1;
            }
        }

        System.out.println("Pontuação da " + equipe1 + ": " + pontosEquipe1 + " pontos");
        System.out.println("Pontuação da " + equipe2 + ": " + pontosEquipe2 + " pontos");
        kb.close();
    }
}
