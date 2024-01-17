package de.schulung.entwurfsmuster.behavioral.lazyload;

public class Calculation {

    private final Lazy<Integer> calculation;

    public Calculation() {
        this.calculation = new Lazy<>(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 42;
        });
    }

    public Integer calculate() {
        return calculation.getValue();
    }

}
