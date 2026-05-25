package com.wipro.Day_eight;

public class UsbAdapter {
    public static void main(String[] args) {

        Usb myUsbDevice = new Usb();

        HDMI adapter = new HdmitoUsb(myUsbDevice);
        
        adapter.connectHdmi();
    }
}

interface HDMI {
    void connectHdmi();
}

class Usb {
    void connectusb() {
        System.out.println("Usb connected through Adapter!");
    }
}

class HdmitoUsb implements HDMI {
    private Usb device;
    
    public HdmitoUsb(Usb device) {
        this.device = device;
    }

    @Override
    public void connectHdmi() {
        device.connectusb();
    }
}