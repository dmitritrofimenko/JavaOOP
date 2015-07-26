import com.trofimenkod.lesson3.task1.*;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(new Point(0, 0), new Point(0, 1));
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 4), new Point(3, 0));
        Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(0, 5), new Point(5, 0));
        Board board = new Board();
        board.insertShape(circle, 1);
        board.insertShape(triangle, 2);
        //board.insertShape(rectangle, 3);
       // board.insertShape(circle, 4);
        board.printInformation();
        System.out.println();

        board.deleteShape(4);
        board.deleteShape(3);
        board.deleteShape(2);
        board.printInformation();
    }
}
