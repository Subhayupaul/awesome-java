package Loops;

import java.util.Scanner;

public class print1to_n {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int range = sc.nextInt();
            int counter = 1;

            while(counter <= range){
                System.out.print(counter+" ");
                counter++;
            }
        }
        System.out.println();
    }
}
