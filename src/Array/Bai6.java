package Array;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float [] a = new float[n];
        for (int i = 0; i< n; i++){
            a[i] = scanner.nextFloat();
        }
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j< n-i-1; j++){
                if(a[j] > a[j+1]){
                    float temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        float x = scanner.nextFloat();
        int indexc = 0;
        boolean flag = true;
        for(int i = 0; i<n-1;i++){
            if(a[i]<=x && a[i+1]>=x){
                flag = false;
                indexc = i+1;
                break;
            }
        }

        if(flag == false){
            for(int i = 0;i<indexc; i++){
                System.out.print(a[i]+ " ");
            }
            System.out.print(x +" ");

            for(int i = indexc;i<n; i++){
                System.out.print(a[i]+ " ");
            }
        } else if (x < a[0]) {
            System.out.print(x+ " ");
            for(int i = 0; i<n; i++){
                System.out.print(a[i] +" ");
            }
        }else {
            for(int i = 0; i<n; i++){
                System.out.print(a[i] +" ");
            }
            System.out.print(x);
        }

    }
}
