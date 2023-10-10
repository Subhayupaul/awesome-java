package Loops;

public class Reverse_number {
    public static void main(String[] args) {
        int n = 26072004;
        while(n>0){
            int lastdigit=n%10;
            System.out.print(lastdigit+" ");
            n/=10;
        }
        System.out.println();
    }
}
