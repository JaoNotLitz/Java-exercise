import java.util.Scanner;

public class c06ex15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Definir valores das variáveis
        int codigoPacote;
        int qtdDiasPPP;
        double valorServicosExtras;
        String cidade;

        double valorFixo = 0;
        double valorPPP = 0;
        double imposto = 0;

        // Pedir ao usuário as informações
        System.out.println("Digite o código do pacote (1 = Basic, 2 = Advanced, 3 = Premium):");
        codigoPacote = sc.nextInt();

        System.out.println("Digite a quantidade de dias de consumo de canais pay-per-view:");
        qtdDiasPPP = sc.nextInt();

        System.out.println("Digite o valor dos serviços extras:");
        valorServicosExtras = sc.nextDouble();

        System.out.println("Digite a cidade do assinante:");
        cidade = sc.next();

        // Calcular valor fixo e valor PPP de acordo com o pacote contratado
        switch (codigoPacote) {
            case 1:
                valorFixo = 65;
                valorPPP = Math.min(qtdDiasPPP * 1.2, 65); // limitado a 65
                break;
            case 2:
                valorFixo = 104;
                valorPPP = qtdDiasPPP * 2.1;
                break;
            case 3:
                valorFixo = 137;
                valorPPP = 0; // isento
                break;
            default:
                System.out.println("Código de pacote inválido.");
                System.exit(0);
        }

        // Calcular imposto de acordo com a cidade
        switch (cidade) {
            case "Belo Horizonte":
                imposto = 0; // isento
                break;
            case "São Paulo":
                imposto = (valorFixo + valorPPP + valorServicosExtras) * 0.01;
                break;
            case "Rio de Janeiro":
                imposto = (valorFixo + valorPPP + valorServicosExtras) * 0.015;
                break;
            default:
                imposto = (valorFixo + valorPPP + valorServicosExtras) * 0.02;
                break;
        }

        // Calcular valor total da conta
        double valorTotal = valorFixo + valorPPP + valorServicosExtras + imposto;

        // Imprimir resultado
        System.out.println("Valor da conta: R$" + String.format("%.2f", valorTotal));

        sc.close();
    }
}
