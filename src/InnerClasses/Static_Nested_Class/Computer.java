package InnerClasses.Static_Nested_Class;

//Static Nested Class Example


import java.lang.management.OperatingSystemMXBean;

public class Computer {
    private String brand;
     private String model;

    private OperatingSystem OS;

    static class USB{
        private String type;

        public USB(String type){
            this.type = type;
        }

        public void displayInfo(){
            System.out.println("USB Type " + type);
        }
    }

    public OperatingSystem getOS() {
        return OS;
    }


    //constructor
    public Computer(String brand, String model, String osName){
        this.brand = brand;
        this.model = model;
        this.OS = new OperatingSystem(osName);
    }




     class OperatingSystem{
        private String osName;

        //making OperatingSystem Constructor
        public OperatingSystem(String osName){
            this.osName = osName;
        }

        public void displayInfo(){
            System.out.println("Computer Model : " + model + "OS : " + osName);
        }
    }

}
