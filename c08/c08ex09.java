import java.util.Scanner;

public class c08ex09 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numpessoas = 0;
        double somaidadeM = 0.0, somaidadeF = 0, countM = 0, countF = 0;
        System.out.println("qual o numero de nomes hehe");
        numpessoas = kb.nextInt();
        for (int a = 1; a <= numpessoas; a++) {
            System.out.println("Qual sua idade? ");
            int idade = kb.nextInt();
            System.out.println("Sexo?");
            kb.nextLine();
            String deuterononomio = kb.nextLine();
            if (deuterononomio.equalsIgnoreCase("M")) {
                somaidadeM +=idade;
                countM++;
            } else if (deuterononomio.equalsIgnoreCase("F")) {
                somaidadeF +=idade;
                countF++;
            } else {
                System.out.println("estude mais, por favor aceitamos apenas pessoas com no mínimo 2,7 de QI");
            }
        }
        System.out.println(somaidadeF);
        somaidadeM = somaidadeM / (countM);
        somaidadeF = somaidadeF / (countF);
        System.out.println(somaidadeM + " homens e muies " + somaidadeF);
        kb.close();
    }
}
