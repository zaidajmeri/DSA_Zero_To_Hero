package Constructor;

public class copyconstructor {
    int a;
    String b;
    copyconstructor(){
        a = 22;
        b = "Zaid Ajmeri";
        System.out.println(a + " " +b);

    }
    copyconstructor(copyconstructor ref){
        a = ref.a;
        b = ref.b;
        System.out.println(a+" "+b);
    }

//    public static void main(String[] args){
//
//    }


}
