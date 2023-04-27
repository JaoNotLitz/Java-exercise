package c09;

public class c09ex13 {
    public static void main(String[] args) {
        double num=1, den, tudao=0,alternar=-1;
        for(int a=1;a<=10;a++){
            num=1;
            for(int b=a;b>=1;b--){
                num*=b;
            }
            alternar*=-1;
            den=Math.pow(2, a)-1;
            tudao+=num/den*alternar;  
        }
        System.out.println(tudao);
    }
}
