public class c08ex23 {
    public static void main(String[] args) {
        int a1,a2,a3,a4,totala=0,counta=0;
        for(int a=1000;a<=9999;a++){
            a4=a%10;
            a3=(a%100)/10;
            a2=(a%1000)/100;
            a1=a/1000;
            if (a1==a4&a2==a3){
                totala+=a;
                counta++;
                System.out.println(a);
            }

        }
        System.out.println(totala/counta);
    }
}
