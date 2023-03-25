import java.util.Scanner;

import javax.swing.JOptionPane;
public class c05ex02 {
    public static void main(String[] args) {
        double pi, raio, area, volume;
        String medida;
        pi = 3.1416;
        System.out.println("Informe o valor do Raio do círculo: ");
        Scanner teclado = new Scanner(System.in);
        raio = teclado.nextDouble();
        medida = JOptionPane.showInputDialog(null,
        "Digite a abreviação do sistema de medida que está sendo usado.\nExemplo: Metros-> M\nCentímetros-> Cm ");
        area = 4*pi*Math.pow(raio,2);
        volume = (4*pi*Math.pow(raio,3))/3 ;
        JOptionPane.showMessageDialog(null,
        "Área é igual a: "+area+"\nVolume é igual a: "+volume+medida+"³");
        teclado.close();
    }
}
