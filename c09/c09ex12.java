package c09;

public class c09ex12 {
    public static void main(String[] args) {
        double den,tudao=0;
        for(int a=1;a<=10000;a++){
            den=a+2;
            den=den*-1;
            tudao+=1/den;
        }
        System.out.println(4*(1+tudao));
    }
}
//errado