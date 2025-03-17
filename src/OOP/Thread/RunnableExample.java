package OOP.Thread;

public class RunnableExample implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {

            System.out.println(Thread.currentThread().getName() + " - i = " + i);
            try {
                Thread.sleep(1000);  // Dừng 1 giây
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class KetQua {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableExample());
        Thread t2 = new Thread(new RunnableExample());
        Thread t3 = new Thread(new RunnableExample());
        // đặt tên luồng
        t1.setName("Luong 1");
        t2.setName("Luong 2");
        t3.setName("Luong 3");
//DemonThread
        t3.setDaemon(true);
        System.out.println("Luong 3 cung chay...");
        // mức độ ưu tiên
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        // khởi động luồng
        t1.start();
        t2.start();
    }
}