package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Monitor monitor1 = new Monitor("Philips", 27, 60);
        Monitor monitor2 = new Monitor("Samsung", 28, 100);

        monitor1.printOut();
        monitor2.printOut();

    }
}
