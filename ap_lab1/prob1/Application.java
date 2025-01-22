
class Mother {
    int x = 10;
    Mother() {
        System.out.println("Mother's constructor is called");
    }
    void show() {
        System.out.println("Mother's x: " + x);
    }
}
class Child extends Mother {
    Child() {
        System.out.println("Child's constructor is called");
    }
}

public class Application {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show();  
        Child ch = new Child();
        ch.show(); 
    }
}
