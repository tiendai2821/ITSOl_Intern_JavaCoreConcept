package Basic;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b= scanner.nextInt();
        int ucln = 0;
        for (int i = 1; i<=a&& i<=b; i++){
            if(a%i == 0 && b%i == 0){
                ucln = i;
            }
        }
        System.out.println("ucln = "+ ucln);
        System.out.println("bcnn = "+ a*b/ucln);
    }
}
