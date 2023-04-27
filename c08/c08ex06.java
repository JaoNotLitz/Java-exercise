import java.util.Scanner;

public class c08ex06 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numint;
        int div3 = 0;
        int soma4 = 0;
        for (int a=1;a<=10;a++){
            System.out.println("Digite um número inteiro:");
            numint = kb.nextInt();
            if (numint%2==0){
                System.out.println("Número par");
            }
            else{
                System.out.println("Número ímpar");
            }
            if (numint%3==0){
                div3++;
            }
            if (numint%4==0){
                soma4+=numint;}
            
        }
        System.out.println("Soma num div4: "+soma4+"\nSoma div3 :"+div3);
        kb.close();
    }
}
