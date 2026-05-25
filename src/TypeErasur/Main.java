package TypeErasur;

public class Main {
    static void main() {
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello");
        String val = stringBox.getValue();
        System.out.println(val);
    }
}