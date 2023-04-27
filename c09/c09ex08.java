package c09;

public class c09ex08 {
    public static void main(String[] args) {
        double numerador1=1,numerador2=1,denominador,tudao=0;
        for(int a=1;a<=20;a++){
            numerador1+=2;
            numerador2+=4;
            denominador=Math.pow(5, a);
            tudao+=(numerador1*Math.sqrt(numerador2))/denominador;
        }
        System.out.println(Math.pow(tudao, 2));
    }
}
