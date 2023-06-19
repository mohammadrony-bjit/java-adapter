public class Main {

    public static void main(String[] args) {

        System.out.println("Creating drawable shapes...");
        Drawable drawable = new Drawable();
        drawable.addRectangle(new Rectangle());
        drawable.addCircle(new Circle());

        System.out.println("Drawing...");
        drawable.draw();
        
        System.out.println("Resizing...");
        drawable.resize();
    }

}
