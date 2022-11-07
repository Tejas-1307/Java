package Multithreading;

public class ProducerConsumer2 {
    int num;
    boolean value = false;

    public synchronized void getNum() {
        if (!value){
            try {
                wait();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        System.out.println("Get:"+this.num);
        value=false;
        notify();
    }

    public synchronized void setNum(int num) {
        if (value){
            try {
                wait();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        this.num = num;
        System.out.println("Set:"+this.num);
        value=true;
        notify();
    }

}


class main2{
    public static void main(String[] args) {

        ProducerConsumer2 producerConsumer2=new ProducerConsumer2();


        Thread t1 = new Thread(()->{
            int num=0;
            while (true){
                producerConsumer2.setNum(num++);
                producerConsumer2.getNum();

                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();

    }
}


