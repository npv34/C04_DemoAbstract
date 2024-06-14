import src.DriverSSD;
import src.HardDrive;

public class App {
    public static void main(String[] args) {
        HardDrive drive = new DriverSSD("SSD 234", "300GB", "Samsung");
        System.out.println(drive.toString());
    }
}
