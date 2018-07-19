import java.util.Random;

public class MyRandom {
    Random random = new Random(1000);

    private int randomNumbers() {
        return random.nextInt(100);
    }

    private void printRandomNumbers() {
        System.out.println(randomNumbers() + "\t");
    }
}
