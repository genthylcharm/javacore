package OOP.Thread;

public class ThreadExample extends Thread {
    public ThreadExample(String name) {
        super(name);// đặt tên khi khởi tạo
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "- i = " + i);
            try {
                Thread.sleep(1000);  // Dừng 1 giây
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }


}

class InKetQua {
    public static void main(String[] args) {
        ThreadExample s1 = new ThreadExample("Luong 1");
        ThreadExample s2 = new ThreadExample("Luong 2");


        s1.start();
        s2.start();

    }
}