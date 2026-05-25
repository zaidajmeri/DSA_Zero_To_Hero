//package Generics.GenericException;
//
//public class example1 {
//   public static void main() {
//            try {
//                throw new DetailException<Integer>("An error occured", 404);
//            }
//            catch (DetailException<Integer> e){
//                System.out.println(e.getMessage());
//                System.out.println(e.getMessage());
//            }
//    }
//}
//
//
////class DetailException<T> extends Exception {
//    private T detail;
//
//    public DetailException(String message, T detail) {
//        super(message);
//        this.detail = detail;
//    }
//
//    public T getDetail() {
//        return detail;
//    }
//}
//
//
//
