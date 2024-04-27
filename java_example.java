public class MyClass {
    private String name;

    // Constructor
    public MyClass(String name) {
        this.name = name;
    }

    // Method
    public void display() {
        System.out.println("Hello, " + name);
    }

    // Main method
    public static void main(String[] args) {
        MyClass obj = new MyClass("World");
        obj.display();
    }
}
