package c09;

public class c09ex10A {
    public static void main(String[] args) {
        double numerador,denominador,tudao=0;
        for(int a=1;a<=100;a++){
            numerador=a;
            denominador=a*2;
            tudao+=numerador/Math.sqrt(denominador);

        }
        System.out.println(tudao);
    }
}
