import java.util.Scanner;

public class c07ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual seu time?");
        String time = teclado.nextLine();
        switch (time) {
            case "America":
            case "Atletico":
            case "Cruzeiro":
            case "Vila Nova": {
                System.out.println("Minas Gerais");
            }
                break;
            case "Botafogo", "Flamengo", "Fluminense", "Vasco": {
                System.out.println("Rio de Janeiro");
            }
                break;
            case "Corinthians", "Palmeiras", "Santos", "Sao Paulo": {
                System.out.println("São Paulo");
            }
                break;
            case "Gremio", "Internacional", "Juventude": {
                System.out.println("Rio Grande do Sul");
            }
                break;
            case "Nautico", "Santa Cruz", "Sport": {
                System.out.println("Pernambuco");
            }
                break;

        }
        teclado.close();
    }
}
