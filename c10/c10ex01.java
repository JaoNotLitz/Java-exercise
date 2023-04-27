package c10;

import java.util.Scanner;

public class c10ex01 {
    public static void main(String[] args) {
        double multa=0;
        Scanner kb= new Scanner(System.in);
        while(multa!=-1){
            System.out.println( "Qual o valor da multa? ");
            multa=kb.nextDouble();
            if(multa==-1){

            }
            else{
            System.out.println("Sua multa é de "+(multa*0.1));
            }
        }
        kb.close();
    }
}
