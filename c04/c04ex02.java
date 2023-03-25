import java.util.Scanner;

public class c04ex02 {
    public static void main(String[] args) {
       //aqui eu declaro as variaveis
        String nome, cpf, identidade, nomeEmpresa;
        long titulo_eleitor, cart_motorista;
        float salario;
        //aqui eu pergunto os dados ao usuario
        System.out.print("Qual seu nome? ");
        Scanner teclado = new Scanner(System.in);
        nome = teclado.nextLine();
        System.out.print("Qual seu CPF formatado no padrão 000.000.000-00? ");
        cpf= teclado.nextLine();
        System.out.print("Qual sua identidade? ");
        identidade = teclado.nextLine();
        System.out.print("Em qual empresa você trabalha? ");
        nomeEmpresa = teclado.nextLine();
        System.out.print("Qual seu salário? ");
        salario = teclado.nextFloat();
        teclado.nextLine();
        System.out.print("Qual seu título de eleitor? ");
        titulo_eleitor = teclado.nextLong();
        System.out.print("Qual sua carteira de motorista? ");
        cart_motorista = teclado.nextLong();
        //A seguir os dados serão exibidos na tela
        System.out.println("FICHA FUNCIONAL DE: "+ nome);
        System.out.println();
        System.out.println("Documentos:");
        System.out.println("CPF ....................."+ cpf);
        System.out.println("C.I. ...................."+ identidade);
        System.out.println("Titulo de eleitor ......."+ titulo_eleitor);
        System.out.println("Carteira de motorista ..."+ cart_motorista);
        System.out.println();
        System.out.println("Empresa: "+nomeEmpresa);
        System.out.println("Salario: R$"+salario);
        teclado.close();
    }

}
