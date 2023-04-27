import java.util.Scanner;
public class c08ex07 {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            int idade,idade12=0,idade30=0;
            double medidade=0;
            int a;
            System.out.println("Digite qualquer numero para iniciar o programa");
            kb.nextInt();
            for(a=1;a<=5;a++){
                System.out.println("Qual seu nome? ");
                kb.nextLine();
                kb.nextLine();
                System.out.println("Qual sua idade? ");
                idade = kb.nextInt();
                if (idade==0){
                    break;
                }
                medidade+=idade;
                if(idade<=12){
                    idade12++;
                }
                else{
                    idade30++;
                }
            }        
            medidade = medidade/(a-1);
            System.out.println("A média das idades é: "+medidade+" qntd idade <=12 é "+idade12+" qntd idade maior que 30 é: "+idade30);
            kb.close();
        }
    }
}