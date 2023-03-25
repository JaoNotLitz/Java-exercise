import java.util.Scanner;
public class c06ex09 {
    public static void main(String[] args) {
        String sex;
        System.out.println("Seu sexo, em M para masculino e F para feminino");
        Scanner kb = new Scanner(System.in);
        sex = kb.nextLine();
        System.out.println("Sua altura em metros");
        float altura = kb.nextFloat();
        if (sex.equalsIgnoreCase("M")){
           Double peso = 72.7*altura-58;
           System.out.printf("Seu peso ideal é de: %.2f",peso);
        }
        else if (sex.equalsIgnoreCase("F")){
            Double peso = 62.1*altura-44.7;
            System.out.printf("Seu peso ideal é de: %.2f",peso);
        }
        else{
            System.out.println("Insira seu sexo corretamente, no formato M->Masculino,F->Feminino");
        }
        kb.close();
    }
}
