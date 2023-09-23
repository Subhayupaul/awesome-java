public class large3number {
    public static void main(String[] args) {
        int a = 10, b = 3, c = 6;

        if ((a>=b)&&(a>=c)){
            System.out.println("The largest number is: " +a);
        } else if (b>=c){
            System.out.println("The largest number is: " +b);
        } else {
            System.out.println("The largest number is: " +c);
        }
    }
}
