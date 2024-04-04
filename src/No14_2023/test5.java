package No14_2023;

import org.junit.Test;

import java.util.Scanner;

public class test5 {
    void A (){
        Scanner sca=new Scanner(System.in);
        int n=sca.nextInt();
        int x[]=new int[n];
        double a[]=new double[n-1];
        double b[]=new double[n-1];
        for (int i = 0; i < n; i++) {
            x[i]=sca.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            a[i]=sca.nextInt();
            b[i]=sca.nextInt();
        }
        double db[][]=new double[2][n+2];
        db[0][0]=x[0];
        db[1][0]=x[0];//1
        db[0][1]= db[0][0]+a[0]/0.7;
        db[1][1]=x[1];//2
        for (int i = 2; i < n; i++) {
            double shangqushang,shangquxia,xiaqushang,xiaquxia;
            shangqushang=(a[i-1]-b[i-2])>0?(a[i-1]-b[i-2])/0.7:-(a[i-1]-b[i-2])/1.3;
            shangquxia=b[i-2]/1.3+x[i]-x[i-1];
            xiaqushang=a[i-1]/0.7;
            xiaquxia=x[i]-x[i-1];
            db[0][i]=db[0][i-1]+shangqushang<db[1][i-1]+xiaqushang?db[0][i-1]+shangqushang:db[1][i-1]+xiaqushang;
            db[1][i]=db[0][i-1]+shangquxia<db[1][i-1]+xiaquxia?db[0][i-1]+shangquxia:db[1][i-1]+xiaquxia;
        }
        db[0][n-1]+=b[n-2]/1.3;
        System.out.printf(   "%.2f", db[0][n-1]<db[1][n-1]?db[0][n-1]:db[1][n-1]);



    }

}
