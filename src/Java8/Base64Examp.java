package Java8;

import java.io.*;
import java.util.Base64;

public class Base64Examp {
    public static void main(String[] args) {
        String test = "Hello Java Base64! ";

        // Mã hóa Base64
        String encodedString = Base64.getEncoder().encodeToString(test.getBytes());
        System.out.println("Sau khi mã hóa: " + encodedString);

        // Giải mã
        byte[] decodeBytes = Base64.getDecoder().decode(encodedString);
        String decodeString = new String(decodeBytes);
        System.out.println("Sau khi giải mã: " + decodeString);
    }
}

// Lớp mã hóa và giải mã Base64 cho URL
class Base64Url {
    public static void main(String[] args) {
        String url = "https://example.com/query?name=Java&value=Base64";

        // Mã hóa URL
        String encodedUrl = Base64.getUrlEncoder().encodeToString(url.getBytes());
        System.out.println("Encoded URL: " + encodedUrl);

        // Giải mã URL
        String decodedUrl = new String(Base64.getUrlDecoder().decode(encodedUrl));
        System.out.println("Decoded URL: " + decodedUrl);
    }
}

// Lớp mã hóa và giải mã Base64 cho File
class Base64FileExample {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("input.txt");

        // Nếu file không tồn tại, tạo file với nội dung mặc định
        if (!inputFile.exists()) {
            try (FileWriter writer = new FileWriter(inputFile)) {
                writer.write("Hello, this is a test file for Base64 encoding.");
            }
            System.out.println("input.txt file created successfully.");
        }

        File outputFile = new File("encoded.txt");

        // Mã hóa File
        try (InputStream inputStream = new FileInputStream(inputFile);
             OutputStream outputStream = Base64.getEncoder().wrap(new FileOutputStream(outputFile))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        }
        System.out.println("File encoded successfully!");

        // Giải mã File
        try (InputStream inputStream = Base64.getDecoder().wrap(new FileInputStream(outputFile));
             OutputStream outputStream = new FileOutputStream("decoded.txt")) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        }
        System.out.println("File decoded successfully!");
    }
}
