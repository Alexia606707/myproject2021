package fju.a;

public class Tester {
    public static void main(String[] args) {
        Reporter reporter = new Reporter() {
            @Override
            public void print() {
                System.out.println("Ding dong");
            }
        };
        Reporter reporter1 = new Reporter() {
            @Override
            public void print() {
                System.out.println("Hehehe");
            }
        };
        reporter.print();
        reporter1.print();

//        Reporter reporter = new WeatherReporter();
//        Reporter reporter1 = new HeheheReporter();
//        reporter.print();
//        reporter1.print();
    }
}
