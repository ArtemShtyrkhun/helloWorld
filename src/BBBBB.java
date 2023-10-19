public class BBBBB {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 5) {
            int m = 1;
            while (m <= 20) {
                if ((n == 1) || (n == 5)) {
                    System.out.print("B");
                } else if ((m == 1) || (m == 10) || (m == 20)) {
                    System.out.print("B");
                }else {
                    System.out.print(" ");
                }
                m++;
            }
            System.out.println();
            n++;
        }
    }
}
