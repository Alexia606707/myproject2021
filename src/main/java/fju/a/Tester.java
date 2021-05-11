package fju.a;

public class Tester {
    public static void main(String[] args) {
        Reporter reporter = new WeatherReporter();
        Reporter reporter1 = new HeheheReporter();
        reporter.print();
        reporter1.print();
    }
}
