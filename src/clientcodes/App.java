package clientcodes;

public class App {
    public static void main(String[] args) {
        Code code = Code.TO_PRINT;

        System.out.println(code.getValue());
        System.out.println(code.name());
        System.out.println(code.toString());
    }
}
