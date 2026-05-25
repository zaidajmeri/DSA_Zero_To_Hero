package InnerClasses.Static_Nested_Class;

import java.awt.color.CMMException;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("Lenovo", "Ideapad 5 ","Win 11");
        computer.getOS().displayInfo();

        Computer.USB usb = new Computer.USB("TYPE C");
        usb.displayInfo(); //calling method
    }
}
