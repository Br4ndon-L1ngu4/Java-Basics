abstract class Device {public abstract String getSerial();}
abstract class Developer {public abstract void PrintInfo(Device device);}

public class AdvancedSelfChallenge {
    public static void main(String[] args) {
        Developer dev = new Developer() {
            String action = "Coding";
            public void PrintInfo(Device device) {System.out.println(device.getSerial() + "\n" + action);}
        };
        Device device = new Device() {
            public String getSerial() {
                String serial = "29-3523A-0";
                return serial;
            }
        };

        dev.PrintInfo(device);
    }
}