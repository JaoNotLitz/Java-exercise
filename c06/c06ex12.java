import java.util.Scanner;
public class c06ex12 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Produção total de bolas");
        int totalbolas = kb.nextInt();

        System.out.println("Preço unitário por caixa de papelão");
        double precounitpapelao = kb.nextDouble();

        System.out.println("Meses para a copa");
        int meses = kb.nextInt();

        System.out.println("Bolas com defeito");
        int defeito = kb.nextInt();

        System.out.println("Aluguel mensal");
        double aluguel = kb.nextDouble();

        int bolasuteis = totalbolas - defeito;
        int quantpapelao;
if (bolasuteis % 10 == 0) {
    quantpapelao = bolasuteis / 10;
} else {
    quantpapelao = (bolasuteis+9)/10;
}

        int quantgalpao = 850/quantpapelao;
        double precopapelao = quantpapelao*precounitpapelao;
        double precoaluguel = aluguel*meses*quantgalpao;
        double custototal = precoaluguel+precopapelao;
        System.out.println(custototal);
        kb.close();
    }
}