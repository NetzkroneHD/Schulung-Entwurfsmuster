package de.schulung.entwurfsmuster.behavioral.adapter;

public class LightningToUsbAdapter extends UsbCharger {

    private final LightningCharger lightningCharger;

    public LightningToUsbAdapter(LightningCharger lightningCharger) {
        this.lightningCharger = lightningCharger;
    }

    @Override
    public int givePower() {
        return lightningCharger.givePower();
    }
}
