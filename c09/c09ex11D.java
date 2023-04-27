package c09;


public class c09ex11D {
    public static void main(String[] args) {
        double num,den,dencount=0,tudao=0;
        for(int a=1;a<=100;a++){
            num=Math.pow(a, 3);
            if(dencount==0){
                den=1;
                dencount=1;
            }
            else{
                den=Math.pow(10, a-1);
            }
            tudao+=num/den;
            
        }
        System.out.println(tudao);
    }
}
