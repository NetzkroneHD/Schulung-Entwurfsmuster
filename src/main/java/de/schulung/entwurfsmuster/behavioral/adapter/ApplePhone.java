package de.schulung.entwurfsmuster.behavioral.adapter;

public class ApplePhone {

    private int batteryLife;

    public void charge(LightningCharger lightningCharger) {
        this.batteryLife += lightningCharger.givePower();
        System.out.println("Charged ApplePhone via "+lightningCharger.getClass().getSimpleName()+": "+this.batteryLife);
    }

}
