package de.schulung.entwurfsmuster.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AktienkursChangedEvent {

    private int alterKurs;
    private int neuerKurs;

}
