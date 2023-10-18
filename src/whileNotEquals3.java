import java.util.Scanner;

public class whileNotEquals3 {
public static void main(String[] args) {
    int x = 1;
    int sum = 0;
    while (x <=100)
    {
        if ((x % 3) == 0)
        {
            x++;
            continue;
        }
        sum = sum + x;
        x++;
    }
    System.out.println(sum);
  }
}
