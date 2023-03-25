import java.util.Scanner;

public class c04ex01 {
    public static void main(String[] args) {
        String primeiro_nome, segundo_nome, sobrenome;
        int idade;
        System.out.print("Qual seu primeiro nome? ");
        Scanner teclado = new Scanner(System.in);
        primeiro_nome = teclado.nextLine();
        System.out.print("Qual seu segundo nome? ");
        segundo_nome = teclado.nextLine();
        System.out.print("Qual seu sobrenome? ");
        sobrenome = teclado.nextLine();
        System.out.print("Qual tua idade? Apenas em números, por favor. ");
        idade = teclado.nextInt();
        System.out.println(sobrenome + ", " + primeiro_nome + " " + segundo_nome);
        System.out.println();
        System.out.println("Idade: " + idade + " anos");
        teclado.close();
    }
}