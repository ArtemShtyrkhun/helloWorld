import java.util.Scanner;
public class helloWorld {
        private static final String TRIANGLE_EXISTS = "трикутник існує";
        private static final String TRIANGLE_NOT_EXISTS = "трикутник не існує";

        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            int a = console.nextInt();
            int b = console.nextInt();
            int c = console.nextInt();
            if (a < b+c && b < a+c && c < b+a)
                System.out.println(TRIANGLE_EXISTS);
            else
                System.out.println(TRIANGLE_NOT_EXISTS);


            //напишіть тут ваш код
        }
    }

