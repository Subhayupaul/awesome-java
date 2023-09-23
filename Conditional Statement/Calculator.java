import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first value: ");
        int a = sc.nextInt();
        System.out.println("Second valur: ");
        int b = sc.nextInt();
        System.out.println("operator: ");
        char operator = sc.next().charAt(0);

        System.out.println("Your Answer is: ");
        switch(operator){
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '/':System.out.println(a/b);
            break;
            case '%':System.out.println(a%b);
            break;
            default:System.out.println("I don't know");
        }
    }
}
