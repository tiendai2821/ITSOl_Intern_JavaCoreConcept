package Basic;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Bai10 {
    private static boolean nto(int n){
        if (n <= 1) return false;
        for(int i = 2; i<=sqrt(n); i++){
            if( n%i == 0) return false;
        }
        return true;
    }
    private static boolean csnto(int n){
        int cs = 0;
        while(n>0){
            cs = n%10;
            if(nto(cs)== false) return false;
            n/=10;
        }
        return true;
    }
    private static int nghichdao(int n){
        int nghichdao = 0;
        while(n>0){
            nghichdao = nghichdao*10 + n%10;
            n/=10;
        }
        return nghichdao;
    }
    public static void main(String[] args) {
        for(int i = 1000000;i<=pow(10,7)-1; i++){
            if(nto(i) && csnto(i)&&nto(nghichdao(i))){
                System.out.println(i);
            }
        }
    }
}
