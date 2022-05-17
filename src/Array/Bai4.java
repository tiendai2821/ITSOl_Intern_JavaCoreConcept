package Array;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Bai4 {
    private static boolean nto(int n){
        if (n<=1) return false;
        for (int i = 2; i<= sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        int min = 0;
        int minIndex = 0;
        boolean flag = true;
        for(int i = 0; i<n; i++){
            if(nto(a[i])){

                flag = false;
                if(abs(a[i]-x) <= min){
                    min = abs(a[i]-x);
                    minIndex = i;

                }
            }
        }
        if (flag == true){
            System.out.println("Mang a khong co so nguyen to");
        }
        else {
            System.out.println(minIndex);
        }
    }
}
