package de.schulung.entwurfsmuster.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Aktie {

    private int kurs;
    private final List<Beobachter> beobachter;

    public Aktie(int kurs) {
        this.kurs = kurs;
        this.beobachter = new ArrayList<>();
    }

    public void addBeobachter(Beobachter beobachter) {
        this.beobachter.add(beobachter);
    }

    public void updateKurs(int kurs) {
        if(this.kurs == kurs) return;

        final AktienkursChangedEvent aktienkursChangedEvent = new AktienkursChangedEvent(this.kurs, kurs);
        this.kurs = kurs;

        System.out.println("Kurs von "+aktienkursChangedEvent.getAlterKurs()+" auf "+aktienkursChangedEvent.getNeuerKurs()+".");

        this.beobachter.forEach(beobachter -> beobachter.onAktienkursChanged(aktienkursChangedEvent));
    }

}
