package clientcodes;

public enum Code {
    OPEN(1421), SAVED(1501), TO_PRINT(5101), PRINTED(5102), DEFAULT;

    private int value;

    Code(){
        value = 1;
    }

    Code(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name().replaceAll("_", " ").toLowerCase();
    }
}
