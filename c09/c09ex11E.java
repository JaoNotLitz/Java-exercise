package c09;

public class c09ex11E {
    public static void main(String[] args) {
        double num1,num2=3,den1,den2,tudao=0;
        for(int a=1;a<=100;a++){
            num1=Math.pow(a, 2);
            num2+=2;
            den1=a+1;
            den2=a;
            tudao+=(num1*Math.sqrt(num2))/(Math.pow(den1, den2));
        }
        System.out.println((2/3.0)*tudao);
    }
}
