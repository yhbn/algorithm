package No13_2022;

import org.junit.Test;

/*
这天小明正在学数数。
他突然发现有些正整数的形状像一座“山”，比如 123565321 、 145541 ，它们左右对称（回文）且数位上的数字先单调不减，后单调不增。
小明数了很久也没有数完，他想让你告诉他在区间[2022,202222 2022]中有多少个数的形状像一座“山”。
 */
public class test2 {
   @Test
   public void test(){
       int sum=0;
       for (int i = 2022; i <2022222022 ; i++) {
           int temp=i;
           int j=0;
           int B[]=new int[10];
           while (temp!=0){
               B[j]=temp%10;
               temp=temp/10;
               j++;
           }
           int v=0;
           int low=0;
           int high=9;
           while (B[high]==0){
               high--;
           }
           while (low<high){
               if (B[low]!=B[high]){
                   v=1;
               }
               if (B[low]==B[high]){
                   if (low>0){
                       if (B[low]<B[low-1]){
                           v=1;
                       }
                   }
               }
           }
           if (v==0){
               sum++;
           }
       }
       System.out.println(sum);
   }

}
