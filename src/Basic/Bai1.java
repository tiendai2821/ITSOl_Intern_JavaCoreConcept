package Basic;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Phan a");
        int sum = 0;
        if (n%2 == 0){
            for (int i = 2; i<=n; i+=2){
                sum += i;
            }
        }else {
            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
        }
        System.out.println(sum);

        System.out.println("Phan b");
        float summ= 0;
        if (n == 0){
            System.out.println("khong the thuc hien voi n = 0");
        }else {
            for (int i = 1; i<=n; i++){
                summ += 1/(float)i;
            }
            System.out.println(summ);
        }
    }
}
