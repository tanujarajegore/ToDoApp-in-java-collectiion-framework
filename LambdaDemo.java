interface Demo {
    void show();
}

public class Main {
    public static void main(String[] args) {

        Demo d1 = new Demo() {
            @Override
            public void show() {
                System.out.println("Hello, How are you?");
            }
        };

        d1.show();
    }
}
