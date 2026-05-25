package InnerClasses.Local_InnerClass;

import javax.print.attribute.HashPrintJobAttributeSet;

public class Test {

    public static void main(String[] args){
        Hotel hotel = new Hotel("Zk Hotel", 15,4);
        hotel.reserve_Room("Jhon Doe ",5);
        hotel.reserve_Room("Jhone Leslie", 10 );


    }
}
