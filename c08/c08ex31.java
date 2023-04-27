import java.util.Scanner;

public class c08ex31 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        String nomemaiorpobre=":",cargomaiorpobre=":";
        double minsal=0,adminsal=0,pobre=-1,maiorpobre=0;
        int countmaiorigual=0,countadmin=0,countoutrossalminmais=0;
        System.out.println("Quantidade de pessoas a serem intrevistadas");
        int quantenge=kb.nextInt();
        String profissao=":",nome=":";
        //pergunta do cargo
            for(int a=1;a<=quantenge;a++){
        System.out.println("DIGITE O CODIGO DO TEU TRABALHO, X se nao estiver listado");
        kb.nextLine();
        profissao = kb.nextLine();
        System.out.println("Digite seu nome: ");
        nome = kb.nextLine();
        if (profissao.equalsIgnoreCase("C")) {
            minsal = 2500;
        } else if (profissao.equalsIgnoreCase("P")) {
            minsal = 4650;
        } else if (profissao.equalsIgnoreCase("O")) {
            minsal = 3200;
        } else if (profissao.equalsIgnoreCase("A")) {
            minsal = 5100;
        } else if (profissao.equalsIgnoreCase("X")) {
            System.out.println("DIgite o Salário Mínimo da sua profissão");
            minsal = kb.nextDouble();
        } else {
            System.out.println("PAO DE BATATA");
        }
        System.out.println("Digite o seu salario.");
        double salario = kb.nextDouble();
        
        if (profissao.equalsIgnoreCase("X")) {

        }// a)
         else if (salario < minsal) {
            System.out.println("ABAIXO DO SALÁRIO MÍNIMO");
                
        }// b)
          else {
            countmaiorigual++;
          }
          // d)
          if (profissao.equalsIgnoreCase("X")) {
                if(salario>minsal){
                    countoutrossalminmais++;
                    
                }
        }// c)
         else if (profissao.equalsIgnoreCase("A")) {
           adminsal+=salario;
            countadmin++;
        }
         if(salario<pobre){
            pobre=salario;
            maiorpobre=pobre;
            nomemaiorpobre=nome;
            cargomaiorpobre=profissao;
         }
            }
            System.out.println("B) A quantidade de engenheiros cujo salário está igual ou acima do salário mínimo: "+countmaiorigual);
            System.out.println("C) A média dos salários dos engenheiros de cargo 'Administrador': "+(adminsal/countadmin));
            System.out.println("D) quantidade de engenheiros de cargo 'Outros' e que recebem acima de R$5.000,00: "+countoutrossalminmais);
            System.out.println("E) O nome, salário bruto e cargo (descrição) do engenheiro que recebe o menor salário\nNome: "+nomemaiorpobre+"\nCargo: "+cargomaiorpobre+"\nSalário: "+maiorpobre);
            kb.close();    
        }
}