import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // long a = 25;
            // int b = a;
            // AVOID LOSSY CONVERSION
            int a = 25;
            long b = a;
            System.out.println(b);

            // int number = sc.nextFloat(); (NOT POSSIBLE)
            float number = sc.nextInt();
            System.out.println(number);

        }
    }
}