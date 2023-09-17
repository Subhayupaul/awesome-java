import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Float price = sc.nextFloat();
            System.out.println(price);
        }

        // String name = sc.nextLine();
        // System.out.println(name);

        // int number = sc.nextInt();
        // System.out.println(number);

    }
}
