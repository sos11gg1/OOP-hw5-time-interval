package com.example.lib;

public class MyClass {
    public static void main(String[] avg) {
        int H1=4,M1=35,S1=56,H2=1,M2=48,S2=8;
        System.out.println(H1+":"+M1+":"+S1);
        System.out.println(H2+":"+M2+":"+S2);
        System.out.println("相差"+((H1*3600+M1*60+S1)-H2*3600+M2*60+S2)+"秒");
    }
}
