package de.schulung.entwurfsmuster.behavioral.lazyload;

import lombok.Getter;

import java.util.function.Supplier;

@Getter
public class Lazy<T> {

    private final Supplier<T> supplier;
    private boolean loaded;
    private T value;

    public Lazy(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T getValue() {
        if (!loaded) {
            value = supplier.get();
            loaded = true;
        }

        return value;
    }

}
