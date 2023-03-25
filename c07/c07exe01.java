import java.util.Scanner;

public class c07exe01 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double pontos = 0;
        System.out.println("Responda as perguntas apenas com Sim ou Nao.");
        System.out.println("Telefonou para a vítima?");
        String q1 = kb.nextLine();
        System.out.println("Esteve no local do crime?");
        String q2 = kb.nextLine();
        System.out.println("Mora perto da Vítima?");
        String q3 = kb.nextLine();
        System.out.println("Devia para a Vítima?");
        String q4 = kb.nextLine();
        System.out.println("Já trabalhou com a Vítima?");
        String q5 = kb.nextLine();
        switch (q1) {
            case "sim":
                pontos++;
        }
        switch (q2) {
            case "sim":
                pontos++;
        }
        switch (q3) {
            case "sim":
                pontos++;
        }
        switch (q4) {
            case "sim":
                pontos++;
        }
        switch (q5) {
            case "sim":
                pontos++;
        }
        if (pontos < 2) {
            System.out.println("Inocente");
        } else if (pontos == 2) {
            System.out.println("Suspeito");
        } else if (pontos <= 4) {
            System.out.println("Cumplice");
        } else {
            System.out.println("Assassino");
        }
        kb.close();
    }
}
