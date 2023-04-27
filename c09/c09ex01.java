package c09;

public class c09ex01 {
    public static void main(String[] args) {
        double tudao=0;
        for(int a=0;a<=36;a++){
            
            tudao+=(38.0-a)*(38.0-a-1.0)/(a+1.0);
        }
        System.out.println(tudao);
    }
}
