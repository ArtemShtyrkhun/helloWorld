import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String string = console.nextLine();
        int number = console.nextInt();

        do {
            System.out.println(string);
            number--;
        } while (number > 0 && number < 4);
    }

}
