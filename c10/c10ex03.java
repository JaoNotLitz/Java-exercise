package c10;

import java.util.Scanner;

public class c10ex03 {
    public static void main(String[] args) {
        double angulo=0,raio=0,solução;
        Scanner kb = new Scanner(System.in);
        System.out.println("Digite o valor do Ângulo: ");
        angulo=kb.nextDouble();
        while(raio!=-1){
            System.out.println("Digite o valor do raio");
            raio=kb.nextDouble();
            if(raio==-1){

            }
            else{
                solução=(angulo*3.1416*Math.pow(raio, 2))/360;
                System.out.println(solução);
            }
        }
        kb.close();
    }
}
