package Basic;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Bai4 {

    private static int ucln(int a,int b){
        int ucln = 1;
        for (int i = 1; i<=a&&i <=b; i++){
            if(a%i == 0 && b%i == 0){
                ucln = i;
            }
        }
        return ucln;
    }
    private static boolean ntocungnhau(int a,int b){
        if(ucln(a,b) == 1) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i<b; i++){
            for (int j = i+1; j<=b; j++){
                if(ntocungnhau(i,j) == true){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
