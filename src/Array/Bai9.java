package Array;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][] a = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        int [] b = new int[m*n];
        int index = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                b[index] = a[i][j];
                index ++;
            }
        }
        for(int i = 0; i<index-1; i++){
            for(int j = 0;j <index-i-1; j++){
                if(b[j] >b[j+1]){
                    int temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }
            }
        }
        index = 0;
        for(int i = 0 ; i<n; i++){
            for(int j = 0; j<m; j++){
                a[i][j] = b[index];
                index++;
            }
        }
        for(int i = 0; i< n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
