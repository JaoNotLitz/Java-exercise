import java.util.Scanner;

public class c06ex16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Leitura das faltas
        System.out.print("Digite o número de faltas: ");
        int faltas = sc.nextInt();

        // Leitura das notas das provas
        System.out.print("Digite a nota da primeira prova: ");
        double prova1 = sc.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
        double prova2 = sc.nextDouble();
        System.out.print("Digite a nota da terceira prova: ");
        double prova3 = sc.nextDouble();

        // Cálculo da média das duas maiores notas das provas
        double mediaProvas = (prova1 + prova2 + prova3
                - Math.min(prova1, Math.min(prova2, prova3))) / 2.0;

        // Leitura da nota do trabalho final
        System.out.print("Digite a nota do trabalho final: ");
        double trabalhoFinal = sc.nextDouble();

        // Leitura da idade do aluno
        System.out.print("Digite a idade do aluno: ");
        int idade = sc.nextInt();

        // Cálculo do peso das faltas
        int pesoFaltas;
        if (faltas <= 5) {
            pesoFaltas = 3;
        } else if (faltas <= 10) {
            pesoFaltas = 2;
        } else {
            pesoFaltas = 1;
        }

        // Cálculo do peso da idade
        int pesoIdade;
        if (idade <= 17) {
            pesoIdade = 1;
        } else if (idade <= 50) {
            pesoIdade = 2;
        } else {
            pesoIdade = 3;
        }

        // Cálculo da nota final
        double notaFinal = mediaProvas * pesoFaltas + trabalhoFinal * pesoIdade;

        // Impressão do resultado final
        System.out.print("O resultado final é: " + notaFinal + ". ");

        // Classificação do resultado final
        if (notaFinal <= 50.0) {
            System.out.println("Reprovado");
        } else if (notaFinal <= 70.0) {
            System.out.println("Regular");
        } else if (notaFinal <= 80.0) {
            System.out.println("Bom");
        } else if (notaFinal <= 90.0) {
            System.out.println("Muito Bom");
        } else {
            System.out.println("Excelente");
        }

        sc.close();
    }

}
