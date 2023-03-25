import javax.swing.JOptionPane;

public class c04ex04 {
        public static void main(String[] args) {
                String nome1, nome2, sobrenome, idade;
                nome1 = JOptionPane.showInputDialog(null,
                                "Digite seu primeiro nome:",
                                "Aula de Java",
                                JOptionPane.QUESTION_MESSAGE);
                nome2 = JOptionPane.showInputDialog(null,
                                "Digite seu segundo nome:",
                                "Aula de Java",
                                JOptionPane.QUESTION_MESSAGE);
                sobrenome = JOptionPane.showInputDialog(null,
                                "Digite seu sobrenome:",
                                "Aula de Java",
                                JOptionPane.QUESTION_MESSAGE);
                idade = JOptionPane.showInputDialog(null,
                                "Digite sua idade:",
                                "Aula de Java",
                                JOptionPane.QUESTION_MESSAGE);

                JOptionPane.showMessageDialog(null,
                                sobrenome + ", " + nome1 + " " + nome2 + "\n" + "Idade: " + idade + " anos",
                                "Resultado",
                                JOptionPane.INFORMATION_MESSAGE);
        }
}
