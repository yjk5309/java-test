import java.util.ArrayList;

public class TestThread extends Thread { // 또는 implements Runnable로 생성
    int seq;
    public TestThread(int seq) {
        this.seq = seq;
    }
    public void run() {
        System.out.println(this.seq+" thread start.");
        try {
            Thread.sleep(1000);
        }catch(Exception e) {

        }
        System.out.println(this.seq+" thread end.");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<Thread>();
        for(int i=0; i<10; i++) {
            Thread t = new TestThread(i); //Thread t = new Thread(new Test(i));
            t.start();
            threads.add(t);
        }
    
        for(int i=0; i<threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join(); //쓰레드가 종료될 때까지 기다리게 하는 메서드
            }catch(Exception e) {
            }
        }
        System.out.println("main end.");
    }
}
