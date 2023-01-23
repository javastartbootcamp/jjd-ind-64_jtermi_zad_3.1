package pl.javastart.task;

public class Monitor {

    String producer;
    int sizeInches;
    int refreshRate;

    Monitor () {
            }

    Monitor(String producer, int sizeInches, int refreshRate) {
        this.producer = producer;
        this.sizeInches = sizeInches;
        this.refreshRate = refreshRate;
    }

    void printOut() {
        System.out.println("Dane monitora");
        System.out.println("Producent: " + producer);
        System.out.println("Wielkość matrycy w calach: " + sizeInches);
        System.out.println("Częstotliwość odświeżania: " + refreshRate + "\n");
    }

}
