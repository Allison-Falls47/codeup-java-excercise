package shapes;

public class ShapesTest {

    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//
//        System.out.println("The Box 1 area: " + box1.getArea());
//        System.out.println("The Box 1 perimeter: " + box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//
//        System.out.println(" The Box 2 area: " + box2.getArea());
//        System.out.println("The Box 2 perimeter: " + box2.getPerimeter());

        Measurable myShape = new Square(5);

//        System.out.println(myShape.getArea());
//        System.out.println(myShape.getPerimeter());

        myShape = new Rectangle(5, 4);


        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }

}
