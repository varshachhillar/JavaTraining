package JavaBasics;

class inde implements Runnable{
    public void run() {
        int i=0;
        for (i = 1; i < 3; i++) {
            System.out.println("id2 "+ i++);
        }
    }

}

public class incrementdecrement implements Runnable {
    public  void run(){
        int j=0;
        for (j =1;j<3;++j){
            System.out.println("id1 "+ ++j);
        }
    }


    public  static void main(String args[]){
        incrementdecrement id1 = new incrementdecrement();
        inde id2 = new inde();
        Thread t1 =new Thread(id1);
        Thread t2 =new Thread(id2);
        t1.start();
        t2.start();

    }
}
