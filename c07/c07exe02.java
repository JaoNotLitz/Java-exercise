import java.util.Scanner;

public class c07exe02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // valores das carnes na promoção
        double preco = 0.0;
        double precoFinal = 0.0;
        String tipoCarne = "";

        // solicita o tipo de carne e a quantidade ao usuário
        System.out.print("Informe o tipo de carne desejado (F - File Duplo, A - Alcatra, P - Picanha): ");
        String tipo = scanner.nextLine().toUpperCase();

        System.out.print("Informe a quantidade em kg: ");
        double quantidade = scanner.nextDouble();

        // define o preço e o tipo da carne escolhida
        switch (tipo) {
            case "F":
                tipoCarne = "File Duplo";
                if (quantidade <= 5.0) {
                    preco = 4.9;
                } else {
                    preco = 5.8;
                }
                break;
            case "A":
                tipoCarne = "Alcatra";
                if (quantidade <= 5.0) {
                    preco = 5.9;
                } else {
                    preco = 6.8;
                }
                break;
            case "P":
                tipoCarne = "Picanha";
                if (quantidade <= 5.0) {
                    preco = 6.9;
                } else {
                    preco = 7.8;
                }
                break;
            default:
                System.out.println("Tipo de carne inválido.");
                System.exit(0);
        }

        // calcula o preço final com desconto se for pagamento com cartão Tabajara
        System.out.print("Pagamento com cartão Tabajara (S/N)? ");
        scanner.nextLine(); // consome a quebra de linha pendente
        String cartaoTabajara = scanner.nextLine().toUpperCase();

        if (cartaoTabajara.equals("S")) {
            double valorDesconto = preco * quantidade * 0.05;
            precoFinal = preco * quantidade - valorDesconto;
            System.out.printf("Desconto: R$%.2f%n", valorDesconto);
        } else {
            precoFinal = preco * quantidade;
        }

        // exibe o cupom fiscal com as informações da compra
        System.out.println("----- Cupom Fiscal -----");
        System.out.printf("Tipo de carne: %s%n", tipoCarne);
        System.out.printf("Quantidade: %.2f kg%n", quantidade);
        System.out.printf("Preço por kg: R$%.2f%n", preco);
        System.out.printf("Preço final: R$%.2f%n", precoFinal);
        System.out.printf("Tipo de pagamento: %s%n", cartaoTabajara.equals("S") ? "Cartão Tabajara" : "Outro cartão");

        scanner.close();
    }
}
