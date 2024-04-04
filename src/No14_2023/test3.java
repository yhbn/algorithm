package No14_2023;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class test3 {
    public int zuheshu(){
        Scanner sin=new Scanner(System.in);

        int sum=0;
        int T=sin.nextInt(),N;

        int length[]=new int[10];
        int[][] num =new int[10][100];
        for (int i=0;i<T;i++){
            N=sin.nextInt();
            length[i]=N;
            for (int j = 0; j < N; j++) {
                num[i][j]=sin.nextInt();
            }
        }
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < length[i]; j++) {
                int sumshuzu=0;
                 sumshuzu=sumshuzu+num[i][j];
                for (int k = 0; k < length[j]; k++) {
                    for (int l = 0;l!=k&& l < length[j]; l++) {
                       // int yaojianqude=num[k];
                    }
                }
            }
        }




        return 0;
    }

    
    @Test
    public void test(){
        
    }
}
