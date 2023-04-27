import javax.swing.JOptionPane;

public class c08ex11 {
    public static void main(String[] args) {
        String nome, salario, nomeMax="", nomeMin="teste";
        double maxSalario = 0, minSalario = 0;
        int idade, sexo, estadocivil, corolho, escolaridade, corcabelo, countMulherIdeal = 0;
        for (int a = 1; a <= 50; a++) {
            nome = JOptionPane.showInputDialog(null,
                    "Digite seu nome:",
                    "Aula de Java",
                    JOptionPane.QUESTION_MESSAGE);
            String[] options = { "Tenho entre 18 e 25 anos", "Não tenho" };
            idade = JOptionPane.showOptionDialog(null,
                    "Qual sua idade:",
                    "Confirmação",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[1]);
            String[] options2 = { "Masculino", "Feminino" };
            sexo = JOptionPane.showOptionDialog(null,
                    "Qual seu sexo:",
                    "Confirmação",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options2,
                    options2[1]);
            String[] options3 = { "Solteiro(a)", "Casado(a?)", "Outro" };
            estadocivil = JOptionPane.showOptionDialog(null,
                    "Qual seu estado civil:",
                    "Confirmação",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options3,
                    options3[2]);
            String[] options4 = { "Azul", "Castanho", "Preto", "Outro" };
            corolho = JOptionPane.showOptionDialog(null,
                    "Qual a cor dos seus olhos:",
                    "Confirmação",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options4,
                    options4[3]);
            String[] options5 = { "Loiro", "Preto", "Castanho", "Ruivo" };
            corcabelo = JOptionPane.showOptionDialog(null,
                    "Cor do seu cabelo:",
                    "Confirmação",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options5,
                    options5[3]);
            salario = JOptionPane.showInputDialog(null,
                    "Digite seu salário:",
                    "Aula de Java",
                    JOptionPane.QUESTION_MESSAGE);
            String[] options6 = { "Presidente(analfabeto)", "Ensino Fundamental", "Ensino Médio", "Ensino Superior" };
            escolaridade = JOptionPane.showOptionDialog(null,
                    "Qual sua escolaridade:",
                    "Confirmação",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options6,
                    options6[3]);

            double numberSalario = Double.parseDouble(salario);
            if ((a == 1 || maxSalario < numberSalario)&sexo==0) {
                maxSalario = numberSalario;
                nomeMax = nome;
            }
            if ((a == 1 || numberSalario < minSalario)&sexo==0) {
                minSalario = numberSalario;
                nomeMin = nome;
            }
            if (corcabelo == 0 && corolho == 0 && idade == 0 && estadocivil == 0 && numberSalario > 10000 && escolaridade == 3&sexo==1) {
                countMulherIdeal++;
            }

        }
        System.out.println("temos um total de "+countMulherIdeal+" mulheres ideais");
        System.out.println("A pessoa com o maior salario é: "+nomeMax+"\nE a pessoa com o MENOR salário é: "+nomeMin);
        System.out.println("A diferença entre o maior salario e o menor salário é de "+(maxSalario-minSalario));
    }
}
