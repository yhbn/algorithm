package No13_2022;


import java.util.Arrays;
import java.util.Scanner;


public class test4 {
    void shauti(){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int a[]=new int [N];
        int b[]=new int[N];
        for (int i = 0; i < N; i++) {
           int temp=scanner.nextInt();
            a[i]=temp;
            b[i]=temp;
        }
        Arrays.sort(a);
        int mid=a[N/2];
        //System.out.println(mid);
        int c[]=new int[N];
        for (int i = 0; i < N; i++) {
            if (b[i]>=mid)c[i]=0;
            else c[i] =mid-b[i]+1;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(c[i]);
        }
    }


}
