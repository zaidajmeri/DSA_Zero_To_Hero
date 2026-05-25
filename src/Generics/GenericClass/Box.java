    package Generics.GenericClass;

    public class Box<T> {
        private T value;

        public T getValue(){
            return value;
        }
        public void setValue(T value) {
            this.value = value;
            //return 0;

        }
        public void printType(){
            if(value == null){
                System.out.println("No value Stored");
            }
            else {
                System.out.println("Stored type is " + value.getClass().getName());
            }
        }
    }
