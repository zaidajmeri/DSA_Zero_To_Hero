package AccessModifiers.Zoo;

public class Dog extends Animal{
    public Dog(String name){
        super(name , "Barks");
    }

    public void wagTail(){
        System.out.println(getName() + "is wagging a tail");

    }

    private String getName(){
        return getClass().getSimpleName();

    }


    //wrapper class for changeSoung()
    public void setDogSound(String newSound){
        changeSound(newSound);
    }


}
