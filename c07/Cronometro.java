import java.util.Scanner;
public class Cronometro {
    public static void main(String[] args) {
        long a,s,m,h;
        s=-1;
        m=0;
        h=0;
        a=1;
        Scanner kb = new Scanner(System.in);
        System.out.print("Aperte Enter para começar o cronômetro");
        kb.nextLine();
        while (a==1){
            s++;
            System.out.printf("%02d:%02d:%02d", h,m,s);
            System.out.println();
            try {
                Thread.sleep(1000); 
            }
            catch (InterruptedException e) {}
            if (s==59){
            s=-1;
            m++;
            }
            if (m==60){
            m=0;
            h++;
            }
        }
    }
}
