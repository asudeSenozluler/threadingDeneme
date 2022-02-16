public class Main {

    public static void main(String[] args) {

        //thread
        //Thread(new Runnable{})

        islemler i1=new islemler("ilk");
        Thread t1=new Thread(i1);
        islemler i2=new islemler("iki");
        Thread t2=new Thread(i2);

        t1.start();
        t2.start();


    }
}
