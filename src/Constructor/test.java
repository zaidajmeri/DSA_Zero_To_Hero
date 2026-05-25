package Constructor;

public class test {
    public static void main(String[] args){

        // Default Constructor
        Default d = new Default();
        System.out.println(d.getAge());


        //parameterized constructor
        Parameterized p  = new Parameterized("Zaid Khan", 213, 22);
        System.out.println(p.getName());
        System.out.println(p.getRollno());
        System.out.println(p.getAge());
        }

        //CopyConstructor
       public class B {
            copyconstructor ref = new copyconstructor();
            copyconstructor ref2 = new copyconstructor(ref);



        }



    }



