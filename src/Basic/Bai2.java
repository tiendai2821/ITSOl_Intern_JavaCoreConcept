package Basic;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number = 0;
        for (int i = 1; i<=n; i++){
            if( n% i == 0){
                System.out.print(i+" ");
                number++;
            }
        }
        System.out.println(number);
    }
}
