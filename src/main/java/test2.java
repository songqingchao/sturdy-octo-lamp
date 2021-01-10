import com.songqingchao.Test;

import java.util.ArrayList;

public class test2{

    public static void main(String[] args) {

        sdf.test();

    }
    static test2 sdf=new test2();
    public  synchronized void test(){
        try {
//            test2 a2=new test2();
//            this.wait();

            sdf.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}