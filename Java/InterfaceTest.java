interface A {
    void show();

}

class B implements A {
    public void show() {
        System.out.println("Hello there!");

    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        B t = new B();
        t.show();
    }

}