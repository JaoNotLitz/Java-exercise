public class c08ex25 {
    public static void main(String[] args) {
        String b="*";
        for(int z=1;z<=10;z++){
        for(int a=1;a<=10;a++){
            System.out.println(b.repeat(a));
        }        
        for(int a=10;a>=1;a--){
            System.out.println(b.repeat(a));
      }
    }
  }
}
