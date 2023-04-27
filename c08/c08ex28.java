public class c08ex28 {
    public static void main(String[] args) {
        int trem=1,tremtodo=0,contadordotrem=0;
        for(int a=1;a<=9;a++){
            trem= a*(a+1)*(a+2);
            System.out.println(trem);
            tremtodo+=trem;
            contadordotrem++;
        }
        System.out.println(tremtodo/contadordotrem);
    }
}