package No13_2022;

import org.junit.Test;

public class test3 {


    void lost(String S){
        Byte a='A';
        byte[] sb = S.getBytes();
        Byte b[]=new Byte[26];
        for (int i = 0; i < 26; i++) {
            b[i]=0;
        }
        for (int i = 0; i < sb.length; i++) {
            b[sb[i]-65]++;
        }
        int max=0;
        for (int i = 0; i < 26; i++) {
            if (b[i]>max) max=b[i];
        }
        for (int i = 0; i < 26; i++) {
            if (b[i]==max) {
                char p= (char) (i+'A');
                System.out.print(p);

            }
        }
    }
    @Test
    public void test(){
        lost("BABBACAC");

    }
}
