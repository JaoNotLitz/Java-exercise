package c10;

import java.util.Scanner;

public class c10ex08 {
    public static void main(String[] args) {
        String cidade="",nomemenorpopulacao="";
        int counttotalcity = 0,cidademaismulher=0;
        double populacao,eleitores,homens,mulheres,totalpopulacao = 0,totaleleitores = 0,totalhomens=0,menorpopulacao = 0;
        Scanner kb = new Scanner(System.in);
     do{
        System.out.println("Digite a cidade");
        cidade=kb.nextLine();
        System.out.println("Digite a populacao");
        populacao=kb.nextDouble();
        System.out.println("Digite a eleitores");
        eleitores=kb.nextDouble();
        System.out.println("Digite a homens");
        homens=kb.nextDouble();
        System.out.println("Digite a mulheres");
        mulheres=kb.nextDouble();
       //a
       if(homens+mulheres<populacao){
        System.out.println("A cidade "+cidade+" tem número de habitantes incombatentes com dados");
       }
       //b
       counttotalcity++;
       //c
       totalpopulacao+=populacao;
       //d-parte 1
       totaleleitores+=eleitores;
       //e
       if(mulheres>homens){
        cidademaismulher++;
       }
       //f
       totalhomens+=homens;
       if(populacao<menorpopulacao){
        menorpopulacao=populacao;
        nomemenorpopulacao=cidade;
       }
     }
     while(!cidade.equalsIgnoreCase("Zimbabue de Minas"));
     System.out.println("A quantidade total de cidade " + cidade);
     System.out.println("A população total do estado é"+totalpopulacao);
     System.out.println("o percentual de eleitores " + ((totaleleitores/totalpopulacao)*100)+"%");
     System.out.println("a quantidade de cidades em que há mais mulheres do que homens é: "+cidademaismulher);
     System.out.println("a média de homens(em relação a todas as cidades): "+totalhomens/counttotalcity);  
     System.out.println("o estado com menor população é: "+nomemenorpopulacao);
     kb.close();
    }
}
