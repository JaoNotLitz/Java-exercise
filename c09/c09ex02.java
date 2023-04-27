package c09;

public class c09ex02 {
    public static void main(String[] args) {
        double numerador=0,denominador=0,tudao=0;
        for(int a=1;a<=100;a++){
            numerador=a;
            denominador=((Math.pow(a, 2))+(a-1));
            tudao+=numerador/denominador;
        }
        System.out.println(tudao);
    }
}
