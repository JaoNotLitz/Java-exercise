package c09;

public class c09ex11F {
    public static void main(String[] args) {
    double num1=-1,num2=2,den1=-3,tudao=0;
    for(int a=1;a<=100;a++){
        num1+=2;
        num2*=2;
        den1+=5;
        tudao+=(num1*num2)/Math.pow(den1, 2);
    }
    System.out.println(5*Math.sqrt(tudao));
  }
}
