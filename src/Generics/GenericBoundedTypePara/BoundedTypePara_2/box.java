package Generics.GenericBoundedTypePara.BoundedTypePara_2;

public class box<N extends Number>
{
        private N value;

    public N getValue() {
        return value;
    }

    public void setValue(N value) {
        this.value = value;
    }
}
