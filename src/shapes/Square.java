package shapes;

public class Square extends Rectangle {

    public Square (int side) {
       super(side, side);
    }

@Override
    public int getArea() {
    System.out.println("overdrive area");
        return super.length * super.width;
    }
@Override
    public int getPerimeter() {
        System.out.println("overdrive perimeter");
        return 4 * super.length;
    }

}
