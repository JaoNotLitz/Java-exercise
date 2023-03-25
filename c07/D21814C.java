//João Gabriel Ribeiro Holanda
import java.util.Scanner;
public class D21814C {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Qual seu RA(Registro Academico)?");
        int registro = kb.nextInt();
        System.out.println("Qual a quantidade de cópias de Xerox solicitadas por você? ");
        int xerox = kb.nextInt();
        System.out.println("Qual o valor total de produtos adquiridos por você? ");
        double produtos = kb.nextDouble();
        kb.nextLine();
        System.out.println("Você possui Bolsa de Estudos? ");
        String bolsa =kb.nextLine();
        int codigo =(registro/10000);
        double mensalidade;
        double bolsapercent;
        double precoxerox;
        if (codigo==1){
            if (bolsa.equalsIgnoreCase("sim")){
                bolsapercent=5/100.0;
            }
            else{
                bolsapercent=0;
            }
            mensalidade = 1200-(bolsapercent*1200);
     }
     else if (codigo == 2) {
        if (bolsa.equalsIgnoreCase("sim")){
            bolsapercent=510/100.0;
        }
        else{
            bolsapercent=0;
        }
        mensalidade = 1350-(bolsapercent*1350);
     }
     else if (codigo == 3){
        if (bolsa.equalsIgnoreCase("sim")){
            bolsapercent=15/100.0;
        }
        else{
            bolsapercent=0;
        }
        mensalidade = 2100-(bolsapercent*2100);
     }
      else {
        if (bolsa.equalsIgnoreCase("sim")){
            bolsapercent=30/100.0;
        }
        else{
            bolsapercent=0;
        }
        mensalidade = 3200-(bolsapercent*3200);
      }
      if (xerox<50){
        precoxerox = xerox*0.09;
      }
      else if (xerox<500){
        precoxerox = xerox*0.08;
      }
      else {
        precoxerox = xerox*0.06;
      }
      double valorboleto = mensalidade +precoxerox+produtos;
      System.out.printf("O valor do Boleto é de: %.2f",valorboleto);
      kb.close();
    }
}
