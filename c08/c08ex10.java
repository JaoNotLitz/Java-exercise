import java.util.Scanner;

public class c08ex10 {
 public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("qual o numero de insumos");
    int insumo = kb.nextInt();
    double totalpreco=0,preco,precorecord=0,media;
    String prodrecord="";
        for (int a=1;a<=insumo;a++){
         System.out.println("Qual o insumo?");
         kb.nextLine();
         String Vinsumo = kb.nextLine();
         System.out.println("qual a quantidade? ");
         int quant = kb.nextInt();
         System.out.println("qual o preço unitario");
         float precoprodut = kb.nextFloat();
         preco=precoprodut*quant;            
         totalpreco+=preco;

        if (a==1||precorecord<preco){
            precorecord=preco;
            prodrecord=Vinsumo;

        }
    }
    media=totalpreco/insumo;
    System.out.println("O insumo mais caro é "+prodrecord);
    System.out.println("A média do preço é "+media);
    System.out.println("O custo total do projeto é "+totalpreco);
    kb.close();
 }
}