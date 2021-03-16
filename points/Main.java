import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Points> Point = new ArrayList<Points>();

        Point.add(new Points()); // 0, 0
        Point.add(new Points(1, 12)); // 1, 12
        Point.add(new Points(-5, 16)); //5, 16

        System.out.println(Point.toString());
        System.out.println(Point.get(0).getX()); //0
        System.out.println(Point.get(1).getY()); //12
        System.out.println(Point.get(2).getX()); //-5

        System.out.println(Point.get(1).midpoint(Point.get(2))); 
        System.out.println(Point.get(0).slope(Point.get(1)));

        
    }
}
