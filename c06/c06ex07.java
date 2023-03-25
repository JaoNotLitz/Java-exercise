import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class c06ex07 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Qual o valor do seu salário");
        double salario = kb.nextDouble();
        double plbruto;
        double percent;
        if (salario <= 300){
            percent = 70/100.0*salario;
            plbruto = 500+percent;
            
        }
        else if (salario<=1000){
            percent = 50/100.0*salario;
            plbruto = 200+percent;
        }
        else {
            percent = 70/100.0*salario;
            plbruto = percent;
        }
        double imposto = plbruto*25/100.0;
        double pliq = plbruto - imposto; 
        DecimalFormat df = new DecimalFormat("#.##"); // Definindo o formato para duas casas decimais
        df.setRoundingMode(RoundingMode.DOWN); // Definindo o modo de arredondamento como "para baixo"
 
        String result = df.format(pliq); // Formata o número
        System.out.println("A participação nos lucros líquido será de: "+result);
        kb.close();
    }
} 

