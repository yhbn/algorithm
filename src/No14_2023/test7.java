package No14_2023;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class test7 {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();

    void zuixiaokaizhi() {
        int a[] = new int[N];
        for (int j = 0; j < N; j++) {
            a[j]=scanner.nextInt();
        }
        Arrays.sort(a);
        int money = 0;
        int m = 0, n = 0;
        int remain=0;
        while (m==0||n==0){
            for (int j = 1; j <= N; j++) {
                if (a[N - j] != 0) {
                    if (m==0){
                        m=a[N-j];
                        a[N - j] = 0;
                    }
                    else if (n==0){
                        n=a[N-j];
                        a[N - j] = 0;
                    }
                    if (m*n!=0) break;
                }
            }
            money = money + m + n;
            int p = m < n ? m / 2 : n / 2;
            m=0;
            n=0;
            for (int k = 1; k < N ; k++) {
                if (a[N - k] != 0 && a[N - k] <= p) {
                    a[N - k] = 0;
                }
            }
            for (int j = 0; j < N-1 ; j++) {
                if (a[j] != 0 ) {
                    remain++;
                }
            }
            if (remain==0||remain==1) break;
            else remain=0;

        }
        for (int j = 0; j < N ; j++) {
            if (a[j] != 0 ) {
                money += a[j];
            }
        }
        System.out.println(money);
    }
}
