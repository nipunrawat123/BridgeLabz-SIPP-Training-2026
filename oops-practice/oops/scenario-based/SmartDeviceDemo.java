interface Monitorable {
    void logActivity();

    default void resetData() {
        System.out.println("Activity data has been reset.");
    }
}

interface Analyzable {
    void generateReport();
}

interface Alertable {
    void sendAlert();
}

class SmartDevice implements Monitorable, Analyzable, Alertable {

    @Override
    public void logActivity() {
        System.out.println("Logging daily activity...");
    }

    @Override
    public void generateReport() {
        System.out.println("Generating fitness report...");
    }

    @Override
    public void sendAlert() {
        System.out.println("Sending health alert...");
    }
}

public class SmartDeviceDemo {
    public static void main(String[] args) {

        SmartDevice device = new SmartDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();

        System.out.println("\nMultiple Interface Implementation Demonstrated.");
        System.out.println("SmartDevice implements Monitorable, Analyzable, and Alertable.");
    }
}