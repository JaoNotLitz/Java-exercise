import java.util.Scanner;

public class c08ex21 {
    public static void main(String[] args) {
        System.out.println("Qual sua altura? ");
        Scanner kb = new Scanner(System.in);
        double altura = kb.nextDouble();
        double imc;
        String info;
        for(int a=60;a<=100;a++){
            imc=a/(altura*altura);
            if (imc<20){
                info="Abaixo do peso";
            }
            else if (imc<25){
                info="Peso ideal";
            }
            else{
                info="Acima do peso";
            }
            System.out.printf("\nSe o peso é %d O imc é: %.2f, e ele está %s",a, imc,info);
            //System.out.println(a/(altura*altura));
        }
        kb.close();
    }
}
