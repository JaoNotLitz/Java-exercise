import java.util.Scanner;

import javax.swing.JOptionPane;

public class c04ex05 {
    public static void main(String[] args) {
        String nome, cpf, identidade, titulo, carteira, empresa, salario;
        Scanner arquivo = new Scanner(
                c04ex05.class.getResourceAsStream("nomes.txt"));
        nome = arquivo.nextLine();
        cpf = arquivo.nextLine();
        identidade = arquivo.nextLine();
        titulo = arquivo.nextLine();
        carteira = arquivo.nextLine();
        empresa = arquivo.nextLine();
        salario = arquivo.nextLine();
        JOptionPane.showMessageDialog(null,
                "Ficha funcional de: "+nome
                +"\n\n"
                +"Documentos:\n"
                +"CPF ...................."+cpf+"\n"
                +"C.I ...................."+identidade+"\n"
                +"Título de eleitor ......"+titulo+"\n"
                +"Carteira de motorista .."+carteira+"\n"
                +"\n"
                +"Empresa: "+empresa+"\n"
                +"Salário: R$"+salario,
                "Ficha de "+nome,
                JOptionPane.INFORMATION_MESSAGE);
                System.out.print(Math.PI);        
    }
}
