package com.songqingchao;

import java.io.File;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int   a2=111111111;
        byte  a3=111;
        short a1=111;
        long  a4=11111;

        float a=100.30f;
        double d=1111;
        a=(float)d;
        a=a4;
        a4=(long)a;
        Test t=new Test();
        Object o=new Test();
        t=(Test)o;
        System.out.println(a);
        int[] array=new int[5];
        try{
           array[10]=1;
        }
        catch(Exception e){
            System.out.println("出现了异常");
        }
        ArrayList asdfs=new ArrayList();
        asdfs.add(a2);
        Test test=new Test();
        try {
            test.wait();
        } catch (InterruptedException e) {
            System.out.println("出错了");
        }
    }

}
