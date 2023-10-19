import java.util.Scanner;

public class calculatorRush {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        int x;
        String check;
        while (true) {
            if (console.hasNextInt()) {
                x = console.nextInt();
                sum += x;
            }
            if (console.hasNextLine()) {
                check = console.nextLine();
                if (check.equals("E")) break;
            }
        }
        System.out.println(sum);

        }

    }

