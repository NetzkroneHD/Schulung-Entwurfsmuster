package de.schulung.entwurfsmuster.structual.adapter;

public class UsbToLightningAdapter extends LightningCharger {

    private final UsbCharger usbCharger;

    public UsbToLightningAdapter(UsbCharger usbCharger) {
        this.usbCharger = usbCharger;
    }

    @Override
    public int givePower() {
        return usbCharger.givePower();
    }
}
