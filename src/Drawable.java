public class Drawable {
    public Drawable() {
        super();
    }

    Shape rectangle1 = new Rectangle();
    Shape circle1 = new Circle();

    public void addRectangle(Shape rectangle){
        rectangle1 = rectangle;
    }

    public void addCircle(Shape circle){
        circle1 = circle;
    }

    public void draw() {
        rectangle1.draw();
        circle1.draw();
    }

    public void resize() {
        rectangle1.resize();
        circle1.resize();
    }
}