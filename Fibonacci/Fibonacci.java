import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int temp;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int count = 2;
        int num = in.nextInt();
        while(count <= num){
            temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
