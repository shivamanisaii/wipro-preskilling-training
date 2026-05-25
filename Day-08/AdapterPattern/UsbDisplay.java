public class UsbDisplay {

    public static void main(String[] args) {

        Usb usb = new Usb();

        HDMI adapter = new UsbToHDMIAdapter(usb);

        adapter.connectHdmi();
    }
}

interface HDMI {

    void connectHdmi();
}

class Usb {

    void connectUsb() {

        System.out.println("Connected with USB device!");
    }
}

class UsbToHDMIAdapter implements HDMI {

    Usb device;

    public UsbToHDMIAdapter(Usb device) {

        this.device = device;
    }

    @Override
    public void connectHdmi() {

        device.connectUsb();
    }
}