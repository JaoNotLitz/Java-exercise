import java.util.Scanner;
public class c08ex15 {
    public static void main(String[] args) {
        String nome="teste", cargo="testec",maxnome="Testezao",maxcargo="yametekudassai";
        double salario=0,media18sal=0,maxsalario=0;
        int idade=0,count18sal=0;
        Scanner arquivo = new Scanner(
                c04ex05.class.getResourceAsStream("import.txt"));
        for(int a=1;a<=4;a++){     
        nome = arquivo.nextLine();
        cargo = arquivo.nextLine();
        salario = arquivo.nextDouble();
        idade = arquivo.nextInt();
        arquivo.nextLine();
            if(salario>10000&&idade>50){
                System.out.println("O(a) "+nome+ " é Sênior (Fino Senhores)");
            }
            if(idade<=18){
                count18sal++;
                media18sal+=salario;
            }
            if(a==1||salario>maxsalario){
                maxsalario=salario;
                maxnome=nome;
                maxcargo=cargo;
            }
    }
    System.out.println("O salário médio dos sub 18 é: "+(media18sal=(media18sal/count18sal)));
    System.out.println("o nome maximo é: "+maxnome+", ele é "+maxcargo);
}
}
