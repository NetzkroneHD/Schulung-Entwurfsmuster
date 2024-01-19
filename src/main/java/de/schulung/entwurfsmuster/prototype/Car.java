package de.schulung.entwurfsmuster.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car implements Cloneable {

    private int color;
    private Engine engine;

    @Override
    protected Object clone() {
        return new Car(this.color, (Engine) this.engine.clone());
    }
}
