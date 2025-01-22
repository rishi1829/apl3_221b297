class Mother {
    static void show() {
        System.out.println("Mother's static show method");
    }
}

class Child extends Mother {
    static void show() {
        System.out.println("Child's static show method");
    }
}
public class Application {
    public static void main(String[] args) {
        Mother m1 = new Child();  
        m1.show();  
    }
}
