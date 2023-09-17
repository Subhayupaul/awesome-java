import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float a = 25.129999f;
            // int b = a; (NOT POSSIBLE)
            int b = (int) a;
            System.out.println(b);
        }
     //   char ch = 'a';
        char ch2 = 'b';
      //  int number = ch;
        int number2 = ch2;
        System.out.println(number2);

    }
}