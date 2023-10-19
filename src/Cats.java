import java.util.Scanner;

public class Cats {

    String name;
    int age;

    public Cats(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Cats(String name) {
        this.name = name;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        Cats Barsik = new Cats("Barsik", 5);
        Cats streetscatnameBob = new Cats("Bob");
        System.out.println(streetscatnameBob);
    }
}
