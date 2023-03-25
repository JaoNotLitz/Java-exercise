import java.util.Scanner;

public class c06ex17 {
    public static void main(String[] args) {
        System.out.println("Responda APENAS com Sim ou Nao(sem acento gráfico)\nExame admissional");
        boolean condicao1, condicao2;
        String salario;
        Scanner kb = new Scanner(System.in);
        System.out.println("Você tem curso técnico de programação? ");
        String q1 = kb.nextLine();
        System.out.println("Você tem curso superior de programação?");
        String q2 = kb.nextLine();
        System.out.println("Você tem menos de 3 anos de experiencia em programação?");
        String q3 = kb.nextLine();
        System.out.println("Você se considera criativo(a)?");
        String q4 = kb.nextLine();
        System.out.println("Você prefere liderar a ser liderado?");
        String q5 = kb.nextLine();
        System.out.println("Você prefere trabalhar sozinho a trabalhar em equipe?");
        String q6 = kb.nextLine();
        System.out.println("Você é autodidata (aprende sozinho)?");
        String q7 = kb.nextLine();
        System.out.println("Você aceitaria uma remuneração inicial de R$1500?");
        String q8 = kb.nextLine();
        System.out.println("Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH?");
        String q9 = kb.nextLine();
        if (q4.equalsIgnoreCase("sim") && q6.equalsIgnoreCase("nao") && q7.equalsIgnoreCase("sim")
                && q9.equalsIgnoreCase("nao")) {
            condicao1 = true;
        } else {
            condicao1 = false;
        }
        if (q1.equalsIgnoreCase("sim") && q3.equalsIgnoreCase("sim")) {
            condicao2 = true;
        } else {
            condicao2 = false;
        }
        if (q8.equalsIgnoreCase("sim")) {
            salario = "1500";
        } else {
            salario = "O salário deve ser de mais de 1500";
        }
        if (condicao1 == true && condicao2 == true && (salario.equalsIgnoreCase("1500"))) {
            System.out.println("Você é apto para trabalhar na empresa");
        } else if (condicao1 == true && condicao2 == true && (!salario.equalsIgnoreCase("1500"))) {
            System.out.println(
                    "Você é apto a trabalhar na empresa, porém seu salario voce nao aceita receber até R$1500");
        } else {
            System.out.println("Você nao é apto a trabalhar na empresa");
        }
        kb.close();
    }
}
