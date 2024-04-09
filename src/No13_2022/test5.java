package No13_2022;

import java.util.Scanner;

public class test5 {

    //TODO 满足N!的末尾恰好有K个 0 的最小的N是多少?
    //TODO 如果这样的N不存在输出-1
    void number (){
        Scanner scanner = new Scanner(System.in);
        long k=scanner.nextLong();
        String v="";
        long i=0;
        while (i<k){
            v+="0";
            i++;
        }
        i=1;
        while (!v.equals(jiecheng(i,k))){
            i++;
        }
        System.out.println(i);

    }
    String jiecheng(long a,long k){
        long jie=1l;
        while (a>0){
            jie*=a;
            a--;
        }

        char[] chars = ("" + jie).toCharArray();
        String s="";
        if (chars.length>=k){
            for (int i = chars.length-1; i >chars.length-1-k ; i--) {
                s+=chars[i];
            }
        }

        return s;
    }


}
