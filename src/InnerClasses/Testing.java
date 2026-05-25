package InnerClasses;

import InnerClasses.Static_Nested_Class.Computer;

public class Testing {
    public static void main(String[] args) {
        Car car = new Car("Tata Harrier");
        Car.Engine engine =car.new Engine();
         engine.start();
         engine.stop();




    }

}
