class Mother {
    public void show() {
        System.out.println("Hello World");
    }
}
class Child extends Mother {
    @Override
    public void show() {
        System.out.println("Hello JUET");
    }
}
public class App {
    public static void main(String[] args) {
        Mother motherObj = new Child();
        motherObj.show();
    }
}
