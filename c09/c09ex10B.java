package c09;

public class c09ex10B {
    public static void main(String[] args) {
        double numerador=0,denominador=0,tudao=0;
        for (int a=1;a<=100;a++){
            numerador+=2;
            denominador+=3;
            tudao+=numerador/denominador;            
        }
        System.out.println(1+Math.sqrt(tudao));
    }
}
