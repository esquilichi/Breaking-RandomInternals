import java.util.Random;
import java.security.SecureRandom;


class Main {
public static void main(String[] args) {
    var time = System.currentTimeMillis();

    for (int i = 0; i < 1000000; i++) {
        var random = new Random();
        random.nextInt();
    }

    System.out.println("Random: " + (System.currentTimeMillis() - time));
    // Measure SecureRandom
    time = System.currentTimeMillis();
    for (int i = 0; i < 1000000; i++) {
        var random = new SecureRandom();
        random.nextInt();
    }
    System.out.println("SecureRandom: " + (System.currentTimeMillis() - time));
    }
}