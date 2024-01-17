package de.schulung.entwurfsmuster.behavioral.adapter;

public class SamsungPhone {

    private int batteryLife;

    public void charge(UsbCharger usbCharger) {
        this.batteryLife += usbCharger.givePower();
        System.out.println("Charged SamsungPhone via "+usbCharger.getClass().getSimpleName()+": "+this.batteryLife);
    }

}
