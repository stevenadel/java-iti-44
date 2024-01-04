package jets.day4.Shape;

import java.util.ArrayList;

public class Test {
    public static void genericMethod(ArrayList<? extends Shape> shape) {

    }

    public static void main(String[] args) {
        ArrayList<Rectangle> listRectangle = new ArrayList<>();
        listRectangle.add(new Rectangle());

        ArrayList<Circle> listCircle = new ArrayList<>();
        listCircle.add(new Circle());

        genericMethod(listRectangle);
        genericMethod(listCircle);
    }
}
