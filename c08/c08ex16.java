public class c08ex16 {
    public static void main(String[] args) {
        int count = 0, numsoma = 0;
        for (int a = 1001; a <= 2000; a++) {
            if (a % 2 != 0) {
                numsoma += a;
                count++;
            }
        }
        System.out.println(numsoma / count);
    }
}