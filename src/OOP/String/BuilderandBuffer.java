package OOP.String;

public class BuilderandBuffer {
    public static void main(String[] args) {
        long star, end;

        //StringBuffer
        StringBuffer start1 = new StringBuffer();
        star = System.nanoTime();
        for (int i = 0; i <= 1000; i++) {
            start1.append("a");
        }
        end = System.nanoTime();
    System.out.println("thoi gian chay StringBuffer: " + (end - star) + " ns");
        // StringBuilder
        StringBuilder sb2 = new StringBuilder();
        star = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            sb2.append("a");
        }
        end = System.nanoTime();
        System.out.println("Time taken by StringBuilder: " + (end - star) + " ns");
    }
}

