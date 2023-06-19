public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    public void resize() {
        System.out.println("Resizing Circle");
    }
}