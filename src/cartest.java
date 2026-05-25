public class cartest {


    public static void main(String[] args){
        Car car = new Car();
        car.color = "Black";
        car.brand = "Toyota";
        car.model = "Fortuner";
        car.year = 2024;
        car.speed = 60;
        System.out.println(car.color);

        car.accelarate(10);
        System.out.println(car.speed);
    }


}
