package workflowcontrol;

public class Exercises {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int k = (int) Math.floor(i / 100);
            int h = (int) Math.floor(i / 10) - k * 10;
            int t = i - (k * 100 + h * 10);
            if (i == (Math.pow(k, 3) + Math.pow(h, 3) + Math.pow(t, 3))) {
                System.out.println(i);
            }
        }
    }
}
