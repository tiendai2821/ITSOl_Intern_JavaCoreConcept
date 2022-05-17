package Basic;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Bai6 {
    private static boolean nto(int a){
        if (a<=1) return false;
        for (int i = 2; i<=sqrt(a); i++){
            if (a%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int index = 0;
        for (int i = 2 ; i<= n; i++){
            while(nto(i) && n%i == 0){
                arr[index] = i;
                index ++;
                n/=i;
            }
        }
        for (int i = 0;i<index-1; i++){
            System.out.print(arr[i] + "x");
        }
        System.out.print(arr[index-1]);
    }
}
