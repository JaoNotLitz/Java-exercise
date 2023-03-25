import java.util.Scanner;

public class c06ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a altura da pessoa (em metros): ");
        double altura = scanner.nextDouble();
        
        System.out.print("Digite o peso da pessoa (em kg): ");
        double peso = scanner.nextDouble();
        
        double imc = peso / (altura * altura);
        String situacao = "";
        if (imc < 18) {
            situacao = "desnutrida";
        } else if (imc < 20) {
            situacao = "abaixo do peso";
        } else if (imc < 25) {
            situacao = "no peso ideal";
        } else if (imc < 27) {
            situacao = "acima do peso";
        } else {
            situacao = "obesa";
        }
        
        System.out.print(nome + ", seu IMC é ");
        System.out.printf("%.2f", imc);
        System.out.print(" e você está " + situacao + ".");
        
        scanner.close();
    }
}
