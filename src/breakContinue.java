import java.util.Scanner;

public class breakContinue {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        while (true) {
            String text = console.nextLine();
            if (text.equals("exit")) {
                break;
            }
            System.out.println(text);
        }
    }

}
