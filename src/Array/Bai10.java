package Array;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] a = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        int tongchinh = 0;
        for(int i = 0; i<n; i++){
            tongchinh += a[i][i];
        }
        int tongphu = 0;

        for(int i = 0; i<n; i++){
            tongphu += a[i][n-i-1];
        }
        System.out.println("Tong chinh: "+ tongchinh+",tong phu: "+tongphu);
    }
}
