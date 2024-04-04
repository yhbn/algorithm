package No14_2023;

import java.util.Scanner;

public class test6 {
    Scanner scanner=new Scanner(System.in);
    int N=scanner.nextInt();
    int Maxa,Maxb;
    void tudi(){

        int a[][]=new int[N][N];
        int b[][]=new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j]=scanner.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                b[i][j]=scanner.nextInt();
            }
        }







    }




    void panduan(int a[][]){
        int size=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (a[i][j]==1) size++;
                else break;
                for (int k = j+1; k < N; k++) {
                    if (a[i][k]==1) size++;
                    else break;
                }
                //while ()
            }
        }
    }
}
