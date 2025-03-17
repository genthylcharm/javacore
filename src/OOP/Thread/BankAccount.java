package OOP.Thread;

public class BankAccount {
    private int taikhoan = 10000;

    public synchronized void Ruttien(int soluong) {
        if (taikhoan >= soluong) {
            System.out.println(Thread.currentThread().getName() + " đang rút " + soluong + "...");
            try {
                Thread.sleep(3000); // Giả lập thời gian xử lý rút tiền
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            taikhoan -= soluong;
            System.out.println(Thread.currentThread().getName() + " rút thành công! Số dư: " + taikhoan);
        } else {
            System.out.println(Thread.currentThread().getName() + " không thể rút " + soluong + "! Số dư không đủ.");
        }
    }
}

// Luồng thực hiện rút tiền
class User extends Thread {
    private BankAccount account;
    private int soluong;

    public User(BankAccount account, String name, int soluong) {
        super(name);
        this.account = account;
        this.soluong = soluong;
    }

    @Override
    public void run() {
        account.Ruttien(soluong);
    }
}

// Chạy chương trình
class In {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        User user1 = new User(account, "Người 1", 7000);
        User user2 = new User(account, "Người 2", 5000);

        user1.start();
        user2.start();
    }
}
