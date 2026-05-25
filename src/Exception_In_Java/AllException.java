package Exception_In_Java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.classfile.ClassFileVersion;

public class AllException {
    public static void main(String[] args) throws IOException {
        method2();
        System.out.println("File not found");

    }

    //filenot found exception
    public static void method1() throws FileNotFoundException {
        FileReader fileReader = new FileReader("abc.txt");
    }

    //calling method1
    public static void method2() throws FileNotFoundException {
      method1();
    }
}