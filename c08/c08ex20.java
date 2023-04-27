public class c08ex20 {
    public static void main(String[] args) {
        double b=1,c=1;
        for(int a=0;a<=99;a++){
            b=Math.pow(2, a);
            c+=b;
            System.out.println(b);
        }
        System.out.println("Soma é: "+c);
    }
}
