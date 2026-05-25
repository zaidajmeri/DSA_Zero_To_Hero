package Exception_In_Java;

public class Stack_Trace {
    public static void main(String[] args){
        try {
            level1();
        }catch (Exception o){
//            StackTraceElement[] stackTrace =o.getStackTrace();
//            for (int i = 0; i<stackTrace.length; i++){    
//                System.out.println(stackTrace[i]);
//            }
            o.printStackTrace();
        }

    }


    //this method throws an exception ArrayIndexOutOfBoundsException
    public static void level3(){
        int[] array = new  int[5];
        array[5] = 10;
    }

    public static void level2(){
        level3();
    }

    public static void level1(){
        level2();
    }
}
