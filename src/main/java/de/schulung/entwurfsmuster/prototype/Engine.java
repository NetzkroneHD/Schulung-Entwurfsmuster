package de.schulung.entwurfsmuster.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Engine {

    private int ps;

    @Override
    protected Object clone() {
        return new Engine(ps);
    }
}
