package c09;

public class c09ex06 {
    public static void main(String[] args) {
        double num, den,tudao=0;
        for(int a=1;a<=20;a++){
            num=a;
            den=Math.sqrt(2*a);
            tudao+=num/den;

        }
        System.out.println(10+tudao);
    }
}
