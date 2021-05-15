package shipstatus;

public class App {
    public static void main(String[] args) {
        Field f1 = new Field(0, 0, Status.EMPTY);
        Field f2 = new Field(0, 1, Status.EMPTY);
        Field f3 = new Field(0, 2, Status.EMPTY);
        Field f4 = new Field(0, 3, Status.EMPTY);

        f3.setStatus(Status.HIT_SHIP);
    }
}
