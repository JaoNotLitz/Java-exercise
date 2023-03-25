import java.util.Scanner;

public class c05ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o número do cheque: ");
        long cheque = teclado.nextLong();
        long banco, agencia, sequencia;
        sequencia = cheque % 1000;
        agencia = (cheque % 1000000) / 1000;
        banco = cheque / 1000000;
        System.out.println("Número do cheque = "+cheque);
        System.out.println("Banco = "+banco);
        System.out.println("Agência = "+agencia);
        System.out.println("Sequencial = "+sequencia);
        teclado.close();
    }
}
