package c09;

public class c09ex11A {
    public static void main(String[] args) {
        double num1=0,num2=-6,den=0,tudao=0;
        for (int a = 1; a < 100; a++) {
            num1+=1;
            num2+=7;
            if (den==0){
                den=1;
            }
            else{
            den*=4;
            }

            tudao+=(num1+num2)/den;
        }
        tudao=Math.cbrt(tudao);
        System.out.println(tudao);
    }
}
