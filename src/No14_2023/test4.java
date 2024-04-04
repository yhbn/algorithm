package No14_2023;

import org.junit.Test;

import java.util.Scanner;

public class test4 {
void area(){
    Scanner sin=new Scanner(System.in);
    int sum=0,chongdie=0;
    int x1=sin.nextInt();
    int y1=sin.nextInt();
    int x2=sin.nextInt();
    int y2=sin.nextInt();
    int x3=sin.nextInt();
    int y3=sin.nextInt();
    int x4=sin.nextInt();
    int y4=sin.nextInt();
    sum=(x2-x1)*(y2-y1)+(x3-x4)*(y3-y4);

    if (x1<x3&&x3<x2){
        if (y1<y3&&y3<y2) chongdie=(x2-x3)*(y2-y3);
        if (y1<y4&&y4<y2) chongdie=(x2-x3)*(y2-y4);
    }
    if (x1<x4&&x4<x2){
        if (y1<y3&&y3<y2) chongdie=(x2-x4)*(y2-y3);
        if (y1<y4&&y4<y2) chongdie=(x2-x4)*(y2-y4);
    }
    if (x1<x3&&x4<x2){
        if (y1<y3&&y3<y2) chongdie=(x4-x3)*(y2-y3);
        if (y1<y4&&y4<y2) chongdie=(x4-x3)*(y2-y4);
    }
    if (x1<y3&&y4<y2){
        if (x1<x3&&x3<x2) chongdie=(x2-x3)*(y4-y3);
        if (x1<y4&&x4<x2) chongdie=(x4-x1)*(y4-y4);
    }
    if (x1<x2&&x2<x3&&x3<x4&&y1<y2&&y2<y3&&y3<y4)
        chongdie=(x3-x4)*(y3-y4);

    if (sum<0)sum=-sum;
    if (chongdie<0)chongdie=-chongdie;
    System.out.println(sum-chongdie);
}

}
