package c09;

public class c09ex05 {
    public static void main(String[] args) {
        double num, den=1, numpart1=-2 , numpart2=0 ,tudao=0;
        for (int a=1; a<=10; a++) {
           numpart1 +=2;
           numpart2 +=3;
           num = numpart1+numpart2;                                                                               ;
           den +=6                                                                            ;
           tudao += num / den;
  
        }
        System.out.println(5*tudao);
    }
}
