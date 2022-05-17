package Array;

import java.util.Scanner;

public class Bai8 {
    public static void nhapmatran(int m,int n,int a[][]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();
    }
    public static int[][] nhanmatran(int m,int n,int k,int a[][],int b[][]){
        int[][] c=new int[50][50];
        for(int i=0;i<m;i++){
            for(int j=0;j<k;j++){
                for(int p=0;p<n;p++)
                    c[i][j]+=a[i][p]*b[p][j];
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n= sc.nextInt();
        int k= sc.nextInt();
        int[][] a=new int[m][n];
        int[][] b=new int[n][k];


        nhapmatran(m,n,a);

        nhapmatran(n,k,b);
        int[][] c=nhanmatran(m,n,k,a,b);
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++)
                System.out.print(c[i][j]+" ");
            System.out.println();
        }

    }

}