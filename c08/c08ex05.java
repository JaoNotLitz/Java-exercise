
import java.util.Scanner;
public class c08ex05 {
    public static void main(String[] args) {
        int votosF,votosC,votosB;
        int codigo;
        votosB = 0;
        votosC = 0;
        votosF = 0;
        Scanner kb = new Scanner(System.in);
        for(int a = 1;a<=100;a++){
            System.out.println("Qual o cógido do candidato que voce quer votar? \n1-Fulano \n2-Ciclano \n3-Beltrano");
            codigo = kb.nextInt();
            if (codigo==1){
                votosF++;
            }
            else if (codigo==2){
                votosC++;
            }
            else {
                votosB++;
            }
        }
        if (votosB>votosC&&votosB>votosF){
            System.out.println("Beltrano é vencedor com "+votosB+" votos.");
        }
        else if (votosC>votosB&&votosC>votosF){
            System.out.println("Celtrano é vencedor com "+votosC+" votos.");
        }
        else {
            System.out.println("Fulano é vencedor com "+votosF+" votos.");
        }
        kb.close();
    }
}
