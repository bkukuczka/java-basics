import annotations.Author;

public class ExampleClass {

    @Author(name = "jan", surname = "kowalski")
    public void methodOne() {
        System.out.println("methodOne");
    }

    @Author(name = "janina", surname = "kowalska")
    public void methodTwo() {
        System.out.println("methodTwo");
    }

    @Author
    public void methodThree() {
        System.out.println("methodThree");
    }
}
