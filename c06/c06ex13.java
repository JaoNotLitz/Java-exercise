import java.util.Scanner;

public class c06ex13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // leitura das horas e minutos iniciais e finais
        System.out.print("Hora inicial do jogo: ");
        int horaInicial = sc.nextInt();
        System.out.print("Minuto inicial do jogo: ");
        int minutoInicial = sc.nextInt();
        System.out.print("Hora final do jogo: ");
        int horaFinal = sc.nextInt();
        System.out.print("Minuto final do jogo: ");
        int minutoFinal = sc.nextInt();
        
        // cálculo da duração do jogo
        int duracaoHoras, duracaoMinutos;
        if (horaFinal > horaInicial || (horaFinal == horaInicial && minutoFinal >= minutoInicial)) {
            duracaoHoras = horaFinal - horaInicial;
            duracaoMinutos = minutoFinal - minutoInicial;
        } else {
            duracaoHoras = 24 - horaInicial + horaFinal;
            duracaoMinutos = 60 - minutoInicial + minutoFinal;
            if (duracaoMinutos >= 60) {
                duracaoHoras++;
                duracaoMinutos -= 60;
            }
        }
        
        // impressão da duração do jogo
        System.out.printf("O jogo durou %d horas e %d minutos.", duracaoHoras, duracaoMinutos);
        
        sc.close();
    }

}
