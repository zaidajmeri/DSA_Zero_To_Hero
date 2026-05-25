package Exception_In_Java;

public class null_pointer_Exception {
    public static void main(String[] args){
        String s = null;
        //System.out.println(s.length());



        try{
            System.out.println("Same");
        }
        catch (NullPointerException e){
            System.out.println("Nullpointer Exception catch");
        }
    }


}


