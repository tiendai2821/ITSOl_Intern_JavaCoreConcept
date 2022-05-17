package Array;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int [n];
        for (int i = 0; i<n; i++){
            a[i] = scanner.nextInt();
        }
        int t = 0;
        boolean flag = true;
        while(t<=n/2){
            if(a[t]!=a[n-1-t]){
                System.out.println("Khong la mang doi xung");
                flag = false;
                break;
            }
            t++;
        }
        if(flag) System.out.println("La mang doi xung");
    }
}
