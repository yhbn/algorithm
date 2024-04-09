package No13_2022;

import org.junit.Test;

public class test1 {

    //已知今天是星期六，请问 20 ^{22}天后是周几
    @Test
    public void test(){
        int today =6;
        int day=1;
        for (int i = 0; i < 22; i++) {
            day*=22%7;
        }
        System.out.println(day);
    }
    



}
