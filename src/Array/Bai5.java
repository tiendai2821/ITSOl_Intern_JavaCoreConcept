package Array;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];


        for(int i = 0; i<n; i++){
            a[i] =scanner.nextInt();
        }
        int m = scanner.nextInt();
        int [] b = new int[m];
        for(int i = 0; i<m; i++){
            b[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        for(int i = 0; i<k; i++){
            System.out.print(a[i] +" ");
        }
        for(int i = 0; i<m; i++){
            System.out.print(b[i] +" ");
        }
        for(int i = k; i<n; i++){
            System.out.print(a[i] +" ");
        }
    }
}
