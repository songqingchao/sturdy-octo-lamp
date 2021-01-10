public class Test3 {



    public static void main(String[] args) {

         Test3 sdf=new Test3();
         sdf.test();

    }

    public  synchronized void test(){
        try {
            Test3 anotherobject =new Test3();
            anotherobject.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
