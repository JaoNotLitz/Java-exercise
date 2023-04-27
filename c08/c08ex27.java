public class c08ex27 {
    public static void main(String[] args) {
        String b="*";
        double numrep=0;
        for(int z=1;z<=10;z++){
        for(int a=1;a<=8;a++){
            numrep=Math.pow(2, a);
            int numInt = (int) numrep;
            System.out.println(b.repeat(numInt));
        }        
        for(int a=7;a>=1;a--){
            numrep=Math.pow(2, a);
            int numInt = (int) numrep;
            System.out.println(b.repeat(numInt));
        }
    }
    }
}
