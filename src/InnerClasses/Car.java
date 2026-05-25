package InnerClasses;


//Member Inner Class Example


//Outer Class
public class Car {
    private String Model;
    private boolean isEngineOn;

    public Car(String Model){
        this.Model =  Model;
        this.isEngineOn = false;
    }


    //Inner class
    class Engine{
        void start(){
                if(!isEngineOn){
                    isEngineOn = true;
                    System.out.println(Model + " Engine Started Succesfully");
                }
                else {
                    System.out.println(Model + "Engine already ON");
                }
        }

        void stop(){
            if(isEngineOn) {
                isEngineOn = false;
                System.out.println(Model + "Engine Stopped Successfully");
            }
            else{
                System.out.println(Model + " Engine already OFF");
            }
        }
    }

}
