package OOP.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        FileInputStream fileInputStream = new FileInputStream(file);

        int c;
        while ((c = fileInputStream.read()) != -1) {
            System.out.print((char) c); // Ép kiểu về char để đọc ký tự
        }

        fileInputStream.close(); // Đóng luồng sau khi sử dụng


        // them vao file
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        String s = " Day la doan them vao";
        fileOutputStream.write(s.getBytes());
        System.out.println("sau khi them vao" + s);
        fileOutputStream.close();
    }
}
