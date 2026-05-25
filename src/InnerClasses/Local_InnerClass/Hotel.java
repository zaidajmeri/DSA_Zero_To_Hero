package InnerClasses.Local_InnerClass;

import javax.xml.validation.Validator;

public class Hotel {
    private String name;
    private int totalRooms;
    private int reservedRooms;

    //making constructor of class
    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void reserve_Room(String guestName, int numOfRooms) {
        class ReservationValidator {
            boolean validate() {
                if (guestName == null || guestName.isBlank()) {
                    System.out.println("Guest name can not be empty");
                    return false;
                }
                if (numOfRooms < 0) {
                    System.out.println("Number of room should be positive");
                }
                if (reservedRooms + numOfRooms > totalRooms) {
                    System.out.println("Not enough rooms available");
                    return false;
                }
                return true;
            }


        }
        ReservationValidator validator = new ReservationValidator();
        if (validator.validate()) {
            reservedRooms += numOfRooms;
            System.out.println("Reservation Confirmed for " + guestName + "for " + numOfRooms + "rooms");
        }
    }
}
