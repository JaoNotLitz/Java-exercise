
import java.util.Scanner;

public class c08ex08 {
    public static void main(String[] args) {
        double nota=0,media=0.0;
        int falta=0,a,batata=0,faltacount=0;
        Scanner kb = new Scanner(System.in);
        for (a=1;a<=3;a++){
            System.out.println("Coloque o valor da nota do aluno "+a+":");
            nota = kb.nextDouble();
            System.out.println("digite a quantidade de faltas: ");
            falta=kb.nextInt();
                if(falta>16){
                    faltacount++;
                }
                if (falta<17&nota>64){
                    System.out.println("Aprovado!");
                    media+=nota;
                    batata++;
                }
                else {
                    System.out.println("Reprovado.");
                }  
            }
        kb.close();
        media=nota/batata;
        System.out.println("Média da nota dos alunos: "+media);
        System.out.println("Quantidade de alunos com mais de 16 faltas: "+faltacount);
    }
    }
