package de.schulung.entwurfsmuster.structual.adapter;

public class AdapterPattern {

    public static void run() {

        final ApplePhone applePhone = new ApplePhone();
        final SamsungPhone samsungPhone = new SamsungPhone();

        final LightningCharger lightningCharger = new LightningCharger();
        final UsbCharger usbCharger = new UsbCharger();

        final UsbToLightningAdapter usbToLightningAdapter = new UsbToLightningAdapter(usbCharger);
        final LightningToUsbAdapter lightningToUsbAdapter = new LightningToUsbAdapter(lightningCharger);

        applePhone.charge(lightningCharger);
        samsungPhone.charge(usbCharger);

        applePhone.charge(usbToLightningAdapter);
        samsungPhone.charge(lightningToUsbAdapter);

    }

}
