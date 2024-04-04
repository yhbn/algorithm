package No14_2023;

import org.junit.Test;
//        哈沙德数是指在某个固定的进位制当中，可以被各位数字之和整除的正整
//        数。例如 126 是十进制下的一个哈沙德数，因为 (126) 10 mod (1+2+6) = 0 ；
//        126也是八进制下的哈沙德数，因为 (126) 10 = (176) 8 ， (126) 10 mod (1 + 7 + 6) = 0 ；
//        同时 126 也是 16 进制下的哈沙德数，因为 (126) 10 = (7 e ) 16 ， (126) 10 mod (7 +e ) = 0 。
//        小蓝认为，如果一个整数在二进制、八进制、十进制、十六进制下均为哈沙德数，那么这个数字就是幸运数字，
//        第 1 至第 10 个幸运数字的十进制表示为： 1 , 2 , 4 , 6 , 8 , 40 , 48 , 72 , 120 , 126 . . . 。
//        现在他想知道第 2023 个幸运数字是多少？你只需要告诉小蓝这个整数的十进制表示即可。

public class test2 {
public void jisuan(){

}

public String jinnzhizhuanhuan(int x,int y){//把数字x转换为y进制的数字，只适用于9以内
    StringBuilder str=new StringBuilder();
    while (x>0){
        str.append(x%y);
        x/=y;
    }
    return str.reverse().toString();
}
    @Test
    public void test(){
        String s = Integer.toString(100, 2);
        System.out.println(s);
        String jinnzhizhuanhuan = jinnzhizhuanhuan(100, 2);
        System.out.println(jinnzhizhuanhuan);
    }
}
