
public class c08ex24 {
    public static void main(String[] args) {
        double x=0,y=0;
        for(int a = 1;a<=99;a+=2){
         x =(Math.pow(2.0, a));
         y+=x;
        }
        y=1/3.0*y;
        System.out.println(y);
    }
}
