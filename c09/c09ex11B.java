package c09;

public class c09ex11B {
    public static void main(String[] args) {
        double num=-2,den=4,tudao=0;
        for(int a=1;a<=100;a++){
            num+=3;
            den+=3;
            tudao+=num/Math.sqrt(den);
        }
        tudao=(5/3.0)*tudao;
        System.out.println(tudao);
    }
}
