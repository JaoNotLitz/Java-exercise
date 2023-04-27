package c10;

import java.util.Scanner;

public class c10ex05 {
    public static void main(String[] args) {
        int a=1,counth=0,countf=0,countpessoas=0;
        double altura=0,peso=0,alturatotalhomens=0,quantmulhermenorque60kg=0;
        System.out.println("Digite 0 para parar a pesquisa na informação peso");
        String sexo="";
        Scanner kb = new Scanner(System.in);
        while(a!=0){
            System.out.println("Digite seu peso, caso queira parar o programa digite 0");
            peso=kb.nextDouble();
            if(peso==0){
                break;
            }
            System.out.println("Digite sua altura");
            altura=kb.nextDouble(); 
            System.out.println("Digite seu sexo ");
            kb.nextLine();
            sexo=kb.nextLine();
            countpessoas++;
            if(sexo.equalsIgnoreCase("M")){
                counth++;
                alturatotalhomens+=altura;
            }else if(sexo.equalsIgnoreCase("F")){
                if(peso<60){
                    quantmulhermenorque60kg++;
                }
                countf++;   
            }
            
        }
        System.out.println(countpessoas);
            System.out.println(countf);
            System.out.println(alturatotalhomens/counth);
            System.out.println(quantmulhermenorque60kg);
        kb.close();
    }
}
