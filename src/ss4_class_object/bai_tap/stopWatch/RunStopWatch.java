package ss4_class_object.bai_tap.stopWatch;

public class RunStopWatch {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        stopwatch.stop();
        System.out.println((stopwatch.getElapsedTime()));
    }
}
