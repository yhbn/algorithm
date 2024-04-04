package No14_2023;

import org.junit.jupiter.api.Test;

//令 S = 1! + 2! + 3! + … + 202320232023! ，求 S 的末尾 9 位数字。
class test1 {

 long jiecheng(long a){
     long temp=1l;
    for (long i=1l;i<=a;i++){
        temp*=i;
        temp=temp%1000000000;
    }
    return temp;
 }

 @Test
 public void test2(){
     System.out.println( jiecheng(10l));
 }

@Test
public void test1() throws InterruptedException {
        long sum=0l;
        for (long i=1;i<=400l;i++){
            sum=sum%1000000000;

            sum=sum+jiecheng(i);
            System.out.println( sum);
        }

}


}