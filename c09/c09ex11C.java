package c09;

public class c09ex11C {
    public static void main(String[] args) {
        double num1=1,num2=1,den,tudao=0;
        for(int a=1;a<=100;a++){
            num1 +=2;
            num2 +=4;
            den = Math.pow(5, a);
            tudao +=(num1*Math.sqrt(num2))/den;
        }
            System.out.println(tudao*tudao);
    }
}
